package backend.dto.request;

import lombok.Data;

@Data
public class UpdateRequest {
    private Integer id;
    private String username;
    private String password;
    private String department;
    private String city;
}
