
package hibernate;

import hib.beans.MilkmanRegistration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import static java.lang.System.out;
import java.util.Scanner;

public class insertMilkman {    
    public static void main(String[] args) {
        Configuration c = new Configuration();
        Configuration c1 = c.configure();
        SessionFactory sf = c1.buildSessionFactory();
        Session session = sf.openSession();
           Transaction tx = session.beginTransaction();
           
           Scanner sc = new Scanner(System.in);
           out.println("Enter your Id");
           int milkmanId = sc.nextInt(); 
           out.println("Enter your  name");
           String name = sc.next();
            out.println("enter phone no");
           Long contact = sc.nextLong();
           out.println("Enter city");
           String city = sc.next();
           out.println("Enter your Area  ");
           String area = sc.next();
            out.println("Enter address");
           String address = sc.next();
   MilkmanRegistration  milkman= new MilkmanRegistration(milkmanId,name,contact,city,area,address);
   session.save(milkman);
        tx.commit();
        session.close();
       out.println("record Inserted......");

    }
}

 
