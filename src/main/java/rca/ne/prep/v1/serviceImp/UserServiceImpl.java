package rca.ne.prep.v1.serviceImp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rca.ne.prep.v1.models.User;
import rca.ne.prep.v1.repositories.UserRepository;
import rca.ne.prep.v1.services.UserService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User registerUser(User user){
        return userRepository.save(user);
    }
    @Override
    public Optional<User> findByUsername(String username){
        return userRepository.findByUsername(username);
    }
    @Override
    public void deleteUserById(Long userId){
        userRepository.deleteById(userId);
    }


}
