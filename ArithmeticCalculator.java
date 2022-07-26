import java.util.Scanner;

public class ArithmeticCalculator {
	 public static double result;
	public static void main(String[] args) { 
			System.out.println("Enter number to start calculator");
		double a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		result=a;
		
		//System.out.println(c);
		do{
			System.out.println("Enter operation to perform\naddition(A)\tsubtraction(S)\tmultiplication(M)\tdivide(D)\tExit(E)\t");
			String c;
			c=sc.next();
			
		if(c.toUpperCase().equals("A")) {
			result=addition(result);
			System.out.println(result);
			
			
		}
		else if(c.toUpperCase().equals("S")) 
		{
			result=subtraction(result);
			System.out.println(result);
		
			}
		else if(c.toUpperCase().equals("M"))
		{
			result=multiplication(result);
			System.out.println(result);
			
			}
		else if(c.toUpperCase().equals("D")) {
			result=division(result);
			System.out.println(result);
			
		}
		else if(c.toUpperCase().equals("E")) {
			
			System.out.println("Terminated\tThank you");
			break;
			
		}
		
		else{
			System.out.println("invalid");
		}
		result=result;
	}while(true);
	}
	public static double division(double result) {
		System.out.println(result+"/");
		double n;
		Scanner s=new Scanner(System.in);
		n=s.nextDouble();
		 result=result/n;
		return (result);
		
	}
	public static double multiplication(double result) {
		System.out.println(result+"*");
		double n;
		Scanner s=new Scanner(System.in);
		n=s.nextDouble();
		result=result*n;
		return (result);
		
	}
	public static double subtraction(double result) {
		System.out.println(result+"-");
		double n;
		Scanner s=new Scanner(System.in);
		n=s.nextDouble();
		result=result-n;
		return (result);
		
	}
	public static double addition(double result) {
		System.out.println(result+"+");
		double n;
		Scanner s=new Scanner(System.in);
		n=s.nextDouble();
		double sum=result+n;
		result=sum;
		return (result);
		
	}

}
