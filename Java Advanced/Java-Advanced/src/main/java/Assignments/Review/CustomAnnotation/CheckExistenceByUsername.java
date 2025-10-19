package Assignments.Review.CustomAnnotation;

import Assignments.Review.Validator.CheckExistedUsernameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = CheckExistedUsernameValidator.class)
public @interface CheckExistenceByUsername {
    String message() default "{username.existed}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
