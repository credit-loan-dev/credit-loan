import Mock from 'mockjs'
import { login, logout, getUserInfo } from './login'
import {
  getTableData, getProTableData, getCustomRepaymentType, getProductAlterApply,getchildProduct
  ,getchildProductBasicInfo,getchildProductCreditConfigInfo,getchildProductLoanConfigInfo,
  getchildProductLimitConfigInfo
} from './data'

// 登录相关和获取用户信息
Mock.mock(/\/login/, login)
Mock.mock(/\/get_info/, getUserInfo)
Mock.mock(/\/logout/, logout)
Mock.mock(/\/get_table_data/, getTableData)
Mock.mock(/\/product\/getAll/, getProTableData)
Mock.mock(/\/customRepaymentType\/getAll/, getCustomRepaymentType)
Mock.mock(/\/productAlterApply\/getAll/, getProductAlterApply)
Mock.mock(/\/getchildProduct\/getAll/, getchildProduct)
Mock.mock(/\getchildProductBasicInfo\/getAll/, getchildProductBasicInfo)
Mock.mock(/\/getchildProductCreditConfigInfo\/getAll/, getchildProductCreditConfigInfo)
Mock.mock(/\/getchildProductLoanConfigInfo\/getAll/, getchildProductLoanConfigInfo)
Mock.mock(/\/getchildProductLimitConfigInfo\/getAll/, getchildProductLimitConfigInfo)


export default Mock
