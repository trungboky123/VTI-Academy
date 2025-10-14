package Assignments.Assignment_Lesson_9.DTO.Request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAccountRequest {
    @NotNull(message = "{id.notnull}")
    private Integer id;

    @Email(message = "{email.invalid}")
    @Size(max = 50, message = "{email.size}")
    private String email;

    @Size(min = 6, max = 50, message = "{username.size}")
    private String username;

    @Size(max = 50, message = "{firstName.size}")
    private String firstName;

    @Size(max = 50, message = "{lastName.size}")
    private String lastName;

    private String departmentName;
}
