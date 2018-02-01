package com.example.demo.Converter;

import com.example.demo.Dto.UserDTO;
import com.example.demo.Model.User;
import org.springframework.stereotype.Component;



@Component
public class UserConverter implements Converter<User, UserDTO>{


    @Override
    public User convertToEntity(UserDTO userDTO) {

        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setNomeUser(userDTO.getNomeUser());
        user.setCognomeUser(userDTO.getCognomeUser());
        user.setDataDiNascita(userDTO.getDataDiNascita());
        user.setIndirizzo(userDTO.getIndirizzo());
        user.setCitta(userDTO.getCitta());
        user.setProvincia(userDTO.getProvincia());
        user.setCap(userDTO.getCap());
        user.setEmail(userDTO.getEmail());
        user.setTelefono(userDTO.getTelefono());
        user.setRuolo("user");
        user.setStato("sbloccato");
        return user;
    }


    @Override
    public UserDTO convertToDTO(User user) {
        return new UserDTO(user.getUsername(), user.getPassword(),user.getNomeUser(),
                user.getCognomeUser(),user.getDataDiNascita(), user.getIndirizzo(),
                user.getCitta(), user.getProvincia(), user.getCap(),
                user.getEmail(), user.getTelefono(), user.getRuolo(),user.getStato());
    }
}

