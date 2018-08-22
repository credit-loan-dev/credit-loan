package com.sixliu.credit.common.web.interceptor;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ValidationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.credit.common.exception.AppException;

/**
 * @author:MG01867
 * @date:2018年8月22日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@ControllerAdvice
public class ExceptionInterceptor {

	static final Logger log = LoggerFactory.getLogger(ExceptionInterceptor.class);

	private final static String msg = "system error";

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public String handle(HttpServletResponse resp,Exception exception) {
		log.error(exception.getMessage(),exception);
		if (exception instanceof ValidationException) {
			resp.setStatus(HttpStatus.BAD_REQUEST.value());
			return exception.getMessage();
		} else if (exception instanceof AppException) {
			resp.setStatus(HttpStatus.BAD_REQUEST.value());
			return exception.getMessage();
		} else {
			resp.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			return msg;
		}
	}
}
