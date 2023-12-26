package org.example.userscontrole.service.mappers;

import org.example.userscontrole.dao.entites.User;
import org.example.userscontrole.service.dtos.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public UserDTO fromUserToUserDTO(User user){
        return this.modelMapper.map(user,UserDTO.class);
    }

    public User fromUserDTOToUser(UserDTO userDTO){
        return this.modelMapper.map(userDTO,User.class);
    }
}
