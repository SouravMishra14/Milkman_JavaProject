


package hibernate;
import hib.beans.CustomerInfo;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import static java.lang.System.out;
import java.util.Scanner;

public class ProductDetail {    
    public static void main(String[] args) {
        Configuration c = new Configuration();
        Configuration c1 = c.configure();
        SessionFactory sf = c1.buildSessionFactory();
        Session session = sf.openSession();
           Transaction tx = session.beginTransaction();
           
           Scanner sc = new Scanner(System.in);
           out.println("Enter milkman Id");
           int milkmanId = sc.nextInt(); 
           out.println("Enter customer Id");
           int cId = sc.nextInt();
            out.println("Enter customer requirement");
           String cusRequirement = sc.next();
            out.println("enter Contact");
           Long cusContact = sc.nextLong();
           out.println("Enter address");
           String  cusAddress= sc.next();
            out.println("Enter Subscription");
             String  cusSubs= sc.next();
             out.println("Enter Payment");
             String  cusPayment= sc.next();
         
   CustomerInfo  cusInfo= new CustomerInfo(milkmanId,cId,cusRequirement,cusContact,cusAddress,cusSubs,cusPayment);
   session.save(cusInfo);
        tx.commit();
        session.close();
       out.println("record Inserted......");

    }
}

 
