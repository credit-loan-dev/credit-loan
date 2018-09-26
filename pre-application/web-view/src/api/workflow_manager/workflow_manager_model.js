import axios from '@/libs/api.request'

export const pagedQueryWorkflowJob = (name, pageIndex, pageSize) => {
  return axios.request({
    url: '/model/pagedQueryWorkflowJob',
    method: 'post',
    params: {
      name: name,
      pageIndex: pageIndex,
      pageSize: pageSize
    }
  })
}
