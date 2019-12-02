package roombook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class checkstatus {
	void check()
	{  
	//	int f=id;
		// ROOMBOOKING b=new ROOMBOOKING();
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Check Status");
        System.out.println("Enter room number");
       int n=sc.nextInt();
		if(ROOMBOOKING.arr[n-1]==0)
		{
			System.out.println("Room not booked");
		}
		if(ROOMBOOKING.arr[n-1]==1)
		{
			System.out.println("Room booked");
		}
	}
	public static void main(String[] args) throws IOException
	{
		
   // 
    ROOMBOOKING b=new ROOMBOOKING();
    String ac="null";
    String cot="null";
    String cable="null";
    String wifi="null";
    String laundry="null";
    String d;
    
    checkstatus obj=new checkstatus();
    //
    do
    {
    System.out.println("Menu\n1.Book\n2.Check Status\n3.Exit\nEnter your choice");
    Scanner sc=new Scanner(System.in);
    int ch=sc.nextInt();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n;
   // int cost=0;
   
    
    switch(ch)
    {
    case 1:System.out.println("Booking");
             System.out.println("Please choose the services required.");
              System.out.println("AC/non-AC(AC/nAC)");
              ac=in.readLine();
              System.out.println("Cot(Single/Double)");
              cot=in.readLine();
              System.out.println("With cable connection/without cable connection(C/nC)");
              cable=in.readLine();
              System.out.println("Wi-Fi needed or not(W/nW)");
              wifi=in.readLine();
              System.out.println("Laundry service needed or not(L/nL)");
             laundry=in.readLine();
              b.book(ac,cot,cable,wifi,laundry);
           break;
    case 2: obj.check();
             break;
    case 3:System.exit(0);
          // break;
    default:System.out.print("");
             
   
	}
	}while(true);
   
    
    
	}

}
