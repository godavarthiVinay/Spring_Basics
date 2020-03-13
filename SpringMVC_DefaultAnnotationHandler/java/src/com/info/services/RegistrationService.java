package com.info.services;

import com.info.vo.UserRegisterVO;
import com.info.vo.ValidationVO;

import java.sql.SQLException;
import java.util.List;

public interface RegistrationService {

    public ValidationVO save(UserRegisterVO vo) throws SQLException;
    public ValidationVO delete(int id);
    public ValidationVO update(UserRegisterVO vo);
    public UserRegisterVO getUserDetailsByName(String name);
    public UserRegisterVO getUserDetailsByNumber(String phoneNumber);
    public List<UserRegisterVO> getUserDetails();
}
