package com.monocept.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Student;
import com.monocept.repository.StudentRepository;
import com.monocept.service.StudentService;

@WebServlet("/coursesDetails")
public class CoursesDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CoursesDetailsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentRepository repo = StudentRepository.getInstance();
		
		HashMap<String, Integer> data = null;
		
		try {
			data = (HashMap) repo.getCoursesDetails();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		request.setAttribute("coursesDetails", data);

		RequestDispatcher view = request.getRequestDispatcher("coursesDetails.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
