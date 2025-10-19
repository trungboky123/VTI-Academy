package Assignments.Review.DTO.Request;

import Assignments.Review.CustomAnnotation.CheckExistenceByEmail;
import Assignments.Review.CustomAnnotation.CheckExistenceByUsername;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateAccountRequest {
    @NotBlank(message = "{username.notblank}")
    @Size(max = 50, message = "{username.maxsize}")
    @CheckExistenceByUsername
    private String username;

    @NotBlank(message = "{firstName.notblank}")
    @Size(max = 50, message = "{firstName.size}")
    private String firstName;

    @NotBlank(message = "{lastName.notblank}")
    @Size(max = 50, message = "{lastName.size}")
    private String lastName;

    @NotBlank(message = "{email.notblank}")
    @Size(max = 50, message = "{email.size}")
    @CheckExistenceByEmail
    private String email;

    @NotBlank(message = "{password.notblank}")
    @Size(max = 800, message = "{password.size}")
    private String password;
}
