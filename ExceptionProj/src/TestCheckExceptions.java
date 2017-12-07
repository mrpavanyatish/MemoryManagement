import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestCheckExceptions {

	// if we add a throws clause to main method
	// then the default handler will handle this exception
	public static void main(String[] args)throws SQLException, IOException {
		
		Connection conn = null;
		
		//handling exception explicity, i.e without try catch
		//DriverManager.getConnection(" ");
		process();
		
		
		//handling exception using the try catch
		/*try 
		{
			conn = DriverManager.getConnection("");
		}
	    catch (SQLException e) 
		{
			e.printStackTrace();
		}
*/
	}
	
	/*public static void process() throws SQLException
	{
		Connection conn = DriverManager.getConnection(" ");
		//db operations
		//db operaions
		
		conn.close();
	}*/

	/*public static void process() throws SQLException
	{
		Connection conn=null;
		try {
			conn = DriverManager.getConnection(" ");
			
			//db operations
			//db operaions
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			
				conn.close();
			
		}
		
	}*/
	
	// try resource statement
	// how to check the resource
	// in compile (javap java.io.Reader)
	public static void process() throws SQLException, FileNotFoundException, IOException
	{
		//resource(Connection) is used
		try(Connection conn = DriverManager.getConnection(" ");FileReader fileReader = new FileReader(""))
		{
			
			
			//db operations
			//db operaions
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// no need to write finally block code, it is taken care by try resource statement
		// try with resources will close the statement after try catch block
	}
	
}
