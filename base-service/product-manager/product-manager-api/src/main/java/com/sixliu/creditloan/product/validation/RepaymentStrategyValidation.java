package com.sixliu.creditloan.product.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

import com.sixliu.creditloan.product.constant.RepaymentStrategy;

/**
 * @author:MG01867
 * @date:2018年8月23日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = RepaymentStrategyValidation.Checker.class)
@Documented
public @interface RepaymentStrategyValidation {

	String message() default "";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String value() default "";

	boolean inclusive() default true;

	public class Checker implements ConstraintValidator<RepaymentStrategyValidation, String> {

		@Override
		public boolean isValid(String value, ConstraintValidatorContext context) {
			return RepaymentStrategy.validate(value);
		}

	}
}