import Mock from 'mockjs'
import { doCustomTimes, getParams } from '@/libs/util'

export const getTableData = req => {
  let tableData = []
  doCustomTimes(5, () => {
    tableData.push(Mock.mock({
      name: '@name',
      email: '@email',
      createTime: '@date'
    }))
  })
  return {
    code: 200,
    data: tableData,
    msg: ''
  }
}
export const getProTableData = req => {
  let paramObj = getParams(req.url)
  console.log(paramObj)
  let tableData = []
  doCustomTimes(paramObj.rowNums, () => {
    tableData.push(Mock.mock({
      code: '@string(10,10)',
      name: '@name',
      typeId: '@string(10,10)',
      priority: '@natural(1,10)',
      creditApplyMaxMonths: '@natural(1,36)',
      creditApplyFlowModleId: '@string',
      creditApplyRejectInfluenceDays: '@natural(1,36)',
      loopQuota: '@boolean',
      increaseQuota: '@boolean',
      minCreditQuota: '@natural(10000,50000)',
      maxCreditQuota: '@natural(100000,500000)',
      quotaEffectiveMonths: '@natural(10000,50000)',
      minSingleLoanAmount: '@natural(10000,50000)',
      maxSingleLoanAmount: '@natural(100000,500000)',
      singleLoanTermType: '@string',
      maxSingleLoanTerm: '@natural(24,36)',
      minSingleLoanTerm: '@natural(1,12)',
      loanFlowModleId: '@string(6,8)',
      effective: '@boolean'
    }))
  })
  return {
    code: 200,
    data: {
      list: tableData,
      total: 100
    },
    msg: ''
  }
}
export const getCustomRepaymentType = req => {
  let paramObj = getParams(req.url)
  console.log(paramObj)
  let tableData = []
  doCustomTimes(paramObj.rowNums, () => {
    tableData.push(Mock.mock({
      repaymentTypeCode: '@string(10,10)',
      repaymentTypeName: '@name',
      componentType: '@string(10,10)',
      state: '@boolean',
      componentescribe: '@string(10,10)',
      registerData: '@date',
      registerPerson: '@name',
      registerOrg: '@name',
      updatePerson: '@name',
      updateOrg: '@name',
      updateData: '@date'
    }))
  })
  return {
    code: 200,
    data: {
      list: tableData,
      total: 20
    },
    msg: ''
  }
}
export const getProductAlterApply = req => {
  let paramObj = getParams(req.url)
  console.log(paramObj)
  let tableData = []
  doCustomTimes(paramObj.rowNums, () => {
    tableData.push(Mock.mock({
      productCode: '@string(10,10)',
      productName: '@name',
      productType: '@string(10,10)',
      registerPerson: '@boolean',
      registerOrg: '@string(10,10)',
      registerData: '@date'
    }))
  })
  return {
    code: 200,
    data: {
      list: tableData,
      total: 20
    },
    msg: ''
  }
}
