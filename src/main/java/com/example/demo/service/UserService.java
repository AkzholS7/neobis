package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto userRegistrationDto);
}
