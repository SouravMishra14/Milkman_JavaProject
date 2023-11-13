package hibernate;
import hib.beans.MilkmanRegistration;
import static java.lang.System.in;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import java.util.Scanner;

public class MilkmanDeleteRecord {
    public static void main(String[] args) {
     SessionFactory sf=
               call.connection.DBConnectionFactory.getConnectionInfo();
               Session session=sf.openSession();
               Transaction tx=session.beginTransaction();
               
               System.out.println("Enter your Id:  ");
               int milkmanId=new Scanner(in).nextInt();
               MilkmanRegistration milkman=
                       (MilkmanRegistration)session.get(MilkmanRegistration.class,milkmanId);//Search using Primary Key
               if(milkman==null){
                   System.out.println("No record Found to delete");
               }
               else
               {
                   session.delete(milkman);
                   tx.commit();
                   System.out.println("Record Deleted.......");
               }
                 session.close();
        
    }
    
}
