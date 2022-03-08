package br.com.dilermando.userapi.services;

import br.com.dilermando.userapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}