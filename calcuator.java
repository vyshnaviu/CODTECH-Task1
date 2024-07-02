import java.util.*;

public class calcuator {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("0 for Addition \n 1 for Subtraction \n 2 for Multiplication \n 3 for Division \n 4 for Percentile \n 5 for Power");
	 
	 while(true)
	 {
		 System.out.print("Enter number1 : ");
		 int a=sc.nextInt();
		 System.out.println();
		 System.out.print("Enter number2 : ");
		 int b=sc.nextInt();
		 System.out.println();
		 
		 int d=0;
		 
		
		 System.out.print("Enter the required operation : ");
		 
		 int c=sc.nextInt();
		 System.out.println();
		 
		 switch(c)
		 {
		 case 0: d=a+b;
		 break;
		 case 1: d=a-b;
		 break;
		 case 2: d=a*b;
		 break;
		 case 3: 
			 if(b!=0)
			 {
				 d=a/b;
			 }
			 else
			 {
				 d=-1;
			 }
			 break;
		 case 4: d=a%b;
		 break;
		 case 5:
			 
			 int e=a;
			 for(int i=0;i<b-1;i++)
			 {
				 a=a*e;
			 }
			 d=a;
			 break;
		default : System.out.println("Exit");
			System.exit(0);
		 }
		 System.out.println("Result : "+d);
		 System.out.println();
	 }
	 
 }
}
