package com.codegym.service;

import com.codegym.model.AppUser;

public interface AppUserService {
    AppUser getUserByUsername(String username);
}
