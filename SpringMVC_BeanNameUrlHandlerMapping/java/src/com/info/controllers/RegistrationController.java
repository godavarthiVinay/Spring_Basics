package com.info.controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


import java.util.HashMap;
import java.util.Map;

public class RegistrationController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {

        Map map=new HashMap();
        map.put("name",httpServletRequest.getParameter("name"));
        map.put("emailId",httpServletRequest.getParameter("emailId"));
        map.put("address",httpServletRequest.getParameter("address"));
        map.put("mobileNumber",httpServletRequest.getParameter("mobileNumber"));

        return new ModelAndView("sucess",map);
    }
}
