<template>
  <div>
    <Card>
      <Button type="primary">
        <Icon type="ios-add-circle"/>
        新增流程模型
      </Button> &nbsp;&nbsp;
      <tables ref="tables" searchable search-place="top" v-model="tableData" :columns="columns"/>
      <br>
      <Page :total="total" :current="page" show-elevator show-total @on-change="onChange"/>
    </Card>
    <!--产品详情弹框-->
  </div>
</template>

<script>
  import Tables from '_c/tables'
  import {pagedQueryForworkflowJob} from '@/workflow_manager/client/workflow_config'

  export default {
    name: 'tables_page',
    components: {
      Tables
    },
    data() {
      return {
        modal1: false,
        total: 0,
        name: null,
        pageIndex: 1,
        pageSize: 10,
        columns: [
          {title: '流程名称', key: 'productCode', sortable: true, width: 200},
          {title: '创建角色', key: 'productName', editable: true, width: 200},
          {title: '备注', key: 'productType', width: 100},
          {title: '数据版本', key: 'registerPerson', width: 100},
          {title: '数据更新用户', key: 'registerOrg', width: 200},
          {title: '数据更新时间', key: 'registerData', width: 200},
          {title: '数据录入用户', key: 'registerOrg', width: 200},
          {title: '数据录入时间', key: 'registerData', width: 200}
        ],
        tableData: [],
        dataInfo: {}
      }
    },
    methods: {
      onChange(rows) {
        this.page = rows
        this.mockTableData()
      },
      mockTableData() {
        this.$Loading.start()
        getProductAlterApply(this.page, this.rowNums).then(res => {
          this.$Loading.finish()
          this.total = res.data.total
          this.tableData = res.data.list
        })
      },
      showDetail(item) {
        this.modal1 = !this.modal1
        this.dataInfo = item
        console.log(item)
      },
      ok() {
        this.$Message.info('Clicked ok')
      },
      cancel() {
        this.$Message.info('Clicked cancel')
      }
    },
    mounted() {
      getProductAlterApply(this.page, this.rowNums).then(res => {
        this.tableData = res.data.list
        this.total = res.data.total
      })
    }
  }
</script>

<style>
  span {
    width: 200px;
  }
</style>
