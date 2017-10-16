package Web;
hahahaha
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
public class DBconnection {
    //Çý¶¯³ÌÐòÃû select insert delete modify
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/BookDB";
    private static String user = "root";
    private static String password = "";
    public Connection getConnection() 
    {
    	Connection conn = null;
    try {
    	Class.forName(driver);
    	System.out.println("Success loading MySQL driver!");
    	
    }catch(Exception e){
    	System.out.println("Error loading MySQL driver!");
    	e.printStackTrace();
    }
    try {
    	conn=DriverManager.getConnection(url,user,password);
    	System.out.println("Success connect MySQL server!");
    }catch(Exception e){
    	e.printStackTrace();
    }
    return conn;
    }
    public int insert(String insert)
    {
    	int i=0;
    	Connection conn = getConnection();
    	
    	try{  
       	 PreparedStatement preStatement = conn.prepareStatement(insert);  
       	 i = preStatement.executeUpdate();  
       	}  catch (SQLException e){  
       	 e.printStackTrace();  
       	}  
       	return i;
    }
    public int modify(String modify){  
    	int  i = 0;  
    	Connection conn = getConnection();  
    	try{  
    	 PreparedStatement preStatement = conn.prepareStatement(modify);  
    	 i = preStatement.executeUpdate();  
    	}  catch (SQLException e)  {  
    	 e.printStackTrace();  
    	}  
    	return i;
    }
    public List<String> select(String select){ 
    	Connection conn = getConnection();
    	List<String> list = new LinkedList<String>();
    	try  {  
    	 Statement statement = conn.createStatement();  
    	 ResultSet rs = statement.executeQuery(select);  
    	 while(rs.next()){  
    	 for(int i = 1;i <= rs.getMetaData().getColumnCount();i++){
    	 list.add(rs.getString(i));}
    	 }  
    	}catch (SQLException e) {  
    	 e.printStackTrace();  
    	}  
    	return list;  
    }
    public int delete(String delete)  {  
    	int i = 0;  
    	Connection conn = getConnection();
    	try {  
    	 Statement statement = conn.createStatement();  
    	 i = statement.executeUpdate(delete);  
    	} catch (SQLException e)  {  
    	 e.printStackTrace();  
    	}  
    	return i;
    }  
}