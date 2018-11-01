<template>
  <div class="tablesPro">

    <!--产品详情弹框-->
    <div>
    <Modal
      v-model="modal1"
      title="产品详情"

      width="90%" scrollable="true"

    >
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
                <ProductLoanConfig :productId="productId" :modal="modal"></ProductLoanConfig>
              </TabPane>
              <TabPane label="定价配置">
                <LoanPriceConfig :productId="productId" ref="LoanPriceConfig"  @showInfo="loanPriceConfigInfo"></LoanPriceConfig>
              </TabPane>
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

      <Modal v-model="modal" width="660" title="定价详情">
        <Collapse >
          <Panel name="1">
            定价基础配置
            <p slot="content">
            <Form :model="loanPriceConfig" :label-width="150">
              <Row>
                <Col span="12">
                  <FormItem label="名称">
                    <Input v-model="loanPriceConfig.name"></Input>
                  </FormItem>
                </Col>
                <Col span="12">
                  <FormItem label="产品id">
                    <Input v-model="loanPriceConfig.productId"></Input>
                  </FormItem>
                </Col>
              </Row>
              <Row>
                <Col span="12">
                  <FormItem label="最小单笔贷款金额">
                    <Input v-model="loanPriceConfig.minSingleLoanAmount"></Input>
                  </FormItem>
                </Col>
                <Col span="12">
                  <FormItem label="最大单笔贷款金额">
                    <Input v-model="loanPriceConfig.maxSingleLoanAmount"></Input>
                  </FormItem>
                </Col>
              </Row>
              <Row>
                <Col span="12">
                  <FormItem label="单笔贷款期限类型">
                    <Input v-model="loanPriceConfig.loanTermType"></Input>
                  </FormItem>
                </Col>
                <Col span="12">
                  <FormItem label="最小单笔贷款期限">
                    <Input v-model="loanPriceConfig.minSingleLoanTerm"></Input>
                  </FormItem>
                </Col>
              </Row>

              <Row>
                <Col span="12">
                  <FormItem label="最大单笔贷款期限">
                    <Input v-model="loanPriceConfig.maxSingleLoanTerm"></Input>
                  </FormItem>
                </Col>
                <Col span="12">
                  <FormItem label="手续费率">
                    <Input v-model="loanPriceConfig.poundageRate"></Input>
                  </FormItem>
                </Col>
              </Row>
              <Row>
                <Col span="12">
                  <FormItem label="还款策略">
                    <Input v-model="loanPriceConfig.repaymentStrategy"></Input>
                  </FormItem>
                </Col>
              </Row>
            </Form>
            </p>
          </Panel>
          <Panel name="2">
            正常还款配置
            <p slot="content">
            <Form :model="loanPriceConfig" :label-width="150">
            <Row>
              <Col span="12">
                <FormItem label="正常利率">
                  <Input v-model="loanPriceConfig.interestRate"></Input>
                </FormItem>
              </Col>
            </Row>
          </Form>
            </p>
          </Panel>
          <Panel name="3">
            合作配置
            <p slot="content">
            <Form :model="loanPriceConfig" :label-width="150">
              <Row>
                <Col span="12">
                  <FormItem label="开启合作">
                    <i-switch v-model="loanPriceConfig.partnerEnable" size="large">
                      <span slot="open">On</span>
                      <span slot="close">Off</span>
                    </i-switch>
                  </FormItem>
                </Col>
                <Col span="12">
                  <FormItem label="合作伙伴id">
                    <Input v-model="loanPriceConfig.partnerId"></Input>
                  </FormItem>
                </Col>
              </Row>
            <Row>
              <Col span="12">
                <FormItem label="贴息利率">
                  <Input v-model="loanPriceConfig.partnerDiscountChargesRate"></Input>
                </FormItem>
              </Col>
            </Row>
            </Form>

            </p>
          </Panel>
          <Panel name="4">
            展期配置
            <p slot="content">
            <Form :model="loanPriceConfig" :label-width="150">
              <Row>
                <Col span="12">
                  <FormItem label="开启展期">
                    <i-switch v-model="loanPriceConfig.loanExtensionEnable" size="large">
                      <span slot="open">On</span>
                      <span slot="close">Off</span>
                    </i-switch>
                  </FormItem>
                </Col>
                <Col span="12">
                  <FormItem label="最大展期次数">
                    <Input v-model="loanPriceConfig.loanExtensionMaxCount"></Input>
                  </FormItem>
                </Col>
              </Row>
              <Row>
                <Col span="12">
                  <FormItem label="最大展期累计期数">
                    <Input v-model="loanPriceConfig.loanExtensionMaxTotalTerm"></Input>
                  </FormItem>
                </Col>
                <Col span="12">
                  <FormItem label="最大展期期数">
                    <Input v-model="loanPriceConfig.loanExtensionMaxTerm"></Input>
                  </FormItem>
                </Col>
              </Row>
            <Row>
              <Col span="12">
                <FormItem label="展期利率">
                  <Input v-model="loanPriceConfig.loanExtensionInterestRate"></Input>
                </FormItem>
              </Col>
            </Row>
            </Form>

            </p>
          </Panel>
          <Panel name="5">
            逾期还款配置
            <p slot="content">
            <Form :model="loanPriceConfig" :label-width="150">
              <Row>
                <Col span="12">
                  <FormItem label="开启逾期">
                    <i-switch v-model="loanPriceConfig.loanOverdueEnable" size="large">
                      <span slot="open">On</span>
                      <span slot="close">Off</span>
                    </i-switch>
                  </FormItem>
                </Col>
                <Col span="12">
                  <FormItem label="最大逾期次数">
                    <Input v-model="loanPriceConfig.loanOverdueMaxCount"></Input>
                  </FormItem>
                </Col>
              </Row>
              <Row>
                <Col span="12">
                  <FormItem label="最大逾期累计期数">
                    <Input v-model="loanPriceConfig.loanOverdueMaxTotalTerm"></Input>
                  </FormItem>
                </Col>
                <Col span="12">
                  <FormItem label="最大逾期期数">
                    <Input v-model="loanPriceConfig.loanOverdueMaxTerm"></Input>
                  </FormItem>
                </Col>
              </Row>
              <Row>
                <Col span="12">
                  <FormItem label="逾期还款利率">
                    <Input v-model="loanPriceConfig.loanOverdueInterestRate"></Input>
                  </FormItem>
                </Col>
              </Row>
            </Form>
            </p>
          </Panel>
          <Panel name="6">
            提前还款配置
            <p slot="content">
            <Form :model="loanPriceConfig" :label-width="150">
            <Row>
              <Col span="12">
                <FormItem label="开启提前还款">
                  <i-switch v-model="loanPriceConfig.earlyRepaymentEnable" size="large">
                    <span slot="open">On</span>
                    <span slot="close">Off</span>
                  </i-switch>
                </FormItem>
              </Col>
              <Col span="12">
                <FormItem label="提前还款利率期限">
                  <Input v-model="loanPriceConfig.earlyRepaymentInterestRate"></Input>
                </FormItem>
              </Col>
            </Row>
          </Form>
            </p>
          </Panel>
        </Collapse>
        <div slot="footer">
        </div>
      </Modal>
    </div>
    <Card>
      <tables v-on:on-row-dblclick="showDetail" ref="tables" editable searchable search-place="top" v-model="tableData" :columns="columns" />
      <br>
      <Page :total="total" :current="page" show-elevator show-total @on-change="onChange" />
    </Card>
  </div>
</template>

<script>
import Tables from '_c/tables'
import { getProTableData,getchildProduct } from '@/api/data'
import BasicProConfig from './basicProConfig'
import  LimitConfig from  './limitConfig'
import  ProductCreditConfig from  './productCreditConfig'
import  ProductLoanConfig from  './productLoanConfig'
import LoanPriceConfig from  './loanPriceConfig'
export default {
  name: 'tables_page',
  components: {
    Tables,
    BasicProConfig,
    LimitConfig,
    ProductCreditConfig,
    ProductLoanConfig,
    LoanPriceConfig
  },
  data () {
    return {
      value1: '1',
      modal:false,
      loanPriceConfig:{},
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
    },
    loanPriceConfigInfo(res,item){
      this.modal= res
      this.loanPriceConfig = item
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
