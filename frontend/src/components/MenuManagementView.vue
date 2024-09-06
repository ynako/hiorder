<template>

    <v-data-table
        :headers="headers"
        :items="menuManagement"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MenuManagementView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "menuId", value: "menuId" },
                { text: "menuName", value: "menuName" },
                { text: "description", value: "description" },
                { text: "price", value: "price" },
                { text: "isAvailable", value: "isAvailable" },
                { text: "category", value: "category" },
                { text: "discount", value: "discount" },
                { text: "imageUrl", value: "imageUrl" },
            ],
            menuManagement : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/menuManagements'))

            temp.data._embedded.menuManagements.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.menuManagement = temp.data._embedded.menuManagements;
        },
        methods: {
        }
    }
</script>

