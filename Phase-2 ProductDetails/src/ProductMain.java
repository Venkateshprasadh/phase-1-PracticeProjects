import java.sql.SQLException;

public class ProductMain 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ProductDAO dao = new ProductDAO();
		dao.retrieve();
	}
}
