import java.util.regex.*;
import java.util.Scanner;
public class EmailValidation 
{
	public static void main(String[] args) {
		String email;
		Scanner sc= new Scanner(System.in);
		System.out.println("------------------Sign in--------------------");
		System.out.println("Enter E-Mail address");
		email=sc.next();
		/*
		 * System.out.println(email); Pattern pattern = Pattern.compile("[jillu]?");
		 * Matcher matcher = pattern.matcher(email);
		 */ //Venkateshprasadh@gmail.com--------122005157@sastra.ac.in
		
		/*
		 * Rules and Assumption i made
		 * 
		 * 1.The first character can be caps or small ,can begin with numbers
		 * 2.characters followed by first character can be numbers or characters caps or small optional(*) can be repeating
		 * 3.it should[+] contain @symbol only once
		 * 4.followed by at symbol [it can have characters optional(*) length should be 1-10 followed by .(dot)]--these are optional
		 * 5.but followed by @ it should[+] have characters followed by (dot).
		 * 6.following dot it should end with characters with length 2-5.
		 * 
		 * 
		 */
		
		boolean n= Pattern.matches("[(_a-zA-Z0-9)]+([a-zA-Z0-9_])*[@]+([a-zA-z]{1,10}+[//.])*[a-zA-z]{1,10}+[//.]+[a-zA-Z]+{2,5}", email);
		if(n) {
			System.out.println("----------------Signed in---------------------");
		}
		else{
			System.out.println("xxxxxxxxxxxx---invalid email Address----xxxxxxxxxxxxxx");		}
		
	}
}
