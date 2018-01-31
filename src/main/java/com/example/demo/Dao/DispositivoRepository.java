package com.example.demo.Dao;

import com.example.demo.Model.Dispositivo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface DispositivoRepository extends CrudRepository<Dispositivo, Long> {
    Dispositivo findByNomeDispositivoAndUsername(String nomeDispositivo,String username);
    List<Dispositivo> findByUsername(String username);
}
