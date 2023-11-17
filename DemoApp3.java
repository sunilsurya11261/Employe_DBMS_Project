package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/demo/*" }, initParams = { @WebInitParam(name = "url", value = "jdbc:mysql:///ineuron"),
		@WebInitParam(name = "user", value = "root"), @WebInitParam(name = "password", value = "sunilsurya@12") })
public class DemoApp3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection = null;
	private PreparedStatement pstmt = null;
	private ResultSet resultSet = null;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void init() {
		String url = getInitParameter("url");
		String user = getInitParameter("user");
		String password = getInitParameter("password");

		try {
			connection = DriverManager.getConnection(url, user, password);

			if (connection != null) {
				System.out.println("Connection established succesfully....");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if(request.getRequestURI().endsWith("demo")) {
		String sqlSelectQuery = "select id,name,age,address,mobile from employee where email=? and password=? and bf=?";
		String id = request.getParameter("mail");
		String password = request.getParameter("password");
		String New = request.getParameter("bestfrnd");
		String sqlSelectQuery1 = "select id,name,age,address,mobile from employee where id!=2";


		if(id.equals("admin@123")&&password.equals("admin123")&&New.equals("admin"))
		{

			PrintWriter out = response.getWriter();
			try {
				pstmt = connection.prepareStatement(sqlSelectQuery1);
				

				if (pstmt != null) {
					resultSet = pstmt.executeQuery();
//					PrintWriter out = null;
					out = response.getWriter();
					out.println("<html>");
					out.println("<head>");
					out.println("<style>");
					out.println("h1{");
					out.println("font-size: 30px;");
					out.println("color: #fff;");
					out.println("text-transform: uppercase;");
					out.println("font-weight: 300;");
					out.println("text-align: center;");
					out.println("margin-bottom: 15px;");
					out.println("}");
					out.println("table{");
					out.println("width:100%;");
					out.println("table-layout: fixed;");
					out.println("}");
					out.println(".tbl-header{");
					out.println(" background-color: rgba(255,255,255,0.3);");
					out.println(" }");
					out.println(".tbl-content{");
					out.println("height:300px;");
					out.println("overflow-x:auto;");
					out.println("margin-top: 0px;");
					out.println("border: 1px solid rgba(255,255,255,0.3);");
					out.println("}");
					out.println("th{");
					out.println("padding: 20px 15px;");
					out.println("text-align: left;");
					out.println("font-weight: 500;");
					out.println("font-size: 12px;");
					out.println("color: #fff;");
					out.println("text-transform: uppercase;");
					out.println("}");
					out.println("td{");
					out.println("padding: 15px;");
					out.println("text-align: left;");
					out.println("vertical-align:middle;");
					out.println("font-weight: 300;");
					out.println("font-size: 12px;");
					out.println("color: #fff;");
					out.println("border-bottom: solid 1px rgba(255,255,255,0.1);");
					out.println("}");
					out.println("@import url(https://fonts.googleapis.com/css?family=Roboto:400,500,300,700);");
					out.println("body{");
					out.println("background: -webkit-linear-gradient(left, #25c481, #25b7c4);");
					out.println("background: linear-gradient(to right, #25c481, #25b7c4);");
//					out.println("background: rgb(41,38,98);");
//					out.println("background: linear-gradient(90deg, rgba(41,38,98,1) 0%, rgba(123,179,189,1) 48%, rgba(53,175,200,1) 100%);");
					out.println("font-family: 'Roboto', sans-serif;");
					out.println("}");
					out.println("section{");
					out.println("margin: 50px;");
					out.println("}");
					out.println("::-webkit-scrollbar {");
					out.println("width: 6px;");
					out.println("}");
					out.println("::-webkit-scrollbar-track {");
					out.println("-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);");
					out.println("}");
					out.println("::-webkit-scrollbar-thumb {");
					out.println("-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); ");
					out.println("}");
					out.println("</style>");//style='color:#192A56'
					out.println("</head>");
					 out.println("<body>");// style='background-image: linear-gradient(135deg, #FFEFBA 0%, #FFFFFF 100%);;'
					 out.println("<section>");
					 out.println("<h1>INFOSYS EMPLOYEES DATA</h1>");
					 out.println("<div class='tbl-header'>");
					 out.println("<table cellpadding='0' cellspacing='0' border='0'>");
					 out.println("<thead>");
					 out.println("<tr>");
					 out.println("<th>EMPID</th>");
					 out.println("<th>EMPNAME</th>");
					 out.println("<th>EMPAGE</th>");
					 out.println("<th>EMPADDRESS</th>");
					 out.println("<th>EMPMOBILE</th>");
					 
					 out.println("</tr>");
					 out.println("</thead>");
					 out.println("</table>");
					 out.println("</div>");
					 out.println("<div class='tbl-content'>");
					 out.println("<table cellpadding='0' cellspacing='0' border='0'>");
					 out.println("<tbody>");
//					 out.println("<tr>");
					 
					 out.println("</head>");


					if (resultSet != null) {
						while (resultSet.next()) {
							 
							 
							 out.println("<tr>");
							 out.println("<td>"+resultSet.getInt(1)+"</td>");
							 out.println("<td>"+resultSet.getString(2)+"</td>");
							 out.println("<td>"+resultSet.getInt(3)+"</td>");
							 out.println("<td>"+resultSet.getString(4)+"</td>");
							 out.println("<td>"+resultSet.getInt(5)+"</td>");
							 out.println("</tr>");
						}
						 out.println("</tbody>");
						out.println("</table>");
						  out.println("</div>");
						  out.println("</section>");
						 out.println("<h2>Thanks for Login "+resultSet.getString(2)+"</h2>");
						 out.println("<a href='images/home.html'>LOGIN OUR WEBSITE</a>");
							out.println("</body>");
							out.println("</html>");
//						}
					} 
					out.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		else {

		try {

			pstmt = connection.prepareStatement(sqlSelectQuery);

			if (pstmt != null) {
				pstmt.setString(1, id);
				pstmt.setString(2, password);
				pstmt.setString(3, New);
				
			}

			if (pstmt != null) {
				resultSet = pstmt.executeQuery();
				PrintWriter out = null;
				out = response.getWriter();
				out.println("<html>");

				if (resultSet != null) {
					
					if (resultSet.next()) {
						out.println("<head>");
						 out.println("<style>");
						 out.println("h1 {");
						 out.println("font-family: Arial, sans-serif;");
						 out.println("font-size: 24px;");
						 out.println("color: #192A56;");
						 out.println("font-style: normal;");
						 out.println("}");
						 out.println("table {");
						 out.println("border: 2px solid #ccc;");
						 out.println("border-collapse: inherit;");
						 out.println(" margin: 1;");
						 out.println("padding: 0;");
						 out.println("width: 100%;");
						 out.println("table-layout: fixed;");
						 out.println("}");
						 out.println("table caption {");
						 out.println("font-size: 1.5em;");
						 out.println("margin: .5em 0 .75em;");
						 out.println("}");
						 out.println("table tr {");
						 out.println("background-color:#DAE0E2 ;");//#f8f8f8
						 out.println("border: 5px solid #ddd;");
						 out.println("padding: .35em;");
						 out.println("}");
						 out.println("table th,");
						 out.println("table td {");
						 out.println("padding: .625em;");
						 out.println("text-align: center;");
						 out.println("}");
						 out.println("table th {");
//						 out.println("background-color:#8395A7 ;");
						 out.println("background-color:#99AAAB ;");

						 out.println("font-size: .85em;");
						 out.println("letter-spacing: .1em;");
						 out.println("text-transform: uppercase;");
						 out.println("}");
						 out.println("@media screen and (max-width: 600px) {");
						 out.println("table {");
						 out.println("border: 2px;");
						 out.println("}");
						 out.println("table caption {");
						 out.println("font-size: 1.3em;");
						 out.println("}");
						 out.println("table thead {");
						 out.println("border: none;");
						 out.println("clip: rect(0 0 0 0);");
						 out.println("height: 1px;");
						 out.println("margin: -1px;");
						 out.println("overflow: hidden;");
						 out.println("padding: 0;");
						 out.println("position: absolute;");
						 out.println("width: 1px;");
						 out.println("}");
						 out.println("table tr {");
						 out.println("border-bottom: 3px solid #ddd;");
						 out.println("display: block;");
						 out.println("margin-bottom: .625em;");
						 out.println("}");
						 out.println("table td {");
						 out.println("border-bottom: 1px solid #ddd;");
						 out.println("display: block;");
						 out.println("font-size: .8em;");
						 out.println("text-align: right;");
						 out.println("}");
						 out.println("table td::before {");
						 out.println("content: attr(data-label);");
						 out.println("float: left;");
						 out.println("font-weight: bold;");
						 out.println("text-transform: uppercase;");
						 out.println("}");
						 out.println("table td:last-child {");
						 out.println("border-bottom: 0;");
						 out.println("}");
						 out.println("}");
						 out.println("body {");
						 out.println("font-family: 'Open Sans', sans-serif;");
						 out.println("line-height: 1.25;");
//						 out.println("background-color: #85FFBD;background-image: linear-gradient(45deg, #85FFBD 0%, #FFFB7D 100%);");
						out.println("background: linear-gradient(90deg, rgba(41,38,98,1) 0%, rgba(123,179,189,1) 48%, rgba(53,175,200,1) 100%);");

//						 
						 out.println("}");
						 out.println("</style>");//style='color:#192A56'
						 
						 
						 out.println("</head>");
						 out.println("<body>");// style='background-image: linear-gradient(135deg, #FFEFBA 0%, #FFFFFF 100%);;'
						 out.println("<table>");
						 out.println("<caption>");
						 out.println("<h1>EMPLOYEE DATA FOR GIVEN ID :: "+resultSet.getInt(1)+"</h1>");
						 out.println("<center>");
						 out.println("<small>Infosys private limited</small>");
						 out.println("</center>");
						 out.println("</caption>");
						 out.println("<thead>");
						 out.println("<tr>");
						 out.println("<th>ID</th>");
						 out.println("<th>NAME</th>");
						 out.println("<th>AGE</th>");
						 out.println("<th>ADDRESS</th>");
						 out.println("<th>Mobile</th>");
						 out.println("</tr>");
						 out.println("</thead>");
						 out.println("<tbody>");
						 out.println("<tr>");
						 out.println("<td>"+resultSet.getInt(1)+"</td>");
						 out.println("<td>"+resultSet.getString(2)+"</td>");
						 out.println("<td>"+resultSet.getInt(3)+"</td>");
						 out.println("<td>"+resultSet.getString(4)+"</td>");
						 out.println("<td>"+resultSet.getInt(5)+"</td>");
						 out.println("</tr>");
						 out.println("</tbody>");
						 out.println("</table>");
						 out.println("</body>");
						 out.println("</html>");
						 out.println("<center>");
						 out.println("<h2 style='margin-top:90;color:#192A56;'>Thanks for Login "+resultSet.getString(2)+"</h2>");
						 out.println("<a href='images/home.html'>LOGIN OUR WEBSITE</a>");
						 out.println("</center>");
					}
					else {
//						out.println("<h1 style='color:red;text-align:center;margin-top:260'>LOGIN FAILED TRY AGAIN</h1>");
//						out.println("</body>");
//						out.println("</html>");
						RequestDispatcher rd = request.getRequestDispatcher("loginerror.html");
						rd.forward(request, response);
					}
				} 
				out.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		}
		else{// (request.getRequestURI().endsWith("register.html")) {
			String sqlInsertQuery = "insert into employee(`name`,`age`,`address`,`password`,`email`,`mobile`,`bf`)values(?,?,?,?,?,?,?)";
			String username = request.getParameter("username");
			String userage = request.getParameter("userage");
			String useraddr = request.getParameter("useraddr");
			String useremail = request.getParameter("useremail");
			String userpassword = request.getParameter("userpassword");
			String userphone= request.getParameter("userphone");
			String bf= request.getParameter("bf");

			try {
				if (connection != null) {
					pstmt = connection.prepareStatement(sqlInsertQuery);
				}
				if (pstmt != null) {
					pstmt.setString(1, username);
					pstmt.setInt(2, Integer.parseInt(userage));
					pstmt.setString(3, useraddr);
					pstmt.setString(4, userpassword);
					pstmt.setString(5, useremail);
					pstmt.setInt(6, Integer.parseInt(userphone));
					pstmt.setString(7, bf);
				}
				if (pstmt != null) {
					int rowCount = pstmt.executeUpdate();
					System.out.println(rowCount);
					PrintWriter out = null;
					out = response.getWriter();
//					out.println("<html>");
//					out.println("<body style='background: linear-gradient(90deg,rgb(235, 231, 8)0%,rgb(136, 225, 10)90%);'>");
					if (rowCount == 1) {
//						out.println("<h1 style='color:green;text-align:center;font-size: 60px;font-weight: 300;margin-top: 20%;'>REGISTRATION SUCCESSFULL</h1>"); 
						  System.out.println("Its working");
						RequestDispatcher rd = request.getRequestDispatcher("../regis.html");
						rd.forward(request, response);
					} else {
//						out.println("<h1 style='color:red;text-align:center'>REGISTRATION FAILED TRY AGAIN WITH THE FOLLOEING LINK..</h1>");
//						out.println("<a href='./register.html'>|REGISTRATION|</a>");
						RequestDispatcher rd = request.getRequestDispatcher("../error.html");
						rd.forward(request, response);
//						out.println("</body>");
//						out.println("</html>");
					}
					out.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
