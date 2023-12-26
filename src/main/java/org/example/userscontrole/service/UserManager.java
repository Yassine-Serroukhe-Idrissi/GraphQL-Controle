package org.example.userscontrole.service;

import org.example.userscontrole.service.dtos.UserDTO;

import java.util.List;

public interface UserManager {
    //    getUserByEmail(email:String):UserDTO
    public UserDTO getUserByEmail(String email);

    //    getUserByDateNaissance(dateNaissance:String):[UserDTO]
    public List<UserDTO> getUserByDateNaissance(String dateNaissance);

    //    saveUser(userDTO:UserDTOInput): UserDTO
    public UserDTO saveUser(UserDTO userDTO);

    //    deleteUser(id:ID):UserDTO
    public UserDTO deleteUser(Long id);
}
