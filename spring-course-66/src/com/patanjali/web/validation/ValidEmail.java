package com.patanjali.web.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = com.patanjali.web.validation.ValidEmailImpl.class)
public @interface ValidEmail {

	String message() default "This is not a valid emailll address";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

	/**
	 * @return size the element must be higher or equal to
	 */
	int min() default 5;

	/**
	 * @return size the element must be lower or equal to
	 */
	int max() default 100;
}
