package rca.ne.prep.v1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rca.ne.prep.v1.dto.requests.CreateUserDto;
import rca.ne.prep.v1.models.User;
import rca.ne.prep.v1.services.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody()CreateUserDto userDto){
        User user1 = userService.registerUser(userDto);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }
    @GetMapping("/{username}")
    public ResponseEntity<Optional<User>> findByUsername(@PathVariable String username){
        Optional<User> user = userService.findByUsername(username);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @DeleteMapping("/{userId}")
    public void deleteUserById(@PathVariable Long userId){
        userService.deleteUserById(userId);
    }
    @PutMapping("/{username}")
    public ResponseEntity<User> changeUserPassword(@PathVariable String username, String password){
        User user = userService.changeUserPassword(username, password);
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }
}
