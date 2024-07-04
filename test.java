
import java.sql.DriverManager; 
class test
{
    public static void main(String[] args) {
        try{
            DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
            System.out.println("successs...");

        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}