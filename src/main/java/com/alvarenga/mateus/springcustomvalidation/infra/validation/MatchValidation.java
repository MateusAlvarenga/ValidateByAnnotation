package com.alvarenga.mateus.springcustomvalidation.infra.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class MatchValidation implements ConstraintValidator<Match, String> {

    private String[] charsAllowed;

    @Override
    public void initialize(Match constraintAnnotation) {
        charsAllowed = constraintAnnotation.check();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return Arrays.stream(charsAllowed).anyMatch(value::contains);
    }
}
