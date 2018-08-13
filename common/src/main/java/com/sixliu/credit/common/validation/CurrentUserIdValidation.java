package com.sixliu.credit.common.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

import org.apache.commons.lang3.StringUtils;

import com.sixliu.credit.common.web.HttpServletContext;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CurrentUserIdValidation.CurrentUserIdChecker.class)
@Documented
public @interface CurrentUserIdValidation {

	String message() default "The user is not current user";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String value() default "";

	boolean inclusive() default true;

	public class CurrentUserIdChecker implements ConstraintValidator<CurrentUserIdValidation, String> {

		@Override
		public boolean isValid(String value, ConstraintValidatorContext context) {
			if(StringUtils.isBlank(value)) {
				return false;
			}
			String currentUserId = HttpServletContext.getCurrentUserId();
			return StringUtils.equals(value, currentUserId);
		}

	}
}
