package com.example.demo.Converter;

import com.example.demo.Dto.UserDTO;
import com.example.demo.Model.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements Converter<User, UserDTO>{


    @Override
    public User convertToEntity(UserDTO userDTO) {

        User user = new UserEntity();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setFirstname(userDTO.getFirstname());
        user.setLastname(userDTO.getLastname());
        user.setDateofbirth(userDTO.getDateofbirth());
        user.setFiscalcode(userDTO.getFiscalcode());
        user.setBusinessname(userDTO.getBusinessname());
        user.setVat(userDTO.getVat());
        user.setMunicipality(userDTO.getMunicipality());
        user.setPost(userDTO.getPost());
        user.setCity(userDTO.getCity());
        user.setAddress(userDTO.getAddress());
        user.setTelephone(userDTO.getTelephone());
        usergit setRole("user");
        return userEntity;
    }


    @Override
    public UserDTO convertToDTO(UserEntity userEntity) {
        return new UserDTO(userEntity.getUsername(), userEntity.getPassword(),userEntity.getFirstname(),
                userEntity.getLastname(),userEntity.getDateofbirth(), userEntity.getFiscalcode(),
                userEntity.getBusinessname(), userEntity.getVat(), userEntity.getMunicipality(),
                userEntity.getPost(), userEntity.getCity(), userEntity.getAddress(),userEntity.getTelephone(),
                userEntity.getRole());
    }
}

