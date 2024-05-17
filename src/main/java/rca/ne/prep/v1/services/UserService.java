package rca.ne.prep.v1.services;

import rca.ne.prep.v1.dto.requests.CreateUserDto;
import rca.ne.prep.v1.models.User;

import java.util.Optional;

public interface UserService {
    User registerUser(CreateUserDto user);
    Optional<User> findByUsername(String username);
    void deleteUserById(Long userId);
    User changeUserPassword(String username, String password);
}
