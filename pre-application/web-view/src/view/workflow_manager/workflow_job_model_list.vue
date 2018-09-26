<template>
  <div>
    <Card>
      <Button type="primary">
        <Icon type="ios-add-circle"/>
        新增流程模型
      </Button> &nbsp;&nbsp;
      <tables ref="tables" searchable search-place="top" v-model="tableData" :columns="columns"/>
      <br>
      <Page :total="totalSize" :current="pageIndex" show-elevator show-total @on-change="onChange"/>
    </Card>
    <!--产品详情弹框-->
  </div>
</template>

<script>
  import Tables from '_c/tables'
  import {pagedQueryWorkflowJob} from '../../api/workflow_manager/workflow_manager_model'

  export default {
    name: 'tables_page',
    components: {
      Tables
    },
    data() {
      return {
        modal1: false,
        name: 1,
        totalSize: 0,
        pageIndex: 1,
        pageSize: 10,
        columns: [
          {title: '产品id', key: 'id',  width: 200},
          {title: '产品名称', key: 'name', width: 200},
          {title: '创建角色', key: 'createRoleId', width: 200},
          {title: '备注', key: 'remarks', width: 100},
          {title: '数据版本', key: 'version', width: 100},
          {title: '更新用户', key: 'updateUserId', width: 100},
          {title: '更新时间', key: 'updateDate', width: 100},
          {title: '录入用户', key: 'createUserId', width: 200},
          {title: '录入时间', key: 'createDate', width: 200}
        ],
        tableData: [],
        dataInfo: {}
      }
    },
    methods: {
      onChange(rows) {
        this.pageIndex = rows;
        this.mockTableData();
      },
      mockTableData() {
        this.$Loading.start();
        pagedQueryWorkflowJob(this.name,this.pageIndex, this.pageSize).then(res => {
          this.$Loading.finish();
          this.totalSize = res.data.total;
          this.tableData = res.data.list;
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
      pagedQueryWorkflowJob(this.name,this.pageIndex, this.pageSize).then(res => {
        this.tableData = res.data.list
        this.totalSize = res.data.total
      })
    }
  }
</script>

<style>
  span {
    width: 200px;
  }
</style>
