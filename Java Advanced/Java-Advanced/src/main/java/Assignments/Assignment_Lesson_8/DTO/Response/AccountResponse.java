package Assignments.Assignment_Lesson_8.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AccountResponse {
    private String username;
    private String fullName;
    private String DepartmentName;
}
