package smartpot.com.api.Models.DTO;

import lombok.Data;

@Data
public class UserDTO {
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String role;
}