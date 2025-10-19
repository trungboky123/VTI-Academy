package Assignments.Review.Validator;

import Assignments.Review.CustomAnnotation.CheckExistenceByEmail;
import Assignments.Review.Repository.AccountRepository;
import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CheckExistedEmailValidator implements ConstraintValidator<CheckExistenceByEmail, String> {
    private final AccountRepository accountRepository;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (StringUtils.isEmpty(s)) {
            return true;
        }
        return !accountRepository.existsByEmail(s);
    }
}
