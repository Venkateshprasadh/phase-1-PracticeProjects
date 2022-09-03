package SampleSpringproject.AuthenticationUnitTesting;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class AuthenticatorTest {

	static AuthenticationCheck ac;
	@BeforeClass
	public static void before() {
		ac=new AuthenticationCheck();
	 
		System.out.println("object is created");
	}

	@Test
	public void LoginSuccess() 
	{
		assertEquals("Login Successful", ac.authenticator("jillu","Jillu@392004"));
		System.out.println("LoginSuccess Testcase");
	}

	@Test
	
	  public void UserNameCheck1() { assertEquals("Invalid username", ac.authenticator("jille","Jillu@392004"));
	  System.out.println("UserNameCheck Testcase1"); }
	@Test
	
	  public void UserNameCheck2() { assertEquals("Invalid username", ac.authenticator("3872893893","Jillu@392004"));
	  System.out.println("UserNameCheck Testcase2"); }
	@Test
	
	  public void UserNameCheck3() { assertEquals("Invalid username", ac.authenticator("","Jillu@392004"));
	  System.out.println("UserNameCheck Testcase3"); }
	@Test
	
	  public void UserNameCheck4() { assertEquals("Invalid username", ac.authenticator("+-9?;'","Jillu@392004"));
	  System.out.println("UserNameCheck Testcase4"); }
	@Test
	
	  public void UserNameCheck5() { assertEquals("Invalid username", ac.authenticator("jillu ","Jillu@392004"));
	  System.out.println("UserNameCheck Testcase5"); }
	@Test
	
	  public void PasswordCheck1() { assertEquals("Wrong Password", ac.authenticator("jillu","Jill392004"));
	  System.out.println("PasswordCheck Testcase1"); }
	@Test
	
	  public void PasswordCheck2() { assertEquals("Wrong Password", ac.authenticator("jillu","908708"));
	  System.out.println("PasswordCheck Testcase2"); }
	@Test
	
	  public void PasswordCheck3() { assertEquals("Wrong Password", ac.authenticator("jillu","?+-<><q`"));
	  System.out.println("PasswordCheck Testcase3"); }
	@Test
	
	  public void PasswordCheck4() { assertEquals("Wrong Password", ac.authenticator("jillu",""));
	  System.out.println("PasswordCheck Testcase4"); }
	@Test
	
	  public void PasswordCheck5() { assertEquals("Wrong Password", ac.authenticator("jillu","Jillu@392004 "));
	  System.out.println("PasswordCheck Testcase5"); }
	 
	@AfterClass
	public static   void after() 
	{
		ac=null;
		System.out.println("object is destroyed");
	}

}
