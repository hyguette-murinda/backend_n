package rca.ne.prep.v1.services;

import org.springframework.stereotype.Service;
import rca.ne.prep.v1.models.User;


public interface UserService {
    User registerUser(User user);
    User findByUsername(String username);
}
