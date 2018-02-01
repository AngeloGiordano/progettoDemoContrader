package com.example.demo.Controller;


import com.example.demo.Converter.MovimentoConverter;
import com.example.demo.Converter.UserConverter;
import com.example.demo.Dto.MovimentoDTO;
import com.example.demo.Dto.UserDTO;
import com.example.demo.GenericResponse;
import com.example.demo.Model.Movimento;
import com.example.demo.Model.User;
import com.example.demo.Service.MovimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value="*")
@RestController
@RequestMapping("/movimento")
public class MovimentoController {

    private MovimentoService movimentoService;
    private MovimentoConverter movimentoConverter;
    private UserConverter userConverter;



    @Autowired
    public MovimentoController(MovimentoService movimentoService, MovimentoConverter movimentoConverter, UserConverter userConverter)
    {
        this.movimentoService = movimentoService;
        this.movimentoConverter = movimentoConverter;
        this.userConverter=userConverter;
    }

    @RequestMapping(value="/getMovimento", method = RequestMethod.POST)
    public GenericResponse<List<MovimentoDTO>> getMovimenti(@RequestBody UserDTO userDTO) {
        List<MovimentoDTO> movimenti = new ArrayList<>();
        User user=userConverter.convertToEntity(userDTO);
        String username=user.getUsername();
        List<Movimento> mov= movimentoService.findByUsername(username);
        for (Movimento movimento: mov)
        {
            movimenti.add(movimentoConverter.convertToDTO(movimento));
        }

        if (movimenti.size() == 0) {return  new GenericResponse<>(1,null);}//*lista movimenti vuota
        else{ return new GenericResponse<>(0,movimenti);}//*lista movimenti
    }
}
