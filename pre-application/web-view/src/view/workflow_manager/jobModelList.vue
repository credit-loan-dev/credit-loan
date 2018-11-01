<template>
  <div>
    <Card>
      <Button type="primary" ><Icon type="ios-add-circle" />新增</Button> &nbsp;&nbsp;
        <tables v-on:on-row-dblclick="showDetail" ref="tables" editable searchable search-place="top" v-model="tableData" :columns="columns" @on-delete="handleDelete"/>
      <br>
      <Page :total="total" :current="pageIndex" show-elevator show-total @on-change="onChange" />
    </Card>
    <!--产品详情弹框-->
    <div>
    <Modal
      v-model="modal1"
      title="产品详情"
      width="500px" scrollable="true">
      <Input v-model="dataInfo.id" readonly="true" size="small">
      <span slot="prepend" width="200">流程编号</span>
      </Input>
      <Input v-model="dataInfo.name" size="small">
      <span slot="prepend">流程名称</span>
      </Input>
      <Input v-model="dataInfo.createRoleId" readonly="true" size="small">
      <span slot="prepend">创建角色</span>
      </Input>
      <Input v-model="dataInfo.remarks" readonly="true" size="small">
      <span slot="prepend">备注</span>
      </Input>
      <Input v-model="dataInfo.version" readonly="true" size="small">
      <span slot="prepend">数据版本</span>
      </Input>
      <Input v-model="dataInfo.updateUserId" readonly="true" size="small">
      <span slot="prepend">更新用户</span>
      </Input>
      <Input v-model="dataInfo.updateDate" readonly="true" size="small">
      <span slot="prepend">更新时间</span>
      </Input>
      <Input v-model="dataInfo.createUserId" readonly="true" size="small">
        <span slot="prepend">创建用户</span>
      </Input>
      <Input v-model="dataInfo.createDate" readonly="true" size="small">
        <span slot="prepend">创建时间</span>
      </Input>
    </Modal>
    </div>
  </div>
</template>

<script>
import Tables from '_c/tables'
import { listWorkflowJobModels } from '@/api/workflow_manager/workflowConfigService'
export default {
  name: 'tables_page',
  components: {
    Tables
  },
  data () {
    return {
      modal1: false,
      total: 0,
      name: 1,
      pageIndex: 1,
      pageSize: 10,
      columns: [
        {title: '流程编号', key: 'id',width: 100},
        {title: '流程名称', key: 'name', width: 100},
        {title: '创建角色', key: 'createRoleId', width: 100},
        {title: '备注', key: 'remarks',width: 100},
        {title: '数据版本', key: 'version', width: 200},
        {title: '更新用户', key: 'updateUserId', width: 200},
        {title: '更新时间', key: 'updateDate', width: 200},
        {title: '创建用户', key: 'createUserId', width: 100},
        {title: '创建时间', key: 'createDate', width: 200}
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
      listWorkflowJobModels(this.name,this.pageIndex, this.pageSize).then(res => {
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
      this.$Message.info('Clicked ok');
    },
    cancel () {
      this.$Message.info('Clicked cancel');
    }
  },
  mounted () {
    listWorkflowJobModels(this.name,this.pageIndex, this.pageSize).then(res => {
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
