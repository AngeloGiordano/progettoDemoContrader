package com.example.demo.Controller;

import com.example.demo.Converter.UserConverter;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.GenericResponse;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value="*")
@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    private UserConverter userConverter;

    @Autowired
    public UserController(UserService userService, UserConverter userConverter)
    {
        this.userService = userService;
        this.userConverter = userConverter;
    }

    @RequestMapping(value="/getUsers", method = RequestMethod.GET)
    public GenericResponse<List<UserDTO>> users () {
        List<UserDTO> users = new ArrayList<>();
        for (User userEntity: userService.findByRuolo("user"))
        {
            users.add(userConverter.convertToDTO(userEntity));
        }

        if (users.size() == 0) return  new GenericResponse<>(1,null);
        else return new GenericResponse<>(0,users);
    }



    @RequestMapping(value="/updateUser", method =RequestMethod.POST)
    public GenericResponse<UserDTO> newUser(@RequestBody UserDTO userDTO){

            User user=   userConverter.convertToEntity(userDTO);
        if (user != null)
        {
            User userTrovato= userService.findUserByUsername(user.getUsername());
            userTrovato.setPassword(user.getPassword());
            userTrovato.setNomeUser(user.getNomeUser());
            userTrovato.setCognomeUser(user.getCognomeUser());
            userTrovato.setDataDiNascita(user.getDataDiNascita());
            userTrovato.setIndirizzo(user.getIndirizzo());
            userTrovato.setCitta(user.getCitta());
            userTrovato.setProvincia(user.getProvincia());
            userTrovato.setCap(user.getCap());
            userTrovato.setEmail(user.getEmail());
            userTrovato.setTelefono(user.getTelefono());
            User userAgg=userService.insert(userTrovato);
            UserDTO userAggDTO=userConverter.convertToDTO(userAgg);

            return new GenericResponse<>(0, userAggDTO);
        }
        else return new GenericResponse<>(1, null);
    }




}
