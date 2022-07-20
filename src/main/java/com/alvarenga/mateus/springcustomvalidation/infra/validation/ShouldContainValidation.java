package com.alvarenga.mateus.springcustomvalidation.infra.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class ShouldContainValidation implements ConstraintValidator<ShouldContain, String> {

    private String check;


    @Override
    public void initialize(ShouldContain constraintAnnotation) {
        check = constraintAnnotation.check();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.contains(check);
    }
}
