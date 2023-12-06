package project.finals.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import project.finals.register.RegisterView;
import project.finals.login.LoginView;

public class LoginController{
	
	public LoginView loginView;
	public RegisterView registerView;

	public LoginController(LoginView loginView){

		this.loginView = loginView;
		this.registerView = new RegisterView();
	}

	public ActionListener getRegisterButton(JFrame GuiFrame){
		return new ActionListener(){

			public void actionPerformed(ActionEvent e){

				GuiFrame.getContentPane().removeAll();
				GuiFrame.repaint();

				registerView.registerGui(GuiFrame);
			}
		};
	}

}