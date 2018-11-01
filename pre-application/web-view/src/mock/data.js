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
  doCustomTimes(paramObj.rowNums, () => {getProTableData
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
export const getchildProduct = req => {
  let paramObj = getParams(req.url)
  console.log(paramObj)
  let tableData = []
  doCustomTimes(5, () => {
    tableData.push(Mock.mock({
      productCode: '@string(10,10)',
      productName: '@name'
    }))
  })
  return {
    code: 200,
    data: {
      list: tableData,
      total: 5
    },
    msg: ''
  }
}

export const getchildProductBasicInfo = req => {
  let paramObj = getParams(req.url)
  let tableData = {}
  doCustomTimes(1, () => {
    tableData =(Mock.mock({
      productId: paramObj.productId,
      name: '@name',
      typeId:'@integer(1, 4)',
      priority:'@integer(1, 4)',
      expireDate:'@date(yyyy-MM-dd)',
      effectiveDate:'@date(yyyy-MM-dd)',
      effective:'@boolean',
      textarea:'@csentence'
    }))
  })
  return {
    code: 200,
    data: {
      item: tableData,
      total: 1
    },
    msg: ''
  }
}

export const getchildProductCreditConfigInfo = req => {
  let paramObj = getParams(req.url)
  let tableData = {}
  doCustomTimes(1, () => {
    tableData =(Mock.mock({
      productId: paramObj.productId,
      useBlacklistGroupId: '@name',
      applyMutexType:'@integer(1, 4)',
      minCreditlLimit:'@integer(10000, 50000)',
      maxCreditlLimit:'@integer(300000, 500000)',
      limitValidMonths:'@integer(1, 36)',
      applyMaxMonthDuration:'@integer(1, 36)',
      applyMaxDayDuration:'@integer(1, 36)',
      flowJobModleId:'@id'
    }))
  })
  return {
    code: 200,
    data: {
      item: tableData,
      total: 1
    },
    msg: ''
  }
}

export const getchildProductLoanConfigInfo = req => {
  let paramObj = getParams(req.url)
  let tableData = {}
  doCustomTimes(1, () => {
    tableData =(Mock.mock({
      productId: paramObj.productId,
      minSingleLoanAmount: '@integer(10000, 30000)',
      maxSingleLoanAmount:'@integer(100000, 500000)',
      loanTermType:'@string(6, 6)',
      minSingleLoanTerm:'@integer(3, 50)',
      maxSingleLoanTerm:'@integer(1, 36)'
    }))
  })
  return {
    code: 200,
    data: {
      item: tableData,
      total: 1
    },
    msg: ''
  }
}

export const getchildProductLimitConfigInfo = req => {
  let paramObj = getParams(req.url)
  let tableData = {}
  doCustomTimes(paramObj.rowNums, () => {
    tableData =(Mock.mock({
      productId: paramObj.productId,
      type: '@string(6, 6)',
      ratio:'@integer(10, 100)',
      riskLevel:'@integer(1, 10)',
      linkCustomerBaseCreditlimit:'@boolean',
      loopCreditlimit:'@boolean',
      increaseCreditlimit:'@boolean',
      decreaseCreditlimit:'@boolean',
    }))
  })
  return {
    code: 200,
    data: {
      item: tableData,
      total: 1
    },
    msg: ''
  }
}
export const getloanPriceConfigDataList = req => {
  let paramObj = getParams(req.url)
  let tableData = []
  doCustomTimes(paramObj.rowNums, () => {
    tableData.push(Mock.mock({
      productId: paramObj.productId,
      name: '@string(6, 6)',
      repaymentStrategy:'@string(6, 6)',
      minSingleLoanAmount:'@integer(20000, 50000)',
      maxSingleLoanAmount:'@integer(200000, 500000)',
      loanTermType:'@integer(1,3)',
      loanOverdueMaxCount:'@integer(1,3)',
      loanOverdueMaxTotalTerm:'@integer(1,3)',
      loanOverdueMaxTerm:'@integer(1,3)',
      minSingleLoanTerm:'@integer(1,12)',
      maxSingleLoanTerm:'@integer(12,36)',
      loanExtensionMaxCount:'@integer(2,4)',
      loanExtensionMaxTotalTerm:'@integer(2,4)',
      loanExtensionMaxTerm:'@integer(2,4)',
      poundageRate:'@float(1,10 , 2, 2)',
      interestRate:'@float(1,5 , 2, 2)',
      partnerDiscountChargesRate:'@float(1,5 , 2, 2)',
      loanExtensionInterestRate:'@float(1,5 , 2, 2)',
      loanOverdueInterestRate:'@float(1,5 , 2, 2)',
      earlyRepaymentInterestRate:'@float(1,5 , 2, 2)',
      partnerEnable:'@boolean',
      partnerId:'@id',
      loanExtensionEnable:'@boolean',
      loanOverdueEnable:'@boolean',
      earlyRepaymentEnable:'@boolean',
    }))
  })
  return {
    code: 200,
    data: {
      list: tableData,
      total: 10
    },
    msg: ''
  }
}
