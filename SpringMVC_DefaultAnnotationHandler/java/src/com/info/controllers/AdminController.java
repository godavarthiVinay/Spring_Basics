package com.info.controllers;

import com.info.services.RegistrationService;
import com.info.vo.ValidationVO;
import com.info.vo.LoginVO;
import com.info.vo.UserRegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@CrossOrigin
@Controller
@RequestMapping("/users")
public class AdminController {

    @Autowired
    private RegistrationService registrationService;

    public void setRegistrationService(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }


    @RequestMapping(value = "/create" ,method= RequestMethod.POST)
    public @ResponseBody
    ValidationVO createUser(HttpServletRequest request, HttpServletResponse response, @RequestBody UserRegisterVO vo) throws SQLException,Exception{

        ValidationVO validationVO=null;
        HttpSession session=request.getSession(false);
        if (session !=null){

            LoginVO loginVO= (LoginVO) session.getAttribute("user");
            long userId=loginVO.getLoginUserId();
            if (userId ==1){
                validationVO= registrationService.save(vo);

            }
            else {
                validationVO=new ValidationVO();
                validationVO.setId(0);
                validationVO.setMessage("Sorry !!!. You are not authorised user.Please contact support team ");
            }
        }

        return validationVO;

    }

}
