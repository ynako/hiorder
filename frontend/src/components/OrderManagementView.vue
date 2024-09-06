<template>

    <v-data-table
        :headers="headers"
        :items="orderManagement"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrderManagementView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "orderMenuId", value: "orderMenuId" },
                { text: "orderId", value: "orderId" },
                { text: "menuId", value: "menuId" },
                { text: "quantity", value: "quantity" },
                { text: "menuStatus", value: "menuStatus" },
            ],
            orderManagement : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/orderManagements'))

            temp.data._embedded.orderManagements.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.orderManagement = temp.data._embedded.orderManagements;
        },
        methods: {
        }
    }
</script>

