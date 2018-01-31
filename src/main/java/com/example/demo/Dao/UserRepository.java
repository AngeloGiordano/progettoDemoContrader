package com.example.demo.Dao;

import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface  UserRepository extends CrudRepository<User, Long> {

    List<User> findByRuolo(String ruolo);

    User findUserByUsername(String username);
}
