package book.system.model;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Register{
	
	public void RegisterFileHandling(String name, String username , String password){
		
			try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt",true))){
				writer.write(name + ", " + username + ", " + password);
				writer.newLine();
				JOptionPane.showMessageDialog(null, "Registration successful!");
				
				
			}catch (IOException ex){
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error!");
			}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}