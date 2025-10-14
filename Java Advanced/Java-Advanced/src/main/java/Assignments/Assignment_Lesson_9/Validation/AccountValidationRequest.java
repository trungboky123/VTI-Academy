package Assignments.Assignment_Lesson_9.Validation;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.time.LocalDate;

@Data
public class AccountValidationRequest {
    @Min(value = 1, message = "{pagenumber.min}")
    private int pageNumber = 1;

    @Min(value = 5, message = "{pagesize.min}")
    @Max(value = 20, message = "{pagesize.max}")
    private int pageSize = 5;

    private String sortBy = "id";

    @Size(max = 50, message = "{search.size}")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]*$", message = "{search.pattern}")
    private String search;

    private LocalDate minCreateDate;
    private LocalDate maxCreateDate;
}
