package com.monocept.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.model.Student;
import com.monocept.model.dto.UserDto;
import com.monocept.service.StudentDatabaseService;
import com.monocept.service.StudentService;

@WebServlet("/addStudent")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddStudentController() {
        super();
        System.out.println("Inside add controller");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Inside add student controller do get");
		HttpSession session = request.getSession();
		UserDto user = (UserDto)session.getAttribute("user");
		
		if(user==null) {		
			response.sendRedirect("login");
		}
		else {
			RequestDispatcher view = request.getRequestDispatcher("addStudent.jsp");
			view.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Inside add student controller do post");
		
		StudentService service = StudentService.getInstance();
//		List<Student> students = service.getStudents();
		
		String rollNo = request.getParameter("rollNo");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String cgpa = request.getParameter("cgpa");
		
		Student student = new Student(Integer.valueOf(rollNo),fname,lname,Double.valueOf(cgpa));
		service.addStudent(student);
		
		List<Student> students = service.getStudents();
		request.setAttribute("students", students);
		
		response.sendRedirect("home");  
	}

}
