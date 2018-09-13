package com.sixliu.creditloan.workflow.exception;
/**
*@author:MG01867
*@date:2018年9月13日
*@E-mail:359852326@qq.com
*@version:
*@describe 未知应用异常
*/
public class UnknowAppException extends AppException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8961751381965098354L;

	public UnknowAppException() {
		super();
	}

	public UnknowAppException(String message) {
		super(message);
	}

	public UnknowAppException(Throwable cause) {
		super(cause);
	}
	
	public UnknowAppException(String message, Throwable cause) {
		super(message, cause);
	}
}