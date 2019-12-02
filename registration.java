package welcome;
import java.util.Scanner;
public class registration {

/*String name;
String address;
String contact_no;
String email;
String proofType;
String proofID;

public void Registration(String name,String a,String cnum,String e,String ptype,String pid)
{
this.name=name;
this.address=a;
this.contact_no=cnum;
this.email=e;
this.proofType=ptype;
this.proofID=pid;
}

public void display(String name,String a,String cnum,String e,String ptype,String pid)
{
System.out.println("You details are as follows");
System.out.println("Name"+name);
System.out.println("Addess"+a);
System.out.println("Contact Number"+cnum);
System.out.println("Email"+e);
System.out.println("Proof Type"+ptype);
System.out.println("ProofID"+pid);
   
   

}*/


public static void main(String[] args) {
// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
int f;
String c,obj,newmail,name,a,cnum,e,ptype,pid;
registration b=new registration();
display d=new display();
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

/*System.out.println("Thank you for Registeing.You id is "+ ++id);
System.out.println("Do you want to continue registration ?(yes/no)");
c=sc.nextLine();*/
f=d.register(name,a,cnum,e,ptype,pid);
   
}while(f==1);
//while(c.equals("yes"));
       /*System.out.println("Do you want to update email id ?(yes/no)");
       obj=sc.nextLine();
       if(obj.equals("yes"))
       {
      System.out.println("Update email");
      System.out.println("Enter new email ID");
      newmail=sc.nextLine();
      d.email=newmail;
      System.out.println("Email updated");
    //  b.display();
       
     
       }*/
      // d.register(name,a,e,cnum,ptype,pid);
}

}

