package rca.ne.prep.v1.dto.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CreateUserDto {
    @NotBlank(message = "name can't be blank")
    private String userName;

    @NotBlank(message = "password can't be blank")
    private  String password;
}
