import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAddPlusContent 
{
	public void fileaddpluscontent(String path) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter file name: ");
		String fname=sc.next();
		String finalpath=path+fname;
		File f = new File(finalpath);
		boolean bo = f.createNewFile();
		if(bo!=true)
		{
			System.out.println("-------File created successfully----");
		}
		FileWriter fw = new FileWriter(finalpath); //FileOutputStream fos = new FileOutputStream(finalpath);
		Scanner scc = new Scanner(System.in);
		System.out.println("please enter File content");
		String fcontent= scc.nextLine();
		//byte b[] =fcontent.getBytes();
		fw.write(fcontent); ///fos.write(b);
		System.out.println("------Content in "+fname+" is written Successfully-------");
		fw.close();
	}
}
