package com.example.demo.Dao;

import com.example.demo.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface LoginRepository extends CrudRepository <User, Long> {
    User findUserByUsernameAndPassword(String username, String password);
}
