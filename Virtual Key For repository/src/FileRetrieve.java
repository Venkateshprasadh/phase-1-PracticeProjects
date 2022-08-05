import java.io.File;

public class FileRetrieve 
{
	public void retrieve(String path)
	{
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
		
	}
}
