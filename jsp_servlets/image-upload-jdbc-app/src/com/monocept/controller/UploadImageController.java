package com.monocept.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.monocept.connection.DB;
import com.monocept.service.ImageService;

@WebServlet("/upload")
@MultipartConfig
public class UploadImageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UploadImageController() {
		System.out.println("inside upload image controller");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("upload.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int id = Integer.valueOf(request.getParameter("id"));
		Part filePart = request.getPart("image");
		InputStream image = filePart.getInputStream();
		
		new ImageService().uploadImage(id, image);
		
		response.sendRedirect("home");
		
	}
}
