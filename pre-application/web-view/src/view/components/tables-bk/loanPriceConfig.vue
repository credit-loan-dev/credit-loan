<template>
  <div class="loanPriceConfig">

    <Card >
      <Table :loading="loading" v-on:on-row-dblclick="showDetail"  editable searchable search-place="top" :data="tableData" :columns="columns" />
      <br>
      <Page :total="total" :current="page" :page-size="rowNums" show-elevator show-total @on-change="onChange" />

    </Card>



  </div>

</template>
<script>

  import { getloanPriceConfigDataList } from '@/api/data'
export default {
  props:['productId','modal'],
  data(){
    return{
      loading:true,
      productId:this.productId,
      modal:this.modal,
      total: 0,
      page: 1,
      rowNums: 5,
      columns: [
        {title: '产品编号', key: 'productId', sortable: true, width: 180},
        {title: '产品名称', key: 'name',  width: 100},
        {title: '还款策略', key: 'repaymentStrategy', width: 100},
        {title: '最小单笔贷款金额', key: 'minSingleLoanAmount', sortable: true, width: 200},
        {title: '最大单笔贷款金额', key: 'maxSingleLoanAmount', width: 200},
        {title: '单笔贷款期限类型', key: 'loanTermType', width: 200},
        {title: '最小单笔贷款期限', key: 'minSingleLoanTerm', width: 200},
        {title: '最大单笔贷款期限', key: 'maxSingleLoanTerm', width: 100},
        {title: '手续费率', key: 'poundageRate', width: 200},
        {title: '正常利率', key: 'interestRate', width: 100},
        {title: '开启合作', key: 'partnerEnable', width: 100},
        {title: '合作伙伴id', key: 'partnerId', width: 200},
        {title: '贴息利率', key: 'partnerDiscountChargesRate', width: 200},
        {title: '开启展期', key: 'loanExtensionEnable', width: 200},
        {title: '最大展期次数', key: 'loanExtensionMaxCount', width: 200},
        {title: '最大展期累计期数', key: 'loanExtensionMaxTotalTerm', width: 200},
        {title: '最大展期期数', key: 'loanExtensionMaxTerm', width: 200},
        {title: '展期利率', key: 'loanExtensionInterestRate', width: 200},
        {title: '开启逾期', key: 'loanOverdueEnable', width: 100},
        {title: '最大逾期次数', key: 'loanOverdueMaxCount', width: 200},
        {title: '最大逾期累计期数', key: 'loanOverdueMaxTotalTerm', width: 200},
        {title: '最大逾期期数', key: 'loanOverdueMaxTerm', width: 100},
        {title: '逾期还款利率', key: 'loanOverdueInterestRate', width: 100},
        {title: '开启提前还款', key: 'earlyRepaymentEnable', width: 100},
        {title: '提前还款利率期限', key: 'earlyRepaymentInterestRate', width: 200}
      ],
      tableData: [],
      dataInfo:{}
    }
  },watch: {
    productId:{
      handler(curVal,oldVal){
        getloanPriceConfigDataList(this.page, this.rowNums,curVal).then(res => {
          this.tableData = res.data.list
          this.total = res.data.total
          this.loading = false
        }).error(err=>{

        })
      },
      deep: true,
    }
  },methods:{
    onChange (rows) {
      this.page = rows
      this.mockTableData()
    },
    mockTableData () {
      this.loading = true
      getloanPriceConfigDataList(this.page, this.rowNums,this.productId).then(res => {
        this.loading = false
        this.total = res.data.total
        this.tableData = res.data.list
      })
    },
    showDetail(item){
      this.$emit('showInfo',true,item);

    }
  }
}
</script>
<style>

</style>
