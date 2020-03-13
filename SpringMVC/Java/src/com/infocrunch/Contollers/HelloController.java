package com.infocrunch.Contollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.Controller;

import java.util.HashMap;
import java.util.Map;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {

        String name=httpServletRequest.getParameter("name");

        Map map=new HashMap();
        map.put("msg",name);

        return new ModelAndView("success",map);
    }
}
