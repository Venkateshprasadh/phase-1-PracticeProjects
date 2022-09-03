package SampleSpringproject.AuthenticationUnitTesting;

public class AuthenticationCheck 
{
	public String authenticator(String username,String password)
	{
		if(username.equals("jillu"))
			{
				if(password.equals("Jillu@392004"))
				{
					return "Login Successful";
				}else
				{
					return "Wrong Password";
				}
			}
		else
			
		{
			return "Invalid username";
		}
		
		
		
	}
}
