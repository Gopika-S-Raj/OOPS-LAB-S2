package graphics_co4;

import java.util.Scanner;

interface rectangle{
	public void area();
}
class rec implements rectangle{
	public void area() {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter the length");
	       int l=sc.nextInt();
	       System.out.println("enter the breadth");
	       int b=sc.nextInt();
	       
		
		
	}
}
interface triangle{
	public void area1();
}
class triang implements triangle{

	public void area1() {
		System.out.println("enter the breadth");
		Scanner sc = new Scanner(System.in) ;
		int a=sc.nextInt();
		System.out.println("enter the height");
		int h=sc.nextInt();
		System.out.println("the area is");
		System.out.println(0.5*a*h);
		
	}
	
	
}

public class shape {

	
	public static void main(String[] args) {
		rec obj1=new rec();
		triang obj2=new triang();
		Scanner sc = new Scanner(System.in) ;
		int ch;
		System.out.println("the choices are\n 1.area of rectangle\n 2.area of triangle");
		do {
			System.out.println("enter the  choice");
			ch=sc.nextInt();
			
			
		
			switch(ch) {
			case 1:
			       System.out.println("area of rectangle");
			       obj1.area();
			       
			       break;
			case 2:System.out.println("area of triangle");
			       obj2.area1();
			       break;
		    default:System.out.println("invalid option");
		}
		
		}while(ch!=0);
	}
	
}

