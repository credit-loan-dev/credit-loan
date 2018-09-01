<template>
  <div>
    <Card>
        <tables v-on:on-row-dblclick="showDetail" ref="tables" editable searchable search-place="top" v-model="tableData" :columns="columns" @on-delete="handleDelete"/>
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
          <Menu active-name="1-2" :open-names="['1']">
            <Submenu name="1">
              <template slot="title">
                <Icon type="ios-analytics" />
                父产品
              </template>
              <MenuGroup title="父产品下所属子产品">
                <MenuItem name="1-1">子产品 1</MenuItem>
                <MenuItem name="1-2">子产品 2</MenuItem>
                <MenuItem name="1-3">子产品 3</MenuItem>
                <MenuItem name="1-4">子产品 4</MenuItem>
              </MenuGroup>
            </Submenu>
          </Menu>

        </Sider>
        <Layout >
          <Content style="background-color: white">
            <Tabs type="card" size="small">
              <TabPane label="基本配置">
                <BasicProConfig></BasicProConfig>
              </TabPane>
              <TabPane label="产品授信配置">
                <ProductCreditConfig></ProductCreditConfig>
              </TabPane>
              <TabPane label="授信申请input配置">标签二的内容</TabPane>
              <TabPane label="贷款配置">
                <ProductLoanConfig></ProductLoanConfig>
              </TabPane>
              <TabPane label="定价配置">标签三的内容</TabPane>
              <TabPane label="额度配置">
                <LimitConfig></LimitConfig>
              </TabPane>
              <TabPane label="扩展属性配置">标签三的内容</TabPane>
            </Tabs>




              <!--<Input v-model="dataInfo.code" readonly="true" size="small">
              <span slot="prepend" width="200">产品编号</span>
              </Input>
              <Input v-model="dataInfo.name" size="small">
              <span slot="prepend">产品名称</span>
              </Input>
              <Input v-model="dataInfo.typeId" readonly="true" size="small">
              <span slot="prepend">产品类型</span>
              </Input>
              <Input v-model="dataInfo.priority" readonly="true" size="small">
              <span slot="prepend">产品优先级</span>
              </Input>
              <Input v-model="dataInfo.creditApplyMaxMonths" readonly="true" size="small">
              <span slot="prepend">授信申请最大持续月数</span>
              </Input>
              <Input v-model="dataInfo.creditApplyFlowModleId" readonly="true" size="small">
              <span slot="prepend">授信申请流程模型id</span>
              </Input>
              <Input v-model="dataInfo.creditApplyRejectInfluenceDays" readonly="true" size="small">
              <span slot="prepend">授信申请拒绝影响天数</span>
              </Input>
              <Input v-model="dataInfo.loopQuota" readonly="true" size="small">
              <span slot="prepend">是否循环额度</span>
              </Input>
              <Input v-model="dataInfo.increaseQuota" readonly="true" size="small">
              <span slot="prepend">是否支持提高额度</span>
              </Input>
              <Input v-model="dataInfo.minCreditQuota" readonly="true" size="small">
              <span slot="prepend">最小授信额度</span>
              </Input>
              <Input v-model="dataInfo.maxCreditQuota" readonly="true" size="small">
              <span slot="prepend">最大授信额度</span>
              </Input>
              <Input v-model="dataInfo.quotaEffectiveMonths" readonly="true" size="small">
              <span slot="prepend">额度有效月数</span>
              </Input>
              <Input v-model="dataInfo.minSingleLoanAmount" readonly="true" size="small">
              <span slot="prepend">最小单笔贷款金额</span>
              </Input>
              <Input v-model="dataInfo.maxSingleLoanAmount" readonly="true" size="small">
              <span slot="prepend">最大单笔贷款金额</span>
              </Input>
              <Input v-model="dataInfo.singleLoanTermType" readonly="true" size="small">
              <span slot="prepend">单笔贷款期限类型</span>
              </Input>
              <Input v-model="dataInfo.minSingleLoanTerm" readonly="true" size="small">
              <span slot="prepend">最小单笔贷款期限</span>
              </Input>
              <Input v-model="dataInfo.maxSingleLoanTerm" readonly="true" size="small">
              <span slot="prepend">最大单笔贷款期限</span>
              </Input>
              <Input v-model="dataInfo.loanFlowModleId" readonly="true" size="small">
              <span slot="prepend">贷款申请流程模型id</span>
              </Input>
              <Input v-model="dataInfo.effective" readonly="true" size="small">
              <span slot="prepend">是否有效</span>
              </Input>-->

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
import { getProTableData } from '@/api/data'
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
        {
          title: 'Handle',
          key: 'handle',
          options: ['delete'],
          width: 200,
          button: [
            (h, params, vm) => {
              return h('Poptip', {
                props: {
                  confirm: true,
                  title: '你确定要删除吗?'
                },
                on: {
                  'on-ok': () => {
                    vm.$emit('on-delete', params)
                    vm.$emit('input', params.tableData.filter((item, index) => index !== params.row.initRowIndex))
                  }
                }
              }, [
                h('Button', '自定义删除')
              ])
            }
          ]
        }
      ],
      tableData: [],
      dataInfo:{},
      data1: [
        {
          title: 'parent 1',
          expand: true,
          children: [
            {
              title: 'parent 1-1',
              expand: true,
              children: [
                {
                  title: 'leaf 1-1-1'
                },
                {
                  title: 'leaf 1-1-2'
                }
              ]
            },
            {
              title: 'parent 1-2',
              expand: true,
              children: [
                {
                  title: 'leaf 1-2-1'
                },
                {
                  title: 'leaf 1-2-1'
                }
              ]
            }
          ]
        }
      ]
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
