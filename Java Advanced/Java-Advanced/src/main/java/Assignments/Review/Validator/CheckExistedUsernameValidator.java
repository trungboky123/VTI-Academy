package Assignments.Review.Validator;

import Assignments.Review.CustomAnnotation.CheckExistenceByUsername;
import Assignments.Review.Repository.AccountRepository;
import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CheckExistedUsernameValidator implements ConstraintValidator<CheckExistenceByUsername, String> {
    private final AccountRepository accountRepository;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (StringUtils.isEmpty(s)) {
            return true;
        }
        return !accountRepository.existsByUsername(s);
    }
}
