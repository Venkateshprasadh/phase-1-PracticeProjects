import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileSearch 
{
	public void filesearch(String path) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name to Search");
		String filename= sc.next();
		int flag=0;
		File f = new File(path);
		File filenames[] =f.listFiles();
		for(File ff:filenames)
		{
			if(ff.getName().equals(filename))
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
			System.out.println("\nFile Found in Location:--------- "+path);
			System.out.println("\nWant To See "+filename+" File Content? (Y/N)");
			String y=sc.next();
			String yes="y";
			String no="n";
			if(y.equalsIgnoreCase(yes))
			{
				String finalpath=path+filename;
				FileInputStream fi=new FileInputStream(finalpath);
				System.out.println("--------------Displaying "+filename+" File Content---------------------");
				int i=0;
				//-1 is EOF
				while((i=fi.read())!=-1){
					System.out.print((char)i);
				}
				System.out.println();
				fi.close();
				

			}
			else if(y.equalsIgnoreCase(no))
			{
				System.out.println("-----X-----X----Cancelled------X---------X----------");	
			}
			
			else
			{
				System.out.println("----X----Invalid Input Content display Operation Terminated----X----");
			}
			
			
		}
		else
		{
			System.out.println("----X----Sorry! File Does Not Exist---X---");
		}
		
	}
}
