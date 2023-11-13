package hibernate;
import hib.beans.CustomerInfo;
import static java.lang.System.in;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import static java.lang.System.out;
import java.util.Scanner;

public class CutomerUpdate {    
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
             System.out.println(cusInfo.getMilkmanId()+" "+cusInfo.getcId()+" "+cusInfo.getCusRequirement()+" "+
                     cusInfo.getCusContact()+" "+cusInfo.getCusAddress()+" "+cusInfo.getCusSubs()+" "+cusInfo.getCusPayment());
                   System.out.println("-----INDEX-----");
                   System.out.println("1. Cutomer Requirement");
                   System.out.println("2. Cutomer Contact ");
                   System.out.println("3. Cutomer Address");
                   System.out.println("4.Address");
                   System.out.println("5.Subscription");
                   System.out.println("6.payment");
                   Scanner sc=new Scanner(System.in);
                   byte choice=sc.nextByte();
                   switch(choice){
                       case 1: 
                           System.out.println("Enter Cutomer Requirement");
                       String uCusRq=sc .next();
                           cusInfo.setCusRequirement(uCusRq);
                           session.update(cusInfo);
                           tx.commit(); 
                           break;
                           case 2: 
                           System.out.println("Enter Cutomer Contact");
                           long uCusContact=sc.nextLong();
                           cusInfo.setCusContact(uCusContact);
                           session.update(cusInfo);
                           tx.commit(); 
                           break;
                           case 3: 
                           System.out.println("Enter Cutomer Address");
                           String uCusAddress=sc.next();
                           cusInfo.setCusAddress(uCusAddress);
                           session.update(cusInfo);
                           tx.commit(); 
                           break;
                           case 4: 
                           System.out.println("Enter Cutomer Subscription");
                           String uCusSubs=sc.next();
                           cusInfo.setCusSubs(uCusSubs);
                           session.update(cusInfo);
                           tx.commit(); 
                           break;

                            case 5: 
                           System.out.println("Enter Cutomer Payment");
                           String uCusPayment=sc.next();
                           cusInfo.setCusPayment(uCusPayment);
                           session.update(cusInfo);
                           tx.commit(); 
                           break;
                   }
  
        session.close();
       out.println("record Updated......");

    }
}
}

 
