package Assignments.Assignment_Lesson_9.DTO.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.time.LocalDate;

@Data
public class CreateAccountRequest {
    @NotBlank(message = "{email.notblank}")
    @Email(message = "{email.invalid}")
    @Size(max = 50, message = "{email.size}")
    private String email;

    @NotBlank(message = "{username.notblank}")
    @Size(min = 6, max = 50, message = "{username.size}")
    private String username;

    @NotBlank(message = "{firstName.notblank}")
    @Size(max = 50, message = "{firstName.size}")
    private String firstName;

    @NotBlank(message = "{lastName.notblank}")
    @Size(max = 50, message = "{lastName.size}")
    private String lastName;

    @NotBlank(message = "{department.name.notblank}")
    private String departmentName;

    private LocalDate createDate;
}
