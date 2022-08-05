import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class FileHandling 
{
	public static void main(String[] args) throws IOException 
	{
		int mchoice;
		String path="D:\\CompanyLockers\\";
		try {
			do {
				System.out.println("*************************************************************************");
				System.out.println("----------------------LOCKED ME.COM--------------------------------------");
				System.out.println("************************************************YOUR FILE MANAGER********");
				System.out.println("\nEnter your option\n\n1.Retrive the file names\n2.Buisness Level operations\n3.Close the application");
				Scanner sc = new Scanner(System.in);
				 mchoice= sc.nextInt();
				 try {
				switch (mchoice) {
				case 1:
					System.out.println("---------------------DISPLAYING FILES-------------------------------------");
					FileRetrieve  fr = new FileRetrieve();
					fr.retrieve(path);	
					break;
					
				case 2:
					System.out.println("------------------BUISNESS LEVEL OPERATIONS-------------------------------");
					System.out.println("\n1.ADD a File\n2.DELETE a File\n3.SEARCH for a file\n4.CLOSE current operation and return to MAIN context");
					int schoice= sc.nextInt();
					try {
					switch (schoice) 
					{
					case 1:
						System.out.println("---------------------ADDING a File------------------------------------");
						System.out.println("\n1.ADD a new file\n2.ADD a new file and ADD File Content"); 
						int addchoice=sc.nextInt();
						switch (addchoice) 
						{
						case 1:
							FileAddalone fa = new FileAddalone();
							fa.fileadd(path);
							break;
						case 2:
							FileAddPlusContent  fac = new FileAddPlusContent();
							fac.fileaddpluscontent(path);
							break;
						default:
							System.out.println("Invalid Input");
							break;
						}							
						break;
					case 2:
						System.out.println("--------------------DELETING a File------------------------------------");
						FileDelete fd = new FileDelete();
						fd.filedelete(path);				
						break;
					case 3:
						System.out.println("-------------------SEARCHING a File-------------------------------------");
						FileSearch fs = new FileSearch();
						fs.filesearch(path);
						
						break;
					case 4:
						break;
					

					default:
						System.out.println("Invalid Input");
						break;
					}
					}catch (Exception e) {
						// TODO: handle exception
						System.out.println("Program Terminated Due to "+e);
					}
					break;
					
					
				case 3:
					System.out.println("----------------------Application Closed--------------------------");
					
					if(true)
					{
						break;
					}
					break;
					
				default:
					System.out.println("Invalid Input");
					break;
				}
				 }
				 catch (Exception e) {
						// TODO: handle exception
						System.out.println("Program Terminated Due to "+e);
					}
				 
			} 
			while (mchoice!=3);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Program Terminated Due to "+e);
		}
		
		
		
	}
}
