package rca.ne.prep.v1.serviceImp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rca.ne.prep.v1.dto.requests.CreateUserDto;
import rca.ne.prep.v1.models.User;
import rca.ne.prep.v1.repositories.UserRepository;
import rca.ne.prep.v1.services.UserService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User registerUser(CreateUserDto user){
        User user1=new User();
        user1.setUsername(user.getUserName());
        user1.setPassword(user.getPassword());
        return userRepository.save(user1);
    }
    @Override
    public Optional<User> findByUsername(String username){
        return userRepository.findByUsername(username);
    }
    @Override
    public void deleteUserById(Long userId){
        userRepository.deleteById(userId);
    }
    @Override
    public User changeUserPassword(String username, String password){
        Optional<User> user = userRepository.findByUsername(username);
        User user1 = user.get();
        user1.setPassword(password);
        return user1;
    }


}
