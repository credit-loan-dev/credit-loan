import axios from '@/libs/api.request'

/**分页查询流程job模型**/
export const pagedQueryForworkflowJob = (name,pageIndex,pageSize) => {
  return axios.request({
    url: '/workflowJob/pagedQuery',
    method: 'post',
    params: {
      name: name,
      pageIndex: pageIndex,
      pageSize: pageSize
    }
  })
}

