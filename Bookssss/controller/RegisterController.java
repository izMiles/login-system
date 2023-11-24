package book.system.controller;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.view.GuiFrame;
import book.system.model.Register;


public class RegisterController{
	
	public Register register;
	public GuiFrame guiFrame;
	
	public RegisterController(GuiFrame guiFrame){
		this.guiFrame = guiFrame;
		this.register = new Register();
	}
	

	
	public ActionListener getCancelBtn(){
		return new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				guiFrame.getContentPane().removeAll();
				guiFrame.repaint();
				guiFrame.logsView();
				
				
			}
	
			
		};
		

	
	}
	
	
	
	public ActionListener getRegisterButton2(){
		return new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				String name = guiFrame.registerGetName().getText();
				String username = guiFrame.registerGetUserName().getText();
				String password = guiFrame.registerGetPassword().getText();
				
				
				
			if(name.isEmpty() || username.isEmpty() || password.isEmpty()){
				JOptionPane.showMessageDialog(null,"Please fill-up all before registering");
				
			}else{
				register.RegisterFileHandling(name,username,password);
				
				guiFrame.getContentPane().removeAll();
				guiFrame.repaint();
				guiFrame.logsView();
				
				
				
				
			}
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
		};
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}