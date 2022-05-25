package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Student;

import com.monocept.service.StudentService;

@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeController() {
		System.out.println("Inside home controller");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		StudentService service = StudentService.getInstance();
		List<Student> result = service.getStudents();

		request.setAttribute("students", result);

		RequestDispatcher view = request.getRequestDispatcher("home2.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();

		int rollNo = Integer.valueOf(request.getParameter("rollNo"));

		StudentService service = StudentService.getInstance();
		List<Student> students = service.getStudents();

		Student student = null;
		for (Student std : students) {
			if (std.getRollNo() == rollNo) {
				student = std;
			}
		}

		if (student != null) {
			out.println(1);
		}
	}

}
