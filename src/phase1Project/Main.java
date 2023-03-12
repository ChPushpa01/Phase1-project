package phase1Project;

import java.io.IOException;
import java.util.Scanner;
import phase1Project.Helper;
public class Main {
	public static void main(String[] args) throws IOException
	
	{
		Helper hp = new Helper();
		System.out.print("Do you want to continue the process ?Y/N : ");
		char choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.next().charAt(0);
		if(choice!='N')
		{
			System.out.println("Choose the following operations to perform");
			System.out.println("1.Add Files");
			System.out.println("2.Delete Files");
			System.out.println("3.View Files in sorted order");
			System.out.println("4.Search File in directory");
			
			int op;
			System.out.print("Choose the option : ");
			op = sc.nextInt();
			switch(op) {
			case 1:
				String path;
				System.out.print("Enter the File name : ");
				path = sc.next();
				hp.addFile(path);
				break;
			case 2:
				String fname;
				System.out.print("Enter the file name you want to delete : ");
				fname = sc.next();
				hp.deleteFile(fname);
				break;
			case 3:
				hp.ViewFiles()	;
				break;
			case 4:
				String path4;
				System.out.print("Enter the File Name : ");
				path4 = sc.next();
				hp.searchFile(path4);
				break;
			}
		}
		else {
			System.out.println("Process Stopped ");
		}
			
		System.out.println("Do you want to continue?Y/N : ");
			
			choice = sc.next().charAt(0);
			
		}
	}
