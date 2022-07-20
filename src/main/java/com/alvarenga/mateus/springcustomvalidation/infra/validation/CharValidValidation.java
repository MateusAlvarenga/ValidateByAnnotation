package com.alvarenga.mateus.springcustomvalidation.infra.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class CharValidValidation implements ConstraintValidator<CharValid, Object> {

    private String[] charsAllowed;

    @Override
    public void initialize(CharValid constraintAnnotation) {
        charsAllowed = constraintAnnotation.chars();
        System.out.println("charsAllowed: " + charsAllowed);
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        String value = (String) o;
        return Arrays.stream(charsAllowed).anyMatch(value::contains);
    }
}
