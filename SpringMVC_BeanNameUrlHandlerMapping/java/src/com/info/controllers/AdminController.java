package com.info.controllers;

import com.info.vo.LoginCred;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AdminController  {
    @RequestMapping(value = "/login.htm",method = RequestMethod.POST)
    public ModelAndView login(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, LoginCred cred){

        Map<String,String> map=new HashMap<String,String>();
        map.put("username",cred.getUsername());
        map.put("password",cred.getPassword());

        return new ModelAndView("registration",map);
    }
}
