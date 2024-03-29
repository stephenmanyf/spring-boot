/**
 * Reference: https://www.mkyong.com/spring-boot/spring-rest-validation-example/
 */
package com.stephen.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = AuthorValidator.class)
@Documented
public @interface Author {
	String message() default "Author is not allowed.";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
