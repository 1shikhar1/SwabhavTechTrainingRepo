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

@WebServlet("/editStudent")
public class EditStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int rollNo;
       
    public EditStudentController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int indx = Integer.valueOf(request.getParameter("id"));
		
//		System.out.println("Inside do get id: "+id);
		
		StudentService service = StudentService.getInstance();
		List<Student> students = service.getStudents();
		
		Student student = null;
		for(Student std: students) {
			if(std.getRollNo()==indx) {
				student = std;
			}
		}
		
		request.setAttribute("student", student);
		RequestDispatcher view = request.getRequestDispatcher("editStudent.jsp");
		view.forward(request, response);
		
		
//		service.removeStudent(Integer.valueOf(id));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
