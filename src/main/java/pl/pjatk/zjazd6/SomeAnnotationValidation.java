package pl.pjatk.zjazd6;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SomeAnnotationValidation implements ConstraintValidator<SomeAnnotation, String> {

    @Override
    public void initialize(SomeAnnotation someAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.isEmpty();
    }

}
