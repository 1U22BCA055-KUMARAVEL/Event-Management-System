package com.lib.Event;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Event
 */
@WebServlet("/Event")
public class Event extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String url="jdbc:mysql://localhost:3306/Event";
			String username="root";
			String password="globalwarn1705";
			try {
				String name = request.getParameter("name");
	            String phoneno = request.getParameter("phone_no");
	            String address = request.getParameter("address");
	            String pincode = request.getParameter("pincode");

				Class.forName("com.mysql.cj.jdbc.Driver");
				PrintWriter out=response.getWriter();
				Connection con=DriverManager.getConnection(url,username,password);
				PreparedStatement st=con.prepareStatement("Select name from eventregister");
				ResultSet rs=st.executeQuery();
				while(rs.next()) {
					String name1=rs.getString("name");
					out.println("name "+name1);
				}
				PreparedStatement st1=con.prepareStatement("insert into eventregister(name,phone_no,address,pincode) values(?,?,?,?)");
				st1.setString(1, name);
				st1.setString(2, phoneno);
				st1.setString(3, address);
				st1.setString(4, pincode);
				int rows=st1.executeUpdate();
				if(rows>0){
					out.println("Record inserted");
					out.println("added Record :"+(name) + (phoneno) + (address) + (pincode));
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
}
