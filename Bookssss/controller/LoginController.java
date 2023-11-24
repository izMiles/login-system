package book.system.controller;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.view.GuiFrame;
import book.system.model.Login;




public class LoginController{
	
	
	public GuiFrame guiFrame;
	public Login login;
	
	public LoginController(GuiFrame guiFrame){
		this.guiFrame = guiFrame;
		this.login = new Login();
		
		
	}
	

	
	public ActionListener getRegisterBtn(){
		return new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				guiFrame.getContentPane().removeAll();
				guiFrame.repaint();
				guiFrame.registerGUI();
				
				
			}
	
			
		};
		

	
	}
	
	
	
	
	
	public ActionListener getLoginBtn(){
		return new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				String loginUsername = guiFrame.getLoginUsername().getText();
				String loginPassword = guiFrame.getLoginPassword().getText();
				
				
				if (loginUsername.isEmpty() || loginPassword.isEmpty()){
					JOptionPane.showMessageDialog(null, "Please fill-up all to login.");
				}
				
				String displayName = login.LoginFileHandling(loginUsername,loginPassword);
				
					if (displayName != null){

						guiFrame.getContentPane().removeAll();
						guiFrame.repaint();

						guiFrame.userView(displayName);

						JOptionPane.showMessageDialog(null,"Success ");
					}else {
						JOptionPane.showMessageDialog(null,"Invalid username or Password ");
					}
					
				
				
				
			}
			
			
			
			
		};
		
		
	}



	public ActionListener getLogoutBtn(){
		return new ActionListener(){

		public void actionPerformed(ActionEvent e){



			guiFrame.getContentPane().removeAll();
			guiFrame.repaint();
			guiFrame.logsView();

			JOptionPane.showMessageDialog(null,"Logout Successfully!");

		}





		};




	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}