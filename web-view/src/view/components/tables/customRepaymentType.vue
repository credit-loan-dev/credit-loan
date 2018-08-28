<template>
  <div>
    <Card>
      <Button type="primary" ><Icon type="ios-add-circle" />新增</Button> &nbsp;&nbsp;
      <Button type="primary"><Icon type="ios-build" />编辑</Button>&nbsp;&nbsp;
      <Button type="warning"><Icon type="md-checkmark" />启用</Button>&nbsp;&nbsp;
      <Button type="warning"><Icon type="md-close" />停用</Button>
        <tables  ref="tables"  searchable search-place="top" v-model="tableData" :columns="columns" />
      <br>
      <Page :total="total" :current="page" show-elevator show-total @on-change="onChange" />
    </Card>
    <!--产品详情弹框-->
  </div>
</template>

<script>
import Tables from '_c/tables'
import { getCustomRepaymentType } from '@/api/data'
export default {
  name: 'tables_page',
  components: {
    Tables
  },
  data () {
    return {
      modal1: false,
      total: 0,
      page: 1,
      rowNums: 10,
      columns: [
        {title: '还款方式编号', key: 'repaymentTypeCode', sortable: true, width: 200},
        {title: '还款方式名称', key: 'repaymentTypeName', editable: true, width: 200},
        {title: '组件类型', key: 'componentType', width: 100},
        {title: '状态', key: 'state', sortable: true, width: 100},
        {title: '组件描述', key: 'componentescribe', width: 200},
        {title: '登记日期', key: 'registerData', width: 200},
        {title: '登记人', key: 'registerPerson', width: 200},
        {title: '登记机构', key: 'registerOrg', width: 100},
        {title: '更新人', key: 'updatePerson', width: 200},
        {title: '更新机构', key: 'updateOrg', width: 100},
        {title: '更新时间', key: 'updateData', width: 100}
      ],
      tableData: [],
      dataInfo:{}
    }
  },
  methods: {
    onChange (rows) {
      this.page = rows
      this.mockTableData()
    },
    mockTableData () {
      this.$Loading.start()
      getCustomRepaymentType(this.page, this.rowNums).then(res => {
        this.$Loading.finish()
        this.total = res.data.total
        this.tableData = res.data.list
      })
    },
    showDetail(item){
      this.modal1 = !this.modal1
      this.dataInfo = item
      console.log(item)
    },
    ok () {
      this.$Message.info('Clicked ok')
    },
    cancel () {
      this.$Message.info('Clicked cancel')
    }
  },
  mounted () {
    getCustomRepaymentType(this.page, this.rowNums).then(res => {
      this.tableData = res.data.list
      this.total = res.data.total
    })
  }
}
</script>

<style>
  span{
    width: 200px;
  }
</style>
