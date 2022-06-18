package com.insurance.app.insurance.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/add")
    public void addNewUser(@RequestBody User user) {
        userService.addUser(user);
    }

}
