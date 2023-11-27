package cz.project.testyoso.services;

import cz.project.testyoso.DTO.UserDTO;
import cz.project.testyoso.entities.User;

public class UserService {

    public UserService() {
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
