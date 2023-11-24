package book.system.model;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Login{
	
	
	public String LoginFileHandling(String EnteredUsername,String Enteredpassword){
		try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))){
			
			
			String line;
			
			while ((line = reader.readLine()) != null){
				String[] parts = line.split(", ");
				
					if (parts.length == 3){
						String username = parts[1];
						String password = parts[2];
						String name = parts[0];
						
						if (EnteredUsername.equals(username) && Enteredpassword.equals(password)){
							
							return name;
						}
						
						
					}
					
					
				
				
				
				
				
			}
			
			
			
			
			
			
		}catch (IOException e){
			e.printStackTrace();
		}	
		
		
			
			
			return null;
			
			}
	
	
	
	
	
	
	
	
	
	
}