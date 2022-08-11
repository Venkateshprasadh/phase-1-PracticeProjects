

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Retrieve
 */
public class Retrieve extends HttpServlet 
{	Product p =new Product();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Retrieve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int search_id= Integer.parseInt(request.getParameter("id"));
		
		p.setProd_id(search_id);
		ProductDAO  dao = new ProductDAO();
		dao.value(search_id);
		try {
			ResultSet rs=dao.retrieve();
			PrintWriter pw = response.getWriter();
			int flag=-1;
			while(rs.next())
			{
				if(rs.getInt(1)==search_id)
				{
					flag=1;
					pw.println("<table>");
					pw.println("<tr>");
					pw.println("<td>ID</td>");
					pw.println("<td>PRODUCT NAME</td>");
					pw.println("<td>PRICE</td>");
					pw.println("</tr>");
					pw.println("<tr>");
					pw.println("<td>"+rs.getInt(1)+"</td>");
					pw.println("<td>"+rs.getString(2)+"</td>");
					pw.println("<td>"+rs.getString(3)+"</td>");
					pw.println("</tr>");
					pw.println("</table>");
					
					//pw.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				   break;
				}
				
			}
			if(flag==-1)
			{
				pw.print("Id Not Found");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
