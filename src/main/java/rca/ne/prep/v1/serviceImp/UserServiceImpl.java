//package rca.ne.prep.v1.serviceImp;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import rca.ne.prep.v1.services.UserService;
//import rca.ne.prep.v1.models.User;
//
//import java.util.ArrayList;
//
//
//@Service
//public class UserServiceImpl implements UserDetailsService {
//    @Autowired
//    private UserService userService;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userService.findByUsername(username);
//        if(user == null){
//            throw new UsernameNotFoundException("user was not found");
//
//        }
//        return new org.springframework.security.core.userdetails.User(
//                user.getUsername(),
//                user.getPassword(),
//                new ArrayList<>()
//        );
//    }
//}
