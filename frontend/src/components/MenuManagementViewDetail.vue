<template>

    <v-card outlined>
        <v-card-title>
            MenuManagement # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="MenuId" v-model="item.menuId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="MenuName" v-model="item.menuName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Description" v-model="item.description" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Price" v-model="item.price" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="IsAvailable" v-model="item.isAvailable" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Category" v-model="item.category" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Discount" v-model="item.discount" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ImageUrl" v-model="item.imageUrl" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'MenuManagementViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/menuManagements/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

