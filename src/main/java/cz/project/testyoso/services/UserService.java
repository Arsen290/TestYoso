package cz.project.testyoso.services;

import cz.project.testyoso.DTO.UserDTO;
import cz.project.testyoso.entities.User;
import cz.project.testyoso.repositories.UserRepository;

public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    private UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setGivenName(user.getGivenName());
        userDTO.setLastName(user.getLastName());
        return userDTO;
    }


}
