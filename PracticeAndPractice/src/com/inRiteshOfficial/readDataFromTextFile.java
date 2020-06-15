package com.inRiteshOfficial;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class readDataFromTextFile {

	public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\91970\\Documents\\notepad\\jstP.txt");
    Scanner scan=new Scanner(file);
    
    while(scan.hasNextLine()) {
    	System.out.println(scan.nextLine());
    }
	}

}
