package com.info.dao;

import com.info.vo.UserRegisterVO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

public class RegistrationDaoImpl implements RegistrationDao {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int save(UserRegisterVO vo) throws SQLException{

        Connection con=dataSource.getConnection();
        PreparedStatement ps=con.prepareStatement("insert INTO UserDetails VALUES (?,?,?,?,?,?,?)");
        ps.setString(1,vo.getName());
        ps.setString(2,vo.getEmail());
        ps.setString(3,vo.getAddress());
        ps.setString(4,"vinay");
        ps.setTimestamp(5,new Timestamp(System.currentTimeMillis()));
        ps.setInt(6,vo.getAge());
        ps.setString(7,vo.getDateOfBirth());
        int i=ps.executeUpdate();
        con.close();
        return i;

    }

    @Override
    public String delete(int id) {
        return null;
    }

    @Override
    public int update(UserRegisterVO vo) {
        return 0;
    }

    @Override
    public UserRegisterVO getUserDetailsByName(String name) {
        return null;
    }

    @Override
    public UserRegisterVO getUserDetailsByNumber(String phoneNumber) {
        return null;
    }

    @Override
    public List<UserRegisterVO> getUserDetails() {
        return null;
    }
}
