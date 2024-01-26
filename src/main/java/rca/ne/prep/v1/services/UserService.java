package rca.ne.prep.v1.services;

import org.springframework.stereotype.Service;



public interface UserService {
    User registerUser(User user);
    User findByUsername(String username);
}
