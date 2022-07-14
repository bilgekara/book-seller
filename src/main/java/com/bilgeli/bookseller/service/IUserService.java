package com.bilgeli.bookseller.service;

import com.bilgeli.bookseller.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
        //TransactionalRequired when executing an update/delete query.
    void makeAdmin(String username);
}
