package com.sixliu.credit.account.common;
/**
*@author:MG01867
*@date:2018年7月12日
*@E-mail:359852326@qq.com
*@version:
*@describe 账户类型
*/
public enum AccountType {

	/**内部借记**/
	INTERNAL_DEBIT,
	
	/**内部贷记**/
	INTERNAL_LOAN,
	
	/**内部信用共享**/
	INTERNAL_CREDIT_SHARE,
	
	/**内部信用交易**/
	INTERNAL_CREDIT_TRANSACTION,
	
	/**外部借记**/
	EXTERNAL_DEBIT,
	
	/**外部贷记**/
	EXTERNAL_LOAN,
	
	/**外部信用共享**/
	EXTERNAL_CREDIT_SHARE,
	
	/**贷记信用交易**/
	EXTERNAL_CREDIT_TRANSACTION,

}
