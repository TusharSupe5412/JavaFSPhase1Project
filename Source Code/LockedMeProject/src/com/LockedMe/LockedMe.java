package com.LockedMe;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class LockedMe {

	static final String projectFilePath = "D:\\Simplilearn learning\\Course 2-Implement OOPS using JAVA with Data Structures and Beyond\\Project\\LockedMeFiles";
	static final String errorMassage = "Some error occured please contact : admin@lockedMe.com";
	public static void main(String[] args) 
	{
		createFiles();
//		displayMenu();
//		getAllFiles();
//		deleteFiles();
//		searchFiles();
	}
	
	/**
	 * Display the menu of LokedMe.com
	 */
	public static void displayMenu()
	{
		System.out.println("***********************************************************************************");
		System.out.println("\t\tWelcome to LockedMe.com"+"\t\t\tDesigned by-Tushar V Supe");
		System.out.println("***********************************************************************************");
		System.out.println("\t\t1.Display all the file");
		System.out.println("\t\t2.Add a new file");
		System.out.println("\t\t3.Delete a file");
		System.out.println("\t\t4.Search a file");
		System.out.println("\t\t5.Exit");

		
	}
	
	/**
	 * This function will return all the files from the project directory
	 */
	
	public static void getAllFiles()
	{
		try {
		File folder = new File(projectFilePath);
		File[] listOfFiles = folder.listFiles();
		
		if(listOfFiles.length == 0)
			System.out.println("No files exist in the directory");
		else
		{
			for (var l : listOfFiles) 
			{
				System.out.println(l.getName());
			}
		}
		}
		catch(Exception e){
			System.out.println(errorMassage);
		}
	}
	
	public static void createFiles()
	{
		
		try  
		{    
		Scanner obj = new Scanner(System.in);
		String fileName;
		
		System.out.println("Enter the file name :");
		fileName = obj.nextLine();
		
		int linesCount;
		System.out.println("Enter how many lines in the file :");
		linesCount = Integer.parseInt(obj.nextLine());
		
		FileWriter myWriter = new FileWriter(projectFilePath + "\\" +fileName);
	     
			
		 for(int i= 1; i<=linesCount; i++)
		 {
			 System.out.println("Enter the file line");
			 myWriter.write(obj.nextLine()+"\n");
			 }
		 
		 myWriter.close();
		 obj.close();
		}  
		catch(Exception e)  
		{  
		System.out.println(errorMassage);
		}  
		
	}
	
	/**
	 * This method will delete the file from the directory based on provided file name.
	 */
	public static void deleteFiles()
	{
		Scanner obj = new Scanner(System.in);
		try  
		{    
		String fileName;
		
		System.out.println("Enter the file name to be deleted :");
		fileName = obj.nextLine();
			
		File file= new File(projectFilePath + "\\" +fileName);  
		
		if(file.exists()) 
		{
		fileName.equals(fileName);
		file.delete();                 
		System.out.println("File is deleted successfully :"+" " + fileName );  
		}
		else   
		System.out.println("failed to delete file..."+"\\" +fileName);  
		 
		}  
		catch(Exception e)  
		{  
		System.out.println(errorMassage);
		}  
		
		finally {
			obj.close();
		}
	} 
	/**
	 * This method will search files from  the directory
	 */
	public static void searchFiles()
	{
		Scanner obj = new Scanner(System.in);
		try  
		{    
		String fileName;
		
		System.out.println("Enter the file name to be searched :");
		fileName = obj.nextLine();
		
		File folder = new File(projectFilePath);
		File[] listOfFiles = folder.listFiles();
			
		LinkedList<String> filenames = new LinkedList<String>();
		
		for (var l : listOfFiles)
			filenames.add(l.getName());
		
		if (filenames.contains(fileName))
			System.out.println(fileName +"==>>"+ "This file is available.");
		else
			System.out.println(fileName +"==>>"+" This file is not available.");
		 
		}  
		catch(Exception e)  
		{  
		System.out.println(errorMassage);
		}  
		
		finally {
			obj.close();
		}
	}
	

	

	

}
