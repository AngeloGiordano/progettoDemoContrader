package com.example.demo.Controller;

import com.example.demo.Converter.DispositivoConverter;
import com.example.demo.Converter.UserConverter;
import com.example.demo.Dto.DispositivoDTO;
import com.example.demo.Dto.UserDTO;
import com.example.demo.GenericResponse;
import com.example.demo.Model.Dispositivo;
import com.example.demo.Model.User;
import com.example.demo.Service.DispositivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value="*")
@RestController
@RequestMapping("/dispositivi")
public class DispositivoController {

    private DispositivoService dispositivoService;
    private DispositivoConverter dispositivoConverter;
    private UserConverter userConverter;



    @Autowired
    public DispositivoController(DispositivoService dispositivoService, DispositivoConverter dispositivoConverter,UserConverter userConverter)
    {
        this.dispositivoService = dispositivoService;
        this.dispositivoConverter = dispositivoConverter;
        this.userConverter=userConverter;
    }

    @RequestMapping(value="/newDispositivo", method = RequestMethod.POST)
    public GenericResponse<DispositivoDTO> insertDisp(@RequestBody DispositivoDTO dispositivoDTO)
    {
        //Dispositivo dispositivo=dispositivoConverter.convertToEntity(dispositivoDTO);
        String username = dispositivoDTO.getUsername();
        String nomeDispositivo = dispositivoDTO.getNomeDispositivo();
        Dispositivo trovato=dispositivoService.findByNomeDispositivoAndUsername(nomeDispositivo,username);
        if (trovato!=null){
            return new GenericResponse<>(0,null); //dispositivo già presente
        }
        else{

            Dispositivo newDispositivo=dispositivoConverter.convertToEntity(dispositivoDTO);
            Dispositivo dispAgg=dispositivoService.insert(newDispositivo);
           DispositivoDTO dispAggDTO=dispositivoConverter.convertToDTO(dispAgg);
            return new GenericResponse<>(1,dispAggDTO); // dispositivo aggiunto
        }

    }

    @RequestMapping(value="/getDispositivo", method = RequestMethod.POST)
    public GenericResponse<List<DispositivoDTO>> getDispositivi (@RequestBody UserDTO userDTO) {
        List<DispositivoDTO> dispositivi = new ArrayList<>();
        User user=userConverter.convertToEntity(userDTO);
        String username=user.getUsername();
        List<Dispositivo> disp= dispositivoService.findByUsername(username);
        for (Dispositivo dispositivo: disp)
        {
            dispositivi.add(dispositivoConverter.convertToDTO(dispositivo));
        }

        if (dispositivi.size() == 0) {return  new GenericResponse<>(1,null);}//*lista dispositivi vuota
        else{ return new GenericResponse<>(0,dispositivi);}//*lista dispositivi
    }
}
