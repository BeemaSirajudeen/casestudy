import java.util.Scanner;
public class Casestudy4_main
{
static int id=0;
public static void main(String[] args) {
// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
String c,obj,newmail,name,a,cnum,e,ptype,pid;
Casestudy4_main  b=new Casestudy4_main ();
Casestudy4_Display d=new Casestudy4_Display();
do
{
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

System.out.println("Thank you for Registeing.You id is "+ ++id);
System.out.println("Do you want to continue registration ?(yes/no)");
c=sc.nextLine();
}
while(c.equals("yes"));
       System.out.println("Do you want to update email id ?(yes/no)");
       obj=sc.nextLine();
       if(obj.equals("yes"))
       {
      System.out.println("Update email");
      System.out.println("Enter new email ID");
      newmail=sc.nextLine();
      d.email=newmail;
      System.out.println("Email updated");
   
       }
       d.register(name,a,e,cnum,ptype,pid);
}

}
