package com.bilgeli.bookseller.service;

import com.bilgeli.bookseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
