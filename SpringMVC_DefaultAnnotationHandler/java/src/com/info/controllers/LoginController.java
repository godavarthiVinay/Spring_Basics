package com.info.controllers;


import com.info.vo.LoginVO;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@CrossOrigin
@Controller
@RequestMapping("/auth")
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public @ResponseBody LoginVO loginValidate(HttpServletRequest request, HttpServletResponse response ) throws Exception {


        LoginVO loginVO=new LoginVO();

        String username=request.getParameter("username");
        String password=request.getParameter("password");

        if(username.equals("vinay") && password.equals("vinay")){
            loginVO.setUsername(username);
            loginVO.setLoginUserId(1);
            loginVO.setName("VINAY");
            loginVO.setRoleId(3);
            loginVO.setValid(true);
            loginVO.setErrMessage("Sucessfully Log In");

            HttpSession session=request.getSession(true);
            session.setAttribute("user",loginVO);
            session.setMaxInactiveInterval(60);

        }else {

            loginVO.setValid(false);
            loginVO.setErrMessage("Invalid Username and Password");
            HttpSession session=request.getSession(false);
            if (session != null){
                session.invalidate();
            }

            //throw new Exception(loginVO.getErrMessage());
        }


        return loginVO;

    }

}
