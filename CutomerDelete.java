package hibernate;
import hib.beans.CustomerInfo;
import static java.lang.System.in;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import static java.lang.System.out;
import java.util.Scanner;

public class CutomerDelete {    
    public static void main(String[] args) {
        Configuration c = new Configuration();
        Configuration c1 = c.configure();
        SessionFactory sf = c1.buildSessionFactory();
        Session session = sf.openSession();
           Transaction tx = session.beginTransaction();
           
            int cId=new Scanner(in).nextInt();
            CustomerInfo cusInfo=(CustomerInfo)session.get(CustomerInfo.class,cId);
         if(cusInfo==null){
             System.out.println("No record Found to delete");
         }
         else{
             session.delete(cusInfo);
         }
   
        tx.commit();
        session.close();
       out.println("record Updated......");

    }
}

 
