package com.example.demo.Dao;

import com.example.demo.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface  UserRepository extends CrudRepository<User, Long> {


}
