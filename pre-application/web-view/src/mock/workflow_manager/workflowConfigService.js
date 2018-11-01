import Mock from 'mockjs'
import { doCustomTimes, getParams } from '@/libs/util'

export const listWorkflowJobModels = req => {
  let paramObj = getParams(req.url)
  let tableData = []
  doCustomTimes(paramObj.pageSize, () => {
    tableData.push(Mock.mock({
      id: '@string(10,10)',
      name: '@name',
      createRoleId: '@string(10,10)',
      remarks: '@string(10,10)',
      version: '@natural(1,36)',
      updateUserId: '@string',
      updateDate: '@string(6,8)',
      createUserId: '@string(6,8)',
      createDate: '@string(6,8)'
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
