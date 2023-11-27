package cz.project.testyoso.controllers;

import cz.project.testyoso.DTO.UserDTO;
import cz.project.testyoso.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public void createUser(@RequestBody UserDTO userDTO){
        userService.createUser(userDTO);
    }

    @GetMapping
    public void getAllUsers(){
        userService.getAllUsers();
    }
}
