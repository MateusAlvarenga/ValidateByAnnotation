package com.alvarenga.mateus.springcustomvalidation.infra.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = CharValidValidation.class)
@Retention(RUNTIME)
@Target({FIELD })
public @interface CharValid {
    String message() default "the given value is not valid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};    String[] chars();
}
