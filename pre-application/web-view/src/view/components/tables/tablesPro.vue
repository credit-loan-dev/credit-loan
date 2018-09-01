<template>
  <div>
    <Card>
        <tables v-on:on-row-dblclick="showDetail" ref="tables" editable searchable search-place="top" v-model="tableData" :columns="columns" />
      <br>
      <Page :total="total" :current="page" show-elevator show-total @on-change="onChange" />
    </Card>
    <!--产品详情弹框-->
    <div>
    <Modal
      v-model="modal1"
      title="产品详情"
      @on-ok="ok"
      @on-cancel="cancel"
      draggable="true"
      width="90%" scrollable="true">
      <Layout >
        <Sider width=240 style="background-color: white">
          <Menu active-name="1-2" :open-names="['1']" @on-select="showProductInfo" @on-open-change="showParentProInfo">
            <Submenu :name="proData.proParentData.code">
              <template slot="title">
                <Icon type="ios-analytics" />
                {{proData.proParentData.name}}
              </template>
              <MenuGroup title="父产品下所属子产品">

                <MenuItem :name="item.productCode" v-for="(item,key) in proData.proChildData" >
                  {{item.productName}}
                </MenuItem>

              </MenuGroup>
            </Submenu>
          </Menu>

        </Sider>
        <Layout >
          <Content style="background-color: white">
            <Tabs type="card" size="small">
              <TabPane label="基本配置">
                <BasicProConfig :productId="productId"></BasicProConfig>
              </TabPane>
              <TabPane label="产品授信配置">
                <ProductCreditConfig :productId="productId"></ProductCreditConfig>
              </TabPane>
              <TabPane label="授信申请input配置">标签二的内容</TabPane>
              <TabPane label="贷款配置">
                <ProductLoanConfig :productId="productId"></ProductLoanConfig>
              </TabPane>
              <TabPane label="定价配置">标签三的内容</TabPane>
              <TabPane label="额度配置">
                <LimitConfig :productId="productId"></LimitConfig>
              </TabPane>
              <TabPane label="扩展属性配置">标签三的内容</TabPane>
            </Tabs>
          </Content>

        </Layout>
      </Layout>
      <div slot="footer">
      </div>
    </Modal>
    </div>
  </div>
</template>

<script>
import Tables from '_c/tables'
import { getProTableData,getchildProduct } from '@/api/data'
import BasicProConfig from './basicProConfig'
import  LimitConfig from  './limitConfig'
import  ProductCreditConfig from  './productCreditConfig'
import  ProductLoanConfig from  './productLoanConfig'
export default {
  name: 'tables_page',
  components: {
    Tables,
    BasicProConfig,
    LimitConfig,
    ProductCreditConfig,
    ProductLoanConfig
  },
  data () {
    return {
      productId:'',
      modal1: false,
      total: 0,
      page: 1,
      rowNums: 10,
      columns: [
        {title: '产品编号', key: 'code', sortable: true, width: 100},
        {title: '产品名称', key: 'name', editable: true, width: 100},
        {title: '产品类型', key: 'typeId', width: 100},
        {title: '产品优先级', key: 'priority', sortable: true, width: 100},
        {title: '授信申请最大持续月数', key: 'creditApplyMaxMonths', width: 200},
        {title: '授信申请流程模型id', key: 'creditApplyFlowModleId', width: 200},
        {title: '授信申请拒绝影响天数', key: 'creditApplyRejectInfluenceDays', width: 200},
        {title: '是否循环额度', key: 'loopQuota', width: 100},
        {title: '是否支持提高额度', key: 'increaseQuota', width: 200},
        {title: '最小授信额度', key: 'minCreditQuota', width: 100},
        {title: '最大授信额度', key: 'maxCreditQuota', width: 100},
        {title: '额度有效月数', key: 'quotaEffectiveMonths', width: 100},
        {title: '最小单笔贷款金额', key: 'minSingleLoanAmount', width: 200},
        {title: '最大单笔贷款金额', key: 'maxSingleLoanAmount', width: 200},
        {title: '单笔贷款期限类型', key: 'singleLoanTermType', width: 200},
        {title: '最小单笔贷款期限', key: 'minSingleLoanTerm', width: 200},
        {title: '最大单笔贷款期限', key: 'maxSingleLoanTerm', width: 200},
        {title: '贷款申请流程模型id', key: 'loanFlowModleId', width: 200},
        {title: '是否有效', key: 'effective', width: 100},

      ],
      tableData: [],
      dataInfo:{},
      proData:{
        proChildData:[],
        proParentData:{}
      }
    }
  },
  methods: {
    handleDelete (params) {
      console.log(params)
    },
    exportExcel () {
      this.$refs.tables.exportCsv({
        filename: `table-${(new Date()).valueOf()}.csv`
      })
    },
    onChange (rows) {
      this.page = rows
      this.mockTableData()
    },
    mockTableData () {
      this.$Loading.start()
      getProTableData(this.page, this.rowNums).then(res => {
        this.$Loading.finish()
        this.total = res.data.total
        this.tableData = res.data.list
      })
    },
    showDetail(item){
      this.modal1 = !this.modal1
      this.dataInfo = item
      getchildProduct(this.dataInfo.code).then(res=>{
        console.log(res)
          this.proData.proChildData = res.data.list //子产品数据
          this.proData.proParentData = item;        // 父产品数据
      }).error(err=>{

      })
    },
    showProductInfo(name){
      this.productId = name;
    },
    showParentProInfo(name){
      this.productId = name[0];
    }
  },
  mounted () {
    getProTableData(this.page, this.rowNums).then(res => {
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
