import axios from '@/libs/api.request'

export const listWorkflowJobModels = (name,pageIndex,pageSize) => {
  return axios.request({
    url: '/workflow_manager/config/listWorkflowJobModels',
    method: 'post',
    params: {
      name:name,
      pageIndex: pageIndex,
      pageSize: pageSize
    }
  })
}
