import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class VirtualKey {
		//create File ....
		public static void genaretFile(String fileName) throws IOException 
		{
			String filePath="D:\\virtual lock\\";
			ArrayList<String> aList=new ArrayList<String>();
			
			System.out.println("enter the file name to be created");
			String finalname=filePath+fileName;
			
			File f=new File(finalname);
			boolean b=f.createNewFile();
			if(b!=true) 
			{
				System.out.println("the file not created");
			}
			else 
			{
				aList.add(fileName);
				System.out.println("file created");
			}
			
			System.out.println("Your list  created is .... "+aList);
		}
		
		//Delete file
		
		public static void deleteFile(String fileName) {
			String path="D:\\virtual lock\\";

			String finalfile=path+fileName;
			File file=new File(finalfile);
			file.delete();
			System.out.println("file deleted");
			
		}
		//Searching 
		
		public static void searchFile(String searchingFileName) {
			String path="D:\\virtual lock\\";
			File f=new File(path);
			File filename[]=f.listFiles();
			int count=0;
			for(File ff:filename) {
				
				if(ff.getName().equals(searchingFileName))
				{
					count++;
					break;
				}else {
					count=0;
				}
			}
			if (count!=0) {
				System.out.println("You have "+searchingFileName+" File ");
				
			}else {
				System.out.println("File is not found");
			}
		}
		
		//Display File List
		
		public  static void displayFile() {
			String path="D:\\virtual lock\\";
			File f=new File(path);
			File filename[]=f.listFiles();
			System.out.println("List of Files ");
			for(File ff:filename) {
				System.out.println(ff.getName());
			}
		}
		
		
		//Main Method Start
		
		public static void main(String[] args) throws IOException {
			
			Scanner Scanner =new Scanner(System.in);
			boolean c=true;
			// Main menu;
			
			
			while(c) {
				System.out.println("          LookMe.com            ");
				System.out.println("  Enter 1 to Retreive files in ascending order ");
				System.out.println(" Enter 2 to Add,Delete,Search file");
				System.out.println(" Enter 3 to close the app");
				System.out.println();
				boolean b=true;
				int x=Scanner.nextInt();
				switch (x) {
				case 1:{
				
					displayFile();
					System.out.println();
					break;
				}
				case 2: 
				{	while(true) {
					System.out.println("Which task you want to do ?");
					System.out.println();
					System.out.println(" Enter 1 for the file name to be created ");
					System.out.println("  Enter 2 for the file name to be deletd ");
					System.out.println("enter 3 to search the file");
					System.out.println();
					int i=Scanner.nextInt();
					
					if(i<=0 || i>=6) {
						
						System.out.println(" Enter valid number! ");
						System.out.println();
				
					}else{
							if(i==1){
							System.out.println(" Enter the File Name  to  be created ");
										
							String  FileForCreate=Scanner.next();
							genaretFile(FileForCreate);
							System.out.println();
										
									}
									else if(i==2) {
										System.out.println("Enter the File name to  be deleted ");
										String FileForDelete=Scanner.next();
										deleteFile(FileForDelete);
										System.out.println();
									}
									else if(i== 3) {
										System.out.println("Enter the File Name  to be searched ");
										
									
									String FileForSerching=Scanner.next();
									searchFile(FileForSerching);
									System.out.println();
									}
									else if(i==4) {
										System.out.println(" Main Menu ");
										System.out.println();
										break;
									}
						
							}			
				}
				break;
					}
				
				case 3:{
					System.out.println(" close app");
					c=false;
					break;
					
				}
				}	
			}	
		}
	}
