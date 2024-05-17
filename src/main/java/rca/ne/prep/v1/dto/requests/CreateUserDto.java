package rca.ne.prep.v1.dto.requests;

import lombok.Data;

@Data
public class CreateUserDto {
    private String userName;
    private  String password;
}
