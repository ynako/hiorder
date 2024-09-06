<template>

    <v-data-table
        :headers="headers"
        :items="menu"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MenuView',
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
                { text: "todayOrderCount", value: "todayOrderCount" },
                { text: "accOrderCount", value: "accOrderCount" },
                { text: "isHot", value: "isHot" },
                { text: "imageUrl", value: "imageUrl" },
            ],
            menu : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/menus'))

            temp.data._embedded.menus.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.menu = temp.data._embedded.menus;
        },
        methods: {
        }
    }
</script>

