package com.dza.javaee.web;

import com.dza.javaee.domain.Province;
import com.dza.javaee.service.ProvinceService;
import com.dza.javaee.service.serviceimpl.ProvinceServiceimpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( "/provinceServlet")
public class ProvinceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ProvinceService service=new ProvinceServiceimpl();
        List<Province>list=service.findall();
        //response.getWriter().print(list);
        //System.out.println(list);
        ObjectMapper mapper=new ObjectMapper();
        String json=mapper.writeValueAsString(list);
        System.out.println(json);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request,response);
    }
}
