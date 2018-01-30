package com.example.demo.Controller;

import com.example.demo.Converter.UserConverter;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.GenericResponse;

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



    @RequestMapping(value="/newUser", method =RequestMethod.POST)
    public GenericResponse<UserDTO> newUser(@RequestBody UserDTO userDTO){
        User user = userService.insert(userConverter.convertToEntity(userDTO));
        if (user != null)
        {
            return new GenericResponse<>(0, userDTO);
        }
        else return new GenericResponse<>(1, null);
    }



}
