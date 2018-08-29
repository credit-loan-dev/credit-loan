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
