package detailedoption;
import java.util.regex.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

import projectphase1.*; 

public class Detailedoption extends Welcomescreen {
	static Welcomescreen w=new Welcomescreen(); 
	public static void menu() throws Exception
	 {
		System.out.println("\n1. Add a File");
		System.out.println("2. Delete a File");
		System.out.println("3. Search a File");
		System.out.println("4. Go Back To Main Menu");
		try {
		Scanner s1=new Scanner(System.in);
		int ch=s1.nextInt();
		
		switch(ch) {
		
		case 1: addfile();
				menu();
		       break;
		case 2: deletefile();
				menu();
				break;      
		case 3: searchfile();
				menu();
				break;
		case 4:	w.mainmenu();
				break;
		default: System.out.println("Kindly enter valid option....Try Again!");
				menu();
				
		}
		}
		catch(Exception e)
		{
			System.out.println("Kindly enter valid option....Try Again!");
			menu();
		}
		
	 }


	//code for adding file
	public static void addfile()
	{
		
		System.out.println("Enter The File Name You Want To Add ");
		Scanner s1=new Scanner(System.in);
		String filename=s1.nextLine().translateEscapes();
		//String Pattern="[a-zA-Z_0-9.]";
		Pattern pattern = Pattern.compile("[a-zA-Z_0-9.%]");
		Matcher matcher = pattern.matcher(filename);
		boolean hasnormalcharacter = matcher.find();
	
		try 
		{
		//filename=filename+".txt"; //this can be used if you want to add .txt format file without entering the extension.
		if ((hasnormalcharacter))
		{
			String fileLocation="src\\files\\"+filename;
			File f=new File(fileLocation);
			
			
				if(f.createNewFile())
				{
					System.out.println("File "+f.getName()+" created successfully");
				}
				else
				{
					System.out.println("File Already Exist");
				}
		}
		else
		{
			System.out.println("enter valid file name");
			addfile();
		}
		}
		catch(Exception e)
		{
			System.out.println("enter valid file name");
			addfile();
		}
		}
		
	
	// block for deletion of file
	public static void deletefile() throws IOException {
		File path=new File("src\\files");
	    String file[]=path.list();
	    for(String f:file)
	    {
	    	System.out.println(f);
	    }
		
	    System.out.println("\nEnter the File Name that you want to Delete from the above listed files");
	    
	    Scanner s1=new Scanner(System.in);
	    
	    String filename=s1.nextLine().translateEscapes();
	    String fileLocation="src\\files\\"+filename;
	    File f=new File(fileLocation);
	    
	    if(f.exists() && f.getCanonicalFile().getName().equals(filename))   //checking case senstivity & spaces
	    {
	    	f.delete();
	    	System.out.println(f.getName()+" is deleted Successfully!");
	    }
	    else
	    {
	    	System.out.println("File Not Found..!");
	    	System.out.println("Kindly enter correct file name also Check The Case Sensitivity To Delete The File!!");
	    }
	    
	}
	
	//code for searching file
	public static void searchfile() throws Exception
	{
		
		System.out.println("Enter the File Name you want to search");
	    
	    Scanner s1=new Scanner(System.in);
	    String filename=s1.nextLine();
	  
	    String fileLocation="src\\files\\"; 
	    File f=new File(fileLocation);
	  /*  LinkedHashSet<String> set= new LinkedHashSet<String>();
	    for(String file:f.list())
	    {
	    	set.add(file);
	    }
	    
	    String arr[]=new String[set.size()];
	    set.toArray(arr);
	    int flag=0;
	    if(arr==null)
	    {
	    	System.out.println("directory empty");
	    }
	    else
	    {
	    	for(String a:arr)
	    	{
	    		String fname=a;
	    		if(fname.equals(filename))
	    		{
	    			System.out.println("file found");
	    		flag=1;
	    		}
	    	}
	    }
	    if(flag==0)
	    {
	    	System.out.println("FNF");
	    }
	    	*/
	  
	    
	     // linear search 
	     
	     String flist[]=f.list();
	    boolean flag=false;
	    		int i;
	    if(flist==null)
	    {
	    	System.out.println("directory empty");	
	    											
	    }
	    else
	    {
	    	for ( i = 0; i < flist.length; i++) {
                String fname = flist[i];
                if (filename.equals(fname)) {
                    System.out.println("File name: "+filename + " found");
                    flag = true;
                }
	    }
	    }
	    if (flag == false) {
            System.out.println("File Not Found");
        }
        
	   
	   
	}
}
