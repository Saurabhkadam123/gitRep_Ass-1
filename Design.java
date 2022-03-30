package pack1;
import java.util.*;

public class Design {
	
	String pname;
	int price;
	int quantity;
	Scanner s=new Scanner (System.in);
	static String banner="welcome to IMS";
	
	static void cname()
	{
		System.out.println(banner);
	}
	
	 void input()
	 {
		 System.out.println("enter the product name");
		 pname=s.next();
		 System.out.println("enter the price of product");
		 price=s.nextInt();
		 System.out.println("enter the quabtity of product");
		 quantity=s.nextInt();
	 }
	 void display()
	 {
		 System.out.println("product name:"+pname);
		 System.out.println("product price:"+price);
		 System.out.println("product quantity:"+quantity);
		 
	 }
	 void calculate()
	 {
		 if(price>3000)
			 System.out.println("disscount is 10%");
		 else
			 System.out.println("disscount is 9%");
	 }

	public static void main(String[] args) {
		
		Design d=new Design();
		cname();
		d.input();
		d.calculate();
		d.display();
		

	}

}
