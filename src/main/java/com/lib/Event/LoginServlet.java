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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/Event"; 
			String username="root";
			String password="globalwarn1705";
			String user1=request.getParameter("username");
			String pass1=request.getParameter("password");
			
			PrintWriter out=response.getWriter();
					Connection con=DriverManager.getConnection(url,username,password); //gets database connection
					PreparedStatement st=con.prepareStatement("Select username,password from userinfo where username=? and password=?");
			st.setString(1, user1);
			st.setString(2, pass1);
			ResultSet rs=st.executeQuery();
			boolean login=false;
			while(rs.next()) {
				String user=rs.getString("username");
				String pass=rs.getString("password");
				if(user.equals(user1) && pass.equals(pass1)) {
					login=true;
					if(login) {
						response.sendRedirect("home.jsp");
					}
					
				}
				else {
					response.sendRedirect("error.jsp");
				}
				
			}
					
					
					
		}
					catch(Exception e) {
						e.printStackTrace();
					}
		
	}

//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}

}
