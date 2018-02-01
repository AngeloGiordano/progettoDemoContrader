package com.example.demo.Dao;

import com.example.demo.Model.Movimento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface MovimentoRepository extends CrudRepository<Movimento, Long> {
    List<Movimento> findByUsername(String username);
}