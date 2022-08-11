import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductDAO 
{
	int search_id;
	public void value(int search_id)
	{
		this.search_id=search_id;
	}
	
	
	public ResultSet retrieve() throws SQLException, ClassNotFoundException
	{
		
		
		Connection con=DbUtil.getCon();
		Statement st=con.createStatement();
		ResultSet rs=null;
		if(con!=null)
		{
			Scanner sc = new Scanner(System.in);
			Product p =new Product();
			/*p.setProd_id(sc.nextInt());
			p.getProd_id()*/;
			
			System.out.println("Connection established");
			String sql="select * from product where prod_id='"+search_id+"'";
			 rs=st.executeQuery(sql);
			 return rs;
		}
		else
		{
			System.out.println("Sorry! Connection Failed");
		}
		return rs;
	}
}
