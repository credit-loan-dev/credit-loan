import axios from '@/libs/api.request'

export const getTableData = () => {
  return axios.request({
    url: 'get_table_data',
    method: 'get'
  })
}

export const getProTableData = (page, rowNums) => {
  return axios.request({
    url: '/product/getAll',
    method: 'post',
    params: {
      page: page,
      rowNums: rowNums
    }
  })
}
export const getCustomRepaymentType = (page, rowNums) => {
  return axios.request({
    url: '/customRepaymentType/getAll',
    method: 'post',
    params: {
      page: page,
      rowNums: rowNums
    }
  })
}
export const getProductAlterApply = (page, rowNums) => {
  return axios.request({
    url: '/productAlterApply/getAll',
    method: 'post',
    params: {
      page: page,
      rowNums: rowNums
    }
  })
}
/**获取对应的产品id下的所有子产品**/

export const getchildProduct = (parentProductId) => {
  return axios.request({
    url: '/getchildProduct/getAll',
    method: 'post',
    params: {
      parentProductId: parentProductId
    }
  })
}
//根据 子产品code 加载子产品的 基础配置信息
export const getchildProductBasicInfo = (productId) => {
  return axios.request({
    url: '/getchildProductBasicInfo/getAll',
    method: 'post',
    params: {
      productId: productId
    }
  })
}
//加载产品授信配置信息
export const getchildProductCreditConfigInfo = (productId) => {
  return axios.request({
    url: '/getchildProductCreditConfigInfo/getAll',
    method: 'post',
    params: {
      productId: productId
    }
  })
}
//加载贷款配置信息
export const getchildProductLoanConfigInfo = (productId) => {
  return axios.request({
    url: '/getchildProductLoanConfigInfo/getAll',
    method: 'post',
    params: {
      productId: productId
    }
  })
}
//加载额度配置信息
export const getchildProductLimitConfigInfo = (productId) => {
  return axios.request({
    url: '/getchildProductLimitConfigInfo/getAll',
    method: 'post',
    params: {
      productId: productId
    }
  })
}
// 根据产品id加载对应的 定价配置列表信息
export const getloanPriceConfigDataList = (page, rowNums,productId) => {
  return axios.request({
    url: '/getloanPriceConfigDataList/getAll',
    method: 'post',
    params: {
      page: page,
      rowNums: rowNums,
      productId: productId
    }
  })
}
