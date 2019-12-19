package program;
import java.util.Scanner;
public class CaseStudy1_Registration
{
    String name;
    String address;
    String contactNumber;
    String email ;
    String proofType;
    String proofId;
    public  CaseStudy1_Registration(String name,String address,String contactNumber,String email,String proofType,String ProofId)
  {
	this.name=name;
	this.address=address;
	this.contactNumber=contactNumber;
	this.email=email;
	this.proofType=proofType;
	this.proofId=proofId;
	
  }

	public static void main(String[] args)
	{
           Scanner s=new Scanner(System.in);
           String name=s.nextLine();
           String address=s.nextLine();
           String contactNumber=s.nextLine();
           String email=s.nextLine();
           String proofType=s.nextLine();
           String proofId=s.nextLine();
           CaseStudy1_Registration c=new Main(name,address,contactNumber,email,proofType,proofId);
           c.Register(name,address,contactNumber,email,proofType,proofId);
	   s.close();
	 }
      void Register(String name,String address,String contactNumber,String email,String proofType,String proofId)
           {
	        int id=0;
	        id++;
		System.out.println("Enter your Name\n"+name);
		System.out.println("Enter your address\n"+address);
		System.out.println("Enter your contactNumber\n"+contactNumber);
		System.out.println("Enter your email\n"+email);
		System.out.println("Enter your proofType\n"+proofType);
		System.out.println("Enter your proofId\n"+proofId);
		System.out.println("Thank you for registering.Your id is\n"+id);

	   }

}
