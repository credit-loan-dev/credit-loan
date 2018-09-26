import Mock from 'mockjs'
import {doCustomTimes, getParams} from '@/libs/util'

/**分页查询流程job模型mock**/
export const pagedQueryForworkflowJob = req => {
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
