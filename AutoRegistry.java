package projectOne; 
import java.util.Scanner; 
public class AutoRegistry { 
public int id; 
public String nm; 
public int price; 
public String col; 
public String area; 
public String own; 
public long no; 
public long adno; 

public void getDetails() { 
Scanner s=new Scanner (System.in); 
System.out.println("Enter registration id:"); 
this.id=s.nextInt(); 
System.out.println("Enter model name:"); 
this.nm=s.next(); 
System.out.println("Enter price:"); 
this. price=s.nextInt(); 
System.out.println("Enter colour:"); 
this.col=s.next(); 
System.out.println("Enter area:"); 
this.area=s.next(); 
System.out.println("Enter owner name:"); 
this.own=s.next(); 
System.out.println("Enter mobile no:"); 
this.no=s.nextInt(); 
System.out.println("Enter adhar no:"); 
this.adno=s.nextLong(); 
} 

public void printDetails() { 
System.out.println("registration id:"+id); 
System.out.println("model name:"+nm); 
System.out.println("price:"+price); 
System.out.println("colour:"+col); 
System.out.println("area:"+area); 
System.out.println("owner name:"+own); 
System.out.println("mobile no:"+no); 
System.out.println("adhar no:"+adno); 
} 
public void updateDetails() { 
Scanner s=new Scanner (System.in); 
System.out.println("1.Update price \n2.Update mobile number"); 
System.out.println("Enter choice"); 
int n=s.nextInt();
if(n==1) 
{ 
System.out.println("Enter price:"); 
this.price=s.nextInt(); 
} 
else{ 
System.out.println("Enter mobile no:"); 
this.no=s.nextLong(); 
} 
 
 
} 
 
 
public static void main(String[] args) { 
// TODO Auto-generated method stub 
Scanner s=new Scanner (System.in); 
AutoRegistry ar=new AutoRegistry(); 
while(true) { 
System.out.println("---Welcome to vehicle registration System---"); 
System.out.println("choose Option"); 
 
System.out.println("1.Register your vehicle.\n2.View your vehicle. \n3.Update your datails. \n4.Exit"); 
 
System.out.println("What’s your choice?"); 
 
int num=s.nextInt(); 
 
switch(num) { 
case 1: 
 
ar.getDetails(); 
break; 
 
case 2: 
 
ar.printDetails(); 
break; 
 
case 3: 
 
ar.updateDetails(); 
break; 
 
case 4: 
System.exit(0); 
System.out.println("Loged out!!!!!!!!!!!!!!!!!!!"); 
break; 
} 
} 
} 
 
}