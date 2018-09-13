package com.sixliu.creditloan.workflow.exception;
/**
*@author:MG01867
*@date:2018年9月13日
*@E-mail:359852326@qq.com
*@version:
*@describe 应用异常-非法参数
*/
public class IllegalArgumentAppException extends AppException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9003298856413084678L;

	public IllegalArgumentAppException() {
		super();
	}

	public IllegalArgumentAppException(String message) {
		super(message);
	}

	public IllegalArgumentAppException(Throwable cause) {
		super(cause);
	}
	
	public IllegalArgumentAppException(String message, Throwable cause) {
		super(message, cause);
	}
}
