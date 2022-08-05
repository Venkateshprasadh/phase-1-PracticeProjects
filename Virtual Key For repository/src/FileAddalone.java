import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAddalone 
{
	public void fileadd(String path) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fname=sc.next();
		String finalpath=path+fname;
		File f = new File(finalpath);
		boolean bo = f.createNewFile();
		if(bo==true)
		{
			System.out.println("----------File "+fname+" created successfully-------------");
		}
		
		
	}
}
