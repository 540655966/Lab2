package Web;
lalala
//���Ǻ�̨�Ķ���������ʵ�ֹ���
/*
 * ����д����� add,delete��search,update����
public class Action {
	public static Connection con;
	public static String driver = "com.mysql.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/BookDB";// URLָ��Ҫ���ʵ����ݿ���mydata
	public static String user = "root";//�û���
	public static String password = "";//����

	public static void insertintobook() {
		try {
			Scanner sc = new Scanner(System.in 

);
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			java.sql.PreparedStatement tmp;
			tmp = con.prepareStatement("insert into book(ISBN,Title,AuthorID,Publisher,PublishDate,Price)"+"values(?,?,?,?,?,?)");
			System.out.println("������ͼ��ISBN��");
			String str1 = sc.nextLine();
			tmp.setString(1, str1);
			System.out.println("������ͼ�����");
			String str2 = sc.nextLine();
			tmp.setString(2, str2);
			System.out.println("������ͼ������ID");
			int Authid = sc.nextInt();
			tmp.setInt(3, Authid);
			System.out.println("������ͼ�������");
			sc = new Scanner(System.in 

);
			String str3 = sc.nextLine();
			tmp.setString(4, str3);
			System.out.println("������ͼ���������(yyyy-mm-dd��ʽ)");
			String str4 = sc.nextLine();
			tmp.setString(5, str4);
			System.out.println("������ͼ��۸�");
			float pri = sc.nextFloat();
			tmp.setFloat(6, pri);
			tmp.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// ���ݿ�����ʧ���쳣����
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
	}

	public static void printbook() {
		try {
			// ������������
			Class.forName(driver);
			// 1.getConnection()����������MySQL���ݿ⣡��
			con = DriverManager.getConnection(url, user, password);
			if (!con.isClosed())
				System.out.println("�������ݿ�ɹ���");
			// 2.����statement���������ִ��SQL��䣡��
			Statement statement = con.createStatement();
			// Ҫִ�е�SQL���
			String sql = "select * from book";
			// 3.ResultSet�࣬������Ż�ȡ�Ľ��������
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("ִ�н��������ʾ:");
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

				// ������
				System.out.println(ISBN+"\t"+Title+"\t"+AuthorID+"\t"+Publisher+"\t"+PublishDate+"\t"+Price);
			}
			rs.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// ���ݿ��������쳣����
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			// ���ݿ�����ʧ���쳣����
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("���ݿ����ݳɹ���ȡ����");
		}
	}

	public static void deletebook(){
		try {
			// ������������
			Class.forName(driver);
			// 1.getConnection()����������MySQL���ݿ⣡��
			con = DriverManager.getConnection(url, user, password);
			java.sql.PreparedStatement tmp;
			
			con.close();
		} catch (ClassNotFoundException e) {
			// ���ݿ��������쳣����
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			// ���ݿ�����ʧ���쳣����
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("���ݿ����ݳɹ���ȡ����");
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
            list list2=con.select(sql2);//Ӧ���������ļ���
            System.out.print(list2);
        }
        public static void showInformation(String title)
        {
        	DBconnection con=new DBconnection();
            String sql1 = "select * from Book Where Title="+"\""+title+"\"";
            list list1=con.select(sql1);
            String sql2="select * from Author Where AuthorID="+"\""+list1.get(2)+"\"";
            list list2=con.select(sql2);
            System.out.print("ͼ����Ϣ:");
            System.out.print("\nͼ���ISBN:");
            System.out.print(list1.get(0));
            System.out.print("\n����:");
            System.out.print(list1.get(1));
            System.out.print("\n������:");
            System.out.print(list1.get(3));
            System.out.print("\n��������:");
            System.out.print(list1.get(4));
            System.out.print("\n�۸�:");
            System.out.print(list1.get(5));
            System.out.print("\n������Ϣ:");
            System.out.print("\n���߱��:");
            System.out.print(list2.get(0));
            System.out.print("\n��������:");
            System.out.print(list2.get(1));
            System.out.print("\n��������:");
            System.out.print(list2.get(2));
            System.out.print("\n���߹���:");
            System.out.print(list2.get(3));
        }
        public static void deleteBook(String isbn)
        {
        	DBconnection con=new DBconnection();
        	String sql1 = "delete from Book Where ISBN="+"\""+isbn+"\"";
        	int flag=con.delete(sql1);
        	if (flag==1)
        		System.out.print("ɾ���ɹ���");
        	else
        		System.out.print("ɾ��ʧ�ܣ�");
        	
        }
        public static int addBook(String isbn,String title,String name,String publisher,String publishDate,String price,String id,String age,String country)
        {
        	//Scanner sc=new Scanner(System.in);
        	DBconnection con=new DBconnection();
        	String sql0 = "select * from Book Where ISBN="+"\""+isbn+"\"";
        	list list0=con.select(sql0);
        	if(list0.size()!=0)
        	{
        		System.out.print("ͼ���Ѵ��ڣ�");
        		return 0;
        	}
        	String sql1 = "select * from Author Where Name="+"\""+name+"\"";
        	list list1=con.select(sql1);
        	if(list1.size()==0)//û���������
        	{
        		//String id=new String();
        		//String age=new String();
        		//String country=new String();
        		//System.out.print("���߲��ڿ��У����������߱�ţ�\n");
        		//id=sc.next();
        		//System.out.print("�������������䣺");
        		//age=sc.next();
        		//System.out.print("���������߹�����");
        		//country=sc.next();
        		String sqlAuthor="insert into Author values("+"\""+id+"\","+"\""+name+"\","+"\""+age+"\","+"\""+country+"\")";
        		if(con.insert(sqlAuthor)==1)
        			System.out.print("������߳ɹ���\n");
        		String sqlBook="insert into Book values("+"\""+isbn+"\","+"\""+title+"\","+"\""+id+"\","+"\""+publisher+"\","+"\""+publishDate+"\","+"\""+price+"\")";
        		if(con.insert(sqlBook)==1)
        			System.out.print("���ͼ��ɹ���\n");
        	}
        	else
        	{
        		//String id=new String();
        		//id=list1.get(0);
        		String sqlBook="insert into Book values("+"\""+isbn+"\","+"\""+title+"\","+"\""+id+"\","+"\""+publisher+"\","+"\""+publishDate+"\","+"\""+price+"\")";
        		if(con.insert(sqlBook)==1)
        			System.out.print("���ͼ��ɹ���");
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
