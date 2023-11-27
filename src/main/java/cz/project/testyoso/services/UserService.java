package cz.project.testyoso.services;

import cz.project.testyoso.DTO.UserDTO;
import cz.project.testyoso.entities.User;
import cz.project.testyoso.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public void createUser(UserDTO userDTO) {
            User user = new User();
            user.setUsername(userDTO.getUsername());
            user.setPassword(userDTO.getPassword());
            user.setGivenName(userDTO.getGivenName());
            user.setLastName(userDTO.getLastName());
            userRepository.save(user);
        }

    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(this::toDTO).toList();
    }

    //implement to further work with data from specific user
    public UserDTO getUserByUsername(String username) {
        User user = userRepository.findUserByUsername(username).orElseThrow();
        return toDTO(user);
    }


}
