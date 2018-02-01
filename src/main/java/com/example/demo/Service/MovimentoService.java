package com.example.demo.Service;

import com.example.demo.Dao.MovimentoRepository;
import com.example.demo.Model.Movimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimentoService {

    private MovimentoRepository movimentoRepository;

    @Autowired
    public MovimentoService(MovimentoRepository movimentoRepository){this.movimentoRepository=movimentoRepository;}


    public List<Movimento> findByUsername (String username)
    {
        return this.movimentoRepository.findByUsername(username);
    }

}