package com.example.restservice.h2.embedded.db.rest.crud.service;



import com.example.restservice.h2.embedded.db.rest.crud.exception.AlreadyExistException;
import com.example.restservice.h2.embedded.db.rest.crud.exception.NotFoundException;
import com.example.restservice.h2.embedded.db.rest.crud.model.User;

import java.util.List;

public interface UserService {

    public User saveUser(User user) throws AlreadyExistException;

    public User getUser(String userId) throws NotFoundException;

    public User updateUser(User user) throws NotFoundException;

    public User deleteUser(String userName) throws NotFoundException;

    public List<User> getAllUser();

}
