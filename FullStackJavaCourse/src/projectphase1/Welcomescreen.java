package projectphase1;
import java.util.*;
import filepath.*;
import detailedoption.*;
import java.io.*;
public class Welcomescreen {
	
	protected static void mainmenu() {
		System.out.println("\nMain Menu");
		System.out.println("1. List All Files");
		System.out.println("2. Detailed File Option Menu");
		System.out.println("3. Close Application");
		
		
		
		try {
			Scanner s=new Scanner(System.in);
			int ch1=s.nextInt();
		switch(ch1)
		{
		case 1:allfiles();
			   mainmenu();
			   break;
		case 2: detailedoption();
				break;
		case 3:break;
		
		default: System.out.println("Kindly enter valid option....Try Again!");
				mainmenu();
		
		}
		}
		catch(Exception e){
			System.out.println("Kindly enter valid option....Try Again!");
			mainmenu();
			
		}
		
	}
	static void allfiles()
	{
		System.out.println("Available Files Are Listed Below: \n");
		Filepath.file();
		
	}
	static void detailedoption() throws Exception 
	{
		Detailedoption.menu();
	}
	public static void main(String[] args) {
		Welcomescreen w=new Welcomescreen();
		
		System.out.println("Project Name:Locker");
		System.out.println("Developer Name: Kalpana Sajwan\n");
		System.out.println("Main Menu");
		System.out.println("1. List All Files");
		System.out.println("2. Detailed File Option Menu");
		System.out.println("3. Close Application");
		
		
		try
		{
			Scanner s=new Scanner(System.in);
			
			int ch=s.nextInt();
			
			switch(ch)
		{
		case 1: allfiles();
				mainmenu();
			    
		case 2:	detailedoption();    
				
		case 3: break;
		default: System.out.println("Kindly enter valid option!");
		mainmenu();	
		}
		}
		catch(Exception e)
		{
			System.out.println("Kindly enter valid option!");
			mainmenu();	
		}
		
		
	}

}
