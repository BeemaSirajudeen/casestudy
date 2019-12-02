package program;
//import java.util.Scanner;
public class View {
String name,add,cnum,e,ptype,pid;
int id,rid;

public int display(int id,String name,String a,String cnum,String e,String ptype,String pid)

{

this.id=id;
this.name=name;
this.add=a;
this.cnum=cnum;
this.e=e;
this.ptype=ptype;
this.pid=pid;
return this.id;



}
public void view(String name,int id)
{
System.out.println(this.name+"\t\t"+this.id);

}

public static void main(String[] args) {

}

}

