package com.bjewels.security.service;

import com.bjewels.security.payload.LoginDto;
import com.bjewels.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
