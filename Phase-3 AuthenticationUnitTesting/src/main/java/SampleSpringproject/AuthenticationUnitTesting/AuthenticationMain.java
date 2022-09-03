package SampleSpringproject.AuthenticationUnitTesting;

import java.util.Scanner;

public class AuthenticationMain 
{
	public static void main(String[] args) {
		AuthenticationCheck ac = new AuthenticationCheck();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String username= sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		String result=ac.authenticator(username, password);
		System.out.println(result);
	}
}
