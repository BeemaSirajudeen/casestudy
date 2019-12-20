public class Casestudy4_Display {

String name;
String address;
String contact_no;
String email;
String proofType;
String proofID;

public void Display(String name,String a,String cnum,String e,String ptype,String pid)
{
this.name=name;
this.address=a;
this.contact_no=cnum;
this.email=e;
this.proofType=ptype;
this.proofID=pid;
}
public void register(String name,String a,String cnum,String e,String ptype,String pid)
{
System.out.println("You details are as follows ");
System.out.println("Name "+name);
System.out.println("Addess  "+a);
System.out.println("Contact Number  "+cnum);
System.out.println("Email  "+e);
System.out.println("Proof Type  "+ptype);
System.out.println("ProofID  "+pid);
   
   

}


public static void main(String[] args) {
// TODO Auto-generated method stub

}

}

