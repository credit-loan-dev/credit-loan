import Mock from 'mockjs'
import {doCustomTimes, getParams} from '@/libs/util'

export const pagedQueryWorkflowJob = req => {
  let tableData = [];
  doCustomTimes(5, () => {
    tableData.push(Mock.mock({
      id: '@id',
      name: '@name',
      createRoleId: '@createRoleId',
      remarks: '@remarks',
      version: '@version',
      updateUserId: '@updateUserId',
      updateDate: '@updateDate',
      createUserId: '@createUserId',
      createDate: '@createDate'
    }))
  });
  return {
    code: 200,
    data: tableData,
    msg: ''
  }
};

