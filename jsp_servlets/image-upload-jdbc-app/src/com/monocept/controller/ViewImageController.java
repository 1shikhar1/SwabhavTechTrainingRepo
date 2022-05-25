package com.monocept.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.service.ImageService;

@WebServlet("/viewImage")
public class ViewImageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewImageController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("viewImage.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");

		request.setAttribute("id", id);
		
		RequestDispatcher view = request.getRequestDispatcher("view.jsp");
		view.forward(request, response);
	}

}
