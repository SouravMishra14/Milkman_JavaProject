package hibernate;
import hib.beans.CustomerInfo;
import static java.lang.System.in;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import static java.lang.System.out;
import java.util.Scanner;

public class CustomerView {    
    public static void main(String[] args) {
        Configuration c = new Configuration();
        Configuration c1 = c.configure();
        SessionFactory sf = c1.buildSessionFactory();
        Session session = sf.openSession();
           
            int cId=new Scanner(in).nextInt();
            CustomerInfo cusInfo=(CustomerInfo)session.get(CustomerInfo.class,cId);
         if(cusInfo==null){
             System.out.println("No record found");
         }
         else{
             System.out.println(cusInfo.getMilkmanId()+" "+cusInfo.getcId()+" "+cusInfo.getCusRequirement()+" "+
                     cusInfo.getCusContact()+" "+cusInfo.getCusAddress()+" "+cusInfo.getCusSubs()+" "+cusInfo.getCusPayment());
         }
   
      
        session.close();
       out.println("record Updated......");

    }
}

 
