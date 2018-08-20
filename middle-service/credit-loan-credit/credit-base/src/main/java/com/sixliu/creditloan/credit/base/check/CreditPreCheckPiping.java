package com.sixliu.creditloan.credit.base.check;

import com.sixliu.creditloan.credit.base.CreditOrderDTO;

/**
*@author:MG01867
*@date:2018年8月7日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class CreditPreCheckPiping {

	public Context check(CreditOrderDTO creditOrder) {
		Context context = new Context();
		context.setCreditOrder(creditOrder);
		return context;
	}
}
