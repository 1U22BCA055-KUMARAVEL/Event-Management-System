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
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Event"; 
		String username="root";
		String password="globalwarn1705";
		String user1=request.getParameter("username");
		String pass1=request.getParameter("password");
		
			Connection con=DriverManager.getConnection(url,username,password); //gets database connection
			PreparedStatement st=con.prepareStatement("insert into userinfo values(?,?)");
		st.setString(1, user1);
		st.setString(2, pass1);
		int rs=st.executeUpdate();
		

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
