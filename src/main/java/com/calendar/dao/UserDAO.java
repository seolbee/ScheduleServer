package com.calendar.dao;

import com.calendar.model.dto.RegisterDTO;
import com.calendar.model.vo.UserVO;

public interface UserDAO {
    public void insertUser(RegisterDTO dto);

    public UserVO selectUser(String uid);
}
