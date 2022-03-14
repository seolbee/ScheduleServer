package com.calendar.service;

import com.calendar.model.dto.LoginDTO;
import com.calendar.model.dto.RegisterDTO;

public interface UserService {
    public void register(RegisterDTO dto);

    public boolean login(LoginDTO dto);
}
