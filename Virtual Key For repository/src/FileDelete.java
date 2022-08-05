import java.io.File;
import java.util.Scanner;

public class FileDelete 
{
	public void filedelete(String path)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File name to be deleted: ");
		String fname=sc.next();
		String finalpath=path+fname;
		File f1 = new File(finalpath);
		File f = new File(path);
		File filenames[] =f.listFiles();
		int flag=0;
		for(File ff:filenames)
		{
			
			if(ff.getName().equals(fname))
			{
				flag=1;
				
				break;
				
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			f1.delete();
			System.out.println("------File "+fname +" deleted successfully----------");
		}
		else 
		{
			System.out.println("------Sorry:::File Not Found-----------");
		}
	}
}
