package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			//Call Connection Method
				PrintWriter out=response.getWriter();
				Connection con=DatabaseConnection.getMyConnection();
				String id = request.getParameter("id");
			//Write sql command
				String str="select * from products where id="+id;
				
				//to execute query create object of Statement
				Statement  ps=con.createStatement();
				//get ResultSet
				ResultSet ans =ps.executeQuery(str);
				//next method checks for nextrecord
				
				
				//To read values from ResultSet
				if(ans.next()) {
					out.println("<table border=3>");
					out.println("<tr><th>id</th><th>name</th><th>price</th></tr>");
					out.println("<tr>");
					out.print("<td>"+ans.getInt("id")+"</td>");
					out.print("<td>"+ans.getString("name")+"</td>");
					out.print("<td>"+ans.getInt("price")+"</td>");
					out.println("</tr>");
					out.println("</table>");
				}
				else {
				out.println("No records found!");
				}
				con.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}