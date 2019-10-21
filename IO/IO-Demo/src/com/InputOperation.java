package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputOperation {

	public static void main(String[] args) {
		
		try {
			
			InputStreamReader isr=new InputStreamReader(System.in);
			
			BufferedReader br=new BufferedReader(isr);
			
			
			System.out.println("Enter a Number: ");
			int x=Integer.parseInt(br.readLine());
			
			System.out.println("Enter a Character: ");
			char ch=(char)br.read();
			
			br.readLine(); // dummy 
			
			System.out.println("Enter a String: ");
			String s1=br.readLine();
		
			
			System.out.println("Number: "+x);
			System.out.println("String: "+s1);
			System.out.println("Character: "+ch);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}