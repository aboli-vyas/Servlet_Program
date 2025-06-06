package com.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
		
		//Database Connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee","root","root");
			PreparedStatement ps = c.prepareStatement("insert into emp(empId,firstName,lastName,email,phone,dob,gender,address,city,state,zip,department,position,joingDate,salary)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			ps.setInt(1,empId11 );
			ps.setString(2, firstName1);
			ps.setString(3, lastName1);
			ps.setString(4, email1);
			ps.setLong(5, phone11);
			ps.setString(6, dob1);
			ps.setString(7, gender1);
			ps.setString(8, address1);
			ps.setString(9, city1);
			ps.setString(10, state1);
			ps.setInt(11, zip11 );
			ps.setString(12, department1);
			ps.setString(13, position1);
			ps.setString(14, joiningDate1);
			ps.setLong(15, salary11);
			
			ps.executeUpdate();
			System.out.println("Data inserted");
			out.print("<h1>" + "Data inserted" + "</h11>");
			
			
		} catch (Exception e) {
			
		}
		
		
		
		
	}

}
