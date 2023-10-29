package com.geekster.Recipe.Management.service;

import com.geekster.Recipe.Management.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;
}
