package project.finals.register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import project.finals.login.LoginView;
import project.finals.register.RegisterView;


public class RegisterController{
	
	public RegisterView registerView;
	public LoginView loginView;

	public RegisterController(RegisterView registerView){
		this.registerView = registerView;
		this.loginView = new LoginView();
	}

	public ActionListener getLoginButton(JFrame GuiFrame){
		return new ActionListener(){

			public void actionPerformed(ActionEvent e){

				GuiFrame.getContentPane().removeAll();
				GuiFrame.repaint();

				loginView.loginGui(GuiFrame);
			}
		};
	}

}