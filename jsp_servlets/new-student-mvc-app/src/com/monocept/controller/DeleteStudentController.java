package com.monocept.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Student;
import com.monocept.service.StudentService;

@WebServlet("/deleteStudent")
public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteStudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int indx = Integer.valueOf(request.getParameter("id"));

		StudentService service = StudentService.getInstance();
		List<Student> students = service.getStudents();

		Student student = null;
		for (Student std : students) {
			if (std.getRollNo() == indx) {
				student = std;
			}
		}

		students.remove(student);
		response.sendRedirect("home");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
