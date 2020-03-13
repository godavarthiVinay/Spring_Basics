package com.info.services;

import com.info.dao.RegistrationDao;
import com.info.vo.UserRegisterVO;
import com.info.vo.ValidationVO;

import java.sql.SQLException;
import java.util.List;

public class RegistrationServiceImpl implements RegistrationService {

    private RegistrationDao registrationDao;

    public void setRegistrationDao(RegistrationDao registrationDao) {
        this.registrationDao = registrationDao;
    }

    @Override
    public ValidationVO save(UserRegisterVO vo) throws SQLException {
        int insertionValueId= registrationDao.save(vo);
        ValidationVO validationVO=new ValidationVO();
        if (insertionValueId >=1){
            validationVO.setId(1);
            validationVO.setMessage("Saved Sucessfully ");

            System.out.println("record inserted sucessfully");

        }else {
            validationVO.setId(0);
            validationVO.setMessage("Error while saving details .PLease contact support team");

            System.out.println("failed to insert record");
        }
        return validationVO;

    }

    @Override
    public ValidationVO delete(int id) {
        return null;
    }

    @Override
    public ValidationVO update(UserRegisterVO vo) {
        return null;
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
