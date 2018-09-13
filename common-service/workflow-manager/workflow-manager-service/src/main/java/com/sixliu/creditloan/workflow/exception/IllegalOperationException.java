package com.sixliu.creditloan.workflow.exception;
/**
*@author:MG01867
*@date:2018年9月13日
*@E-mail:359852326@qq.com
*@version:
*@describe 应用异常-非法操作
*/
public class IllegalOperationException extends AppException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3533949288174506949L;

	public IllegalOperationException() {
		super();
	}

	public IllegalOperationException(String message) {
		super(message);
	}

	public IllegalOperationException(Throwable cause) {
		super(cause);
	}
	
	public IllegalOperationException(String message, Throwable cause) {
		super(message, cause);
	}
}
