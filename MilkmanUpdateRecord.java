package hibernate;
import hib.beans.MilkmanRegistration;
import static java.lang.System.in;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import java.util.Scanner;

public class MilkmanUpdateRecord {
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
                   System.out.println("No record Found to Update");
               }
               else
               {
                     System.out.println(milkman.getMilkmanId()+" "+milkman.getName()+" "+
                           milkman.getCity()+" "+milkman.getArea()+ " "+
                           milkman.getAddress());
                  System.out.println("-------INDEX------");
                   
                   System.out.println("2.Name");
                   System.out.println("3.contact");
                   System.out.println("4.Area");
                   System.out.println("5.Address");
                   Scanner sc=new Scanner(System.in);
                   byte choice=sc.nextByte();
                  switch(choice){
                      
                      case 1:
                          System.out.println("Enter Name : ");
                          String myName=sc.next();
                         milkman.setName(myName);
                          session.update(milkman);
                            tx.commit();
                            break;
                      
                      case 2:
                          System.out.println("Enter contact : ");
                          long myContact=sc.nextLong();
                          milkman.setContact(myContact);
                          session.update(milkman);
                          tx.commit();
                          break;
                          
                     case 3:
                          System.out.println("Enter city : ");
                          String myCity=sc.next();
                          milkman.setCity(myCity);
                          session.update(milkman);
                          tx.commit();
                          break;
                          
                       case 4:
                          System.out.println("Enter contact : ");
                          String myArea=sc.next();
                          milkman.setArea(myArea);
                          session.update(milkman);
                          tx.commit();
                          break;
                          
                       case 5:
                          System.out.println("Enter contact : ");
                          String myAddress=sc.next();
                          milkman.setAddress(myAddress);
                          session.update(milkman);
                          tx.commit();
                          break;
                  }
                  
                                     
               }
                 session.close();
        
    }
    
}
