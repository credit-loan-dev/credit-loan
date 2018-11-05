package com.sixliu.user.interceptor;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ValidationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:MG01867
 * @date:2018年8月22日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 异常信息统一拦截
 */
@ControllerAdvice
public class ExceptionInterceptor {

	static final Logger log = LoggerFactory.getLogger(ExceptionInterceptor.class);

	final static String SYSTEM_ERROR_MSG = "system error";

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public String handle(HttpServletResponse resp, Exception exception) {
		if (exception instanceof ValidationException) {
			log.warn(exception.getMessage(), exception);
			resp.setStatus(HttpStatus.BAD_REQUEST.value());
			return exception.getMessage();
		}else if (exception instanceof MethodArgumentNotValidException) {
			log.warn(exception.getMessage(), exception);
			resp.setStatus(HttpStatus.BAD_REQUEST.value());
			return exception.getMessage();
		} else {
			log.error(exception.getMessage(), exception);
			resp.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			return SYSTEM_ERROR_MSG;
		}
	}
}
