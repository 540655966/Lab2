package Web;
lalala
//这是后台的动作函数，实现功能
/*
 * 这里写具体的 add,delete，search,update函数
public class Action {
	public static Connection con;
	public static String driver = "com.mysql.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/BookDB";// URL指向要访问的数据库名mydata
	public static String user = "root";//用户名
	public static String password = "";//密码

	public static void insertintobook() {
		try {
			Scanner sc = new Scanner(System.in 

);
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			java.sql.PreparedStatement tmp;
			tmp = con.prepareStatement("insert into book(ISBN,Title,AuthorID,Publisher,PublishDate,Price)"+"values(?,?,?,?,?,?)");
			System.out.println("请输入图书ISBN号");
			String str1 = sc.nextLine();
			tmp.setString(1, str1);
			System.out.println("请输入图书标题");
			String str2 = sc.nextLine();
			tmp.setString(2, str2);
			System.out.println("请输入图书作者ID");
			int Authid = sc.nextInt();
			tmp.setInt(3, Authid);
			System.out.println("请输入图书出版社");
			sc = new Scanner(System.in 

);
			String str3 = sc.nextLine();
			tmp.setString(4, str3);
			System.out.println("请输入图书出版日期(yyyy-mm-dd格式)");
			String str4 = sc.nextLine();
			tmp.setString(5, str4);
			System.out.println("请输入图书价格");
			float pri = sc.nextFloat();
			tmp.setFloat(6, pri);
			tmp.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// 数据库连接失败异常处理
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
	}

	public static void printbook() {
		try {
			// 加载驱动程序
			Class.forName(driver);
			// 1.getConnection()方法，连接MySQL数据库！！
			con = DriverManager.getConnection(url, user, password);
			if (!con.isClosed())
				System.out.println("连接数据库成功。");
			// 2.创建statement类对象，用来执行SQL语句！！
			Statement statement = con.createStatement();
			// 要执行的SQL语句
			String sql = "select * from book";
			// 3.ResultSet类，用来存放获取的结果集！！
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("执行结果如下所示:");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("ISBN     " + "\t" + "Title"+"\t\t"+"AuthorID"+"\t"+"Publisher"+"\t"+"PublishDate"+"\t"+"Price");
			System.out.println("--------------------------------------------------------------------");

			String ISBN = null;
			String Title = null;
			String AuthorID = null;
			String Publisher = null;
			String PublishDate = null;
			String Price = null;
			while (rs.next()) {
				ISBN = rs.getString("ISBN");
				Title = rs.getString("Title");
				AuthorID = rs.getString("AuthorID");
				Publisher = rs.getString("Publisher");
				PublishDate = rs.getString("PublishDate");
				Price = rs.getString("Price");

				// 输出结果
				System.out.println(ISBN+"\t"+Title+"\t"+AuthorID+"\t"+Publisher+"\t"+PublishDate+"\t"+Price);
			}
			rs.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// 数据库驱动类异常处理
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			// 数据库连接失败异常处理
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("数据库数据成功获取！！");
		}
	}

	public static void deletebook(){
		try {
			// 加载驱动程序
			Class.forName(driver);
			// 1.getConnection()方法，连接MySQL数据库！！
			con = DriverManager.getConnection(url, user, password);
			java.sql.PreparedStatement tmp;
			
			con.close();
		} catch (ClassNotFoundException e) {
			// 数据库驱动类异常处理
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			// 数据库连接失败异常处理
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("数据库数据成功获取！！");
		}
	}
	public static void Action(String[] args) {
		//insertintobook();
		printbook();
	}

}
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Action{

	
        public static void Query()
        {
        	String name = request.getParameter("name");
        	DBconnection con=new DBconnection();
            String ID=null;
            String TITLE=null;
            String sql1 = "select * from Author Where Name="+"\""+name+"\"";
            list list1=con.select(sql1);
            ID = list1.get(0);
            String sql2="select title from Book Where AuthorID="+"\""+ID+"\"";
            list list2=con.select(sql2);//应该是书名的集合
            System.out.print(list2);
        }
        public static void showInformation(String title)
        {
        	DBconnection con=new DBconnection();
            String sql1 = "select * from Book Where Title="+"\""+title+"\"";
            list list1=con.select(sql1);
            String sql2="select * from Author Where AuthorID="+"\""+list1.get(2)+"\"";
            list list2=con.select(sql2);
            System.out.print("图书信息:");
            System.out.print("\n图书的ISBN:");
            System.out.print(list1.get(0));
            System.out.print("\n书名:");
            System.out.print(list1.get(1));
            System.out.print("\n出版社:");
            System.out.print(list1.get(3));
            System.out.print("\n出版日期:");
            System.out.print(list1.get(4));
            System.out.print("\n价格:");
            System.out.print(list1.get(5));
            System.out.print("\n作者信息:");
            System.out.print("\n作者编号:");
            System.out.print(list2.get(0));
            System.out.print("\n作者名字:");
            System.out.print(list2.get(1));
            System.out.print("\n作者年龄:");
            System.out.print(list2.get(2));
            System.out.print("\n作者国籍:");
            System.out.print(list2.get(3));
        }
        public static void deleteBook(String isbn)
        {
        	DBconnection con=new DBconnection();
        	String sql1 = "delete from Book Where ISBN="+"\""+isbn+"\"";
        	int flag=con.delete(sql1);
        	if (flag==1)
        		System.out.print("删除成功！");
        	else
        		System.out.print("删除失败！");
        	
        }
        public static int addBook(String isbn,String title,String name,String publisher,String publishDate,String price,String id,String age,String country)
        {
        	//Scanner sc=new Scanner(System.in);
        	DBconnection con=new DBconnection();
        	String sql0 = "select * from Book Where ISBN="+"\""+isbn+"\"";
        	list list0=con.select(sql0);
        	if(list0.size()!=0)
        	{
        		System.out.print("图书已存在！");
        		return 0;
        	}
        	String sql1 = "select * from Author Where Name="+"\""+name+"\"";
        	list list1=con.select(sql1);
        	if(list1.size()==0)//没有这个作者
        	{
        		//String id=new String();
        		//String age=new String();
        		//String country=new String();
        		//System.out.print("作者不在库中，请输入作者编号：\n");
        		//id=sc.next();
        		//System.out.print("请输入作者年龄：");
        		//age=sc.next();
        		//System.out.print("请输入作者国籍：");
        		//country=sc.next();
        		String sqlAuthor="insert into Author values("+"\""+id+"\","+"\""+name+"\","+"\""+age+"\","+"\""+country+"\")";
        		if(con.insert(sqlAuthor)==1)
        			System.out.print("添加作者成功！\n");
        		String sqlBook="insert into Book values("+"\""+isbn+"\","+"\""+title+"\","+"\""+id+"\","+"\""+publisher+"\","+"\""+publishDate+"\","+"\""+price+"\")";
        		if(con.insert(sqlBook)==1)
        			System.out.print("添加图书成功！\n");
        	}
        	else
        	{
        		//String id=new String();
        		//id=list1.get(0);
        		String sqlBook="insert into Book values("+"\""+isbn+"\","+"\""+title+"\","+"\""+id+"\","+"\""+publisher+"\","+"\""+publishDate+"\","+"\""+price+"\")";
        		if(con.insert(sqlBook)==1)
        			System.out.print("添加图书成功！");
        	}
        }
        public static void update(String isbn,String newAuthorID,String newPublisher,String newPublishDate,String newPrice)
        {
        	DBconnection con=new DBconnection();
        	String sql1 = "update Book set AuthorID="+"\""+newAuthorID+"\","
        								 +"Publisher="+"\""+newPublisher+"\","
        								 +"PublishDate="+"\""+newPublishDate+"\","
        								 +"Price="+"\""+newPrice+"\"";
        	con.modify(sql1);
        }
}
