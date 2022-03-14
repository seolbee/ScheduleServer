package com.calendar.mapper;

import com.calendar.model.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public void insertUser();
    public UserVO getUser(String phone);
}
