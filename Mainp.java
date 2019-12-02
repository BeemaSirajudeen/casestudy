package program;
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.sql.Date;
import java.util.Scanner;
//import case29.Register;
public class Mainp {

public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub,
int id=0,r=0;
int  rid=1001;
String name = null,c,a,cnum,e,ptype,pid;
int n = 0;
int ch;
 //  View db[]=new View[50];
   View re[]=new View[50];
Scanner sc=new Scanner(System.in);
do
{
System.out.println("MENU\n1.Registration\n2.View Customer\n3.Exit\n");
ch = sc.nextInt();
switch(ch)
{
case 1:do {
  sc.nextLine();  
          System.out.println("REGISTRATION");
          System.out.println("Enter your name");
           name=sc.nextLine();
               System.out.println("Enter your address");
          a=sc.nextLine();
          System.out.println("Enter your contact Number");
          cnum=sc.nextLine();
          System.out.println("Email ID");
          e=sc.nextLine();
          System.out.println("Proof Type");
              ptype=sc.nextLine();
          System.out.println("Proof ID");
              pid=sc.nextLine();
              re[r]=new View();
        re[r].display(rid,name,a,cnum,e,ptype,pid);
        rid++;
        r++;
              System.out.println("Thank you for Registeing.You id is "+ ++id);
          System.out.println("Do you want to continue registration?(yes/no)");
          c=sc.nextLine();
         
   }while(c.equals("yes"));
     break;
case 2:System.out.println("Customer name\t Customer ID ");
     for(int j1=0;j1<r;j1++)
     {
      re[j1].view(name,id);
      }
  break;
 
 
case 3:System.exit(0);
default:System.out.println("Invalid Input");
}
}while(true);

}
}

