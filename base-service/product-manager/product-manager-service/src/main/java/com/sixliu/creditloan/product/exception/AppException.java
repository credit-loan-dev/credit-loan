package com.sixliu.creditloan.product.exception;
/**
*@author:MG01867
*@date:2018年8月23日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class AppException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 6674770165362029235L;

	public AppException() {
		super();
	}

	public AppException(String message) {
		super(message);
	}

	public AppException(Throwable cause) {
		super(cause);
	}
	
	public AppException(String message, Throwable cause) {
		super(message, cause);
	}
}
