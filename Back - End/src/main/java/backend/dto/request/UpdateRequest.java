package backend.dto.request;

import lombok.Data;

@Data
public class UpdateRequest {
    private String username;
    private String oldPassword;
    private String newPassword;
    private String department;
    private String city;
}
