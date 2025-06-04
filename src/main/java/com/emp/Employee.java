package com.emp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submit")
public class Employee extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empId1 = request.getParameter("empId");
		String firstName1 = request.getParameter("firstName");
		String lastName1 = request.getParameter("lastName");
		String email1 = request.getParameter("email");
		String phone1 = request.getParameter("phone");
		String dob1 = request.getParameter("dob");
		String gender1 = request.getParameter("gender");
		String address1 = request.getParameter("address");
		String city1 = request.getParameter("city");
		String state1 = request.getParameter("state");
		String zip1 = request.getParameter("zip");
		String department1 = request.getParameter("department");
		String position1 = request.getParameter("position");
		String joiningDate1 = request.getParameter("joiningDate");
		String salary1 = request.getParameter("salary");
		
		int empId11 = Integer.parseInt(empId1);
		long phone11 = Long.parseLong(phone1);
		int zip11 = Integer.parseInt(zip1);
		long salary11 = Long.parseLong(salary1);
		
		System.out.println(empId11);
		System.out.println(firstName1);
		System.out.println(lastName1);
		System.out.println(email1);
		System.out.println(phone11);
		System.out.println(dob1);
		System.out.println(gender1);
		System.out.println(address1);
		System.out.println(city1);
		System.out.println(state1);
		System.out.println(zip11);
		System.out.println(department1);
		System.out.println(position1);
		System.out.println(joiningDate1);
		System.out.println(salary11);
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><head>");
		out.println("<style>");
		out.println("body { background-color: lightblue;font-family: Lucida Handwriting; color: red}");
		out.println("</style>");
		out.println("</head>");
		
		out.print("<h2>"+empId11 +"</h2>");
		out.print("<h2>"+firstName1 +"</h2>");
		out.print("<h2>"+lastName1 +"</h2>");
		out.print("<h2>"+email1 +"</h2>");
		out.print("<h2>"+phone11 +"</h2>");
		out.print("<h2>"+dob1 +"</h2>");
		out.print("<h2>"+gender1 +"</h2>");
		out.print("<h2>"+address1 +"</h2>");
		out.print("<h2>"+city1 +"</h2>");
		out.print("<h2>"+state1 +"</h2>");
		out.print("<h2>"+zip11 +"</h2>");
		out.print("<h2>"+department1 +"</h2>");
		out.print("<h2>"+position1 +"</h2>");
		out.print("<h2>"+joiningDate1 +"</h2>");
		out.print("<h2>"+salary11 +"</h2>");
		
		out.print("</body>");
		out.print("</html>");
		
		
		
		
	}

}
