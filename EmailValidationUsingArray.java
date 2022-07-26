import java.util.Scanner;

public class EmailValidationUsingArray
{
	void output(int found) {
		if(found==1)
		{
			System.out.println("------------Signed in----------");
			
		}
		else {
			System.out.println("--x----------x------xx----------Invalid Email Address---x----------x------xx----------");
		}
	}
public static void main(String[] args) {
	
	String[] Emp_Emailid_database= {"Employee1@company.com","Employee2@company.com","Employee3@company.com","Employee4@company.com","Employee5@company.com",
									"Employee6@company.com","Employee7@company.com","Employee8@company.com","Employee9@company.com","Employee10@company.com"};
	System.out.println("------------Sign in----------------");
	System.out.println("enter your company Email Address");
	Scanner sc= new Scanner(System.in);
	String email;
	email=sc.next();
	int i;
	int found=0;
	
	for(i=0;i<10;i++)
	{
		String c= Emp_Emailid_database[i];
		if(email.equalsIgnoreCase(c))
		{
			
			found=1;
		}
		
		
	}
	EmailValidationUsingArray e =new EmailValidationUsingArray();
	e.output(found);
	
	
	
}
}
