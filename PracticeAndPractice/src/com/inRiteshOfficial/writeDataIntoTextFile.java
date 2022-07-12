package com.inRiteshOfficial;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\91970\\Documents\\notepad\\animals.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello java ");
		bw.write("Hello Python ");
		bw.write("Hello Everyone ");
		
		System.out.println("Finished!!!!");
		bw.close();

	}

}
