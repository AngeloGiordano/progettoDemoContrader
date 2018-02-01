package com.example.demo.Service;

import com.example.demo.Dao.DispositivoRepository;
import com.example.demo.Model.Dispositivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DispositivoService {

    private DispositivoRepository dispositivoRepository;

    @Autowired
    public DispositivoService(DispositivoRepository dispositivoRepository){this.dispositivoRepository=dispositivoRepository;}


    public Dispositivo findByNomeDispositivoAndUsername(String nomeDispositivo,String username){
        return this.dispositivoRepository.findByNomeDispositivoAndUsername(nomeDispositivo,username);
    }

    public Dispositivo insert (Dispositivo dispositivo){return this.dispositivoRepository.save(dispositivo);}

    public List<Dispositivo> findByUsername (String username)
    {
        return this.dispositivoRepository.findByUsername(username);
    }


}
