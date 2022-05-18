package com.monocept.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Student;
import com.monocept.service.StudentService;

@WebServlet("/courses")
public class CoursesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CoursesController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService service = StudentService.getInstance();
		Student student = service.getStudent(request.getParameter("rollNo"));

		request.setAttribute("courses", student.getCourses());

		RequestDispatcher view = request.getRequestDispatcher("courses.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
