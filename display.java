package welcome;
import java.util.Scanner;

public class display {

String name;
String address;
String contact_no;
String email;
String proofType;
String proofID;
static int id=0;
String c,obj,newmail;
public void Display(String name,String a,String cnum,String e,String ptype,String pid)
{
this.name=name;
this.address=a;
this.contact_no=cnum;
this.email=e;
this.proofType=ptype;
this.proofID=pid;
}
public int register(String name,String a,String cnum,String e,String ptype,String pid)
{
Scanner sc=new Scanner(System.in);
System.out.println("Thank you for Registeing.You id is "+ ++id);
System.out.println("Do you want to continue registration ?(yes/no)");
c=sc.nextLine();
if(c.equals("yes"))
{
return 1;
}else
{


System.out.println("Do you want to update email id ?(yes/no)");
      obj=sc.nextLine();
      if(obj.equals("yes"))
      {
      System.out.println("Update email");
      System.out.println("Enter new email ID");
      newmail=sc.nextLine();
      email=newmail;
      System.out.println("Email updated");
    //  b.display();
       
     
      }

System.out.println("You details are as follows ");
System.out.println("Name "+name);
System.out.println("Addess  "+a);
System.out.println("Contact Number  "+cnum);
System.out.println("Email  "+email);
System.out.println("Proof Type  "+ptype);
System.out.println("ProofID  "+pid);
   
}
return 0;  

}


public static void main(String[] args) {
// TODO Auto-generated method stub

}

}

