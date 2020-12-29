package com.masotti.web.web;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.masotti.web.bean.City;
import com.masotti.web.service.ICityService;

@WebServlet(name = "GetCities", urlPatterns = {"/GetCities"})
public class GetCities extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Inject
    private ICityService cityService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/html;charset=UTF-8");

        List<City> cities = cityService.getCities();
        request.setAttribute("cities", cities);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("listCities.jsp");
        dispatcher.forward(request, response);
    }
}