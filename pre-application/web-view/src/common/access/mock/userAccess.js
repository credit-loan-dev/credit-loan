import Mock from 'mockjs'
import {doCustomTimes, getParams} from '@/libs/util'

/**用户登录**/
export const login = req => {
  let paramObj = getParams(req.url);
  let tableData = [];
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
    token:"",
    msg: ''
  }
}

/**用户登出**/
export const logout = req => {
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
