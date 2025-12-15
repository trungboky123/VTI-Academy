package backend.dto.response;

import lombok.Data;

@Data
public class UserReponse {
    private Integer id;
    private String username;
    private String department;
    private String avtUrl;
    private String city;
}
