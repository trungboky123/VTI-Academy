package Assignments.Review.CustomAnnotation;

import Assignments.Review.Validator.CheckExistedEmailValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = CheckExistedEmailValidator.class)
public @interface CheckExistenceByEmail {
    String message() default "{email.existed}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
