package filepath;
import java.io.*;
import java.util.Arrays;
public class Filepath {

	static File path=new File("src\\files");
	static String file[]=path.list();
	
	public static void file() {
		Arrays.sort(file);
		for(String f:file)
		{
			System.out.println(f);
		}
	}
	
}
