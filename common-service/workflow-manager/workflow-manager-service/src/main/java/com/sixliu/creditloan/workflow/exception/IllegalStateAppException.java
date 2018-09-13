package com.sixliu.creditloan.workflow.exception;
/**
*@author:MG01867
*@date:2018年9月13日
*@E-mail:359852326@qq.com
*@version:
*@describe 应用异常-非法状态
*/
public class IllegalStateAppException extends AppException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5997334509135241317L;

	public IllegalStateAppException() {
		super();
	}

	public IllegalStateAppException(String message) {
		super(message);
	}

	public IllegalStateAppException(Throwable cause) {
		super(cause);
	}
	
	public IllegalStateAppException(String message, Throwable cause) {
		super(message, cause);
	}
}
