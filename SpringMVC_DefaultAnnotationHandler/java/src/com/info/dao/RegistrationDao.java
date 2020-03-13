package com.info.dao;

import com.info.vo.UserRegisterVO;

import java.sql.SQLException;
import java.util.List;

public interface RegistrationDao {
    public int save(UserRegisterVO vo) throws SQLException;
    public String delete(int id);
    public int update(UserRegisterVO vo);
    public UserRegisterVO getUserDetailsByName(String name);
    public UserRegisterVO getUserDetailsByNumber(String phoneNumber);
    public List<UserRegisterVO> getUserDetails();
}
