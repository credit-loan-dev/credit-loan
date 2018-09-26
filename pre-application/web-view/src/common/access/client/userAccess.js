import axios from '@/libs/api.request'

/**用户登录**/
export const login = ({userName, password}) => {
  const data = {
    userName,
    password
  }
  return axios.request({
    url: 'login',
    data,
    method: 'post'
  })
}

/**用户登出**/
export const logout = (token) => {
  return axios.request({
    url: 'logout',
    method: 'post'
  })
}
