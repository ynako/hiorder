<template>

    <v-card outlined>
        <v-card-title>
            OrderManagement # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="OrderMenuId" v-model="item.orderMenuId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="OrderId" v-model="item.orderId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="MenuId" v-model="item.menuId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Quantity" v-model="item.quantity" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="MenuStatus" v-model="item.menuStatus" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'OrderManagementViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/orderManagements/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

