package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling 
{
	public static void main(String[] args) throws IOException 
	{
		String path="D:\\FileHandlingDemo\\";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name to create a new  file: ");
		String fname=sc.next();
		String finalpath=path+fname;
		File f = new File(finalpath);
		boolean bo = f.createNewFile();
		if(bo!=true)
		{
			System.out.println("File created successfully");
		}
		FileWriter fw = new FileWriter(finalpath,true); //FileOutputStream fos = new FileOutputStream(finalpath);
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter content");
		String fcontent= scc.nextLine();
		//byte b[] =fcontent.getBytes();
		fw.write(fcontent); ///fos.write(b);
		System.out.println("content written");
		
		System.out.println("Enter 1-read\t2-Append");
		int choice=scc.nextInt();
		switch (choice) {
		case 1:
			fw.close();
			FileInputStream fis = new FileInputStream(finalpath);
			if(fis!=null)
			{
				System.out.println("file exist in: "+path);
			}
			else
			{
			 System.out.println("please check file name,entered because doesnot exist");
			}
			int i=0;
			//-1 is EOF
			System.out.println("File content is--------");
			while((i=fis.read())!=-1){
				System.out.print((char)i);
			}
			fis.close();
			
			break;
		case 2:
			
			Scanner sccc= new Scanner(System.in);
			System.out.println("enter content to update");
			String newcontent = sccc.nextLine();
			fw.write(newcontent);
			System.out.println("------content updated----");
			fw.close();
			break;

		default:
			System.out.println("Entered number invalid");
			break;
		}
		
	}
}
