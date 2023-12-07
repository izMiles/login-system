package project.finals.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import project.finals.login.LoginView;
import project.finals.register.RegisterView;

public class GuiFrame extends JFrame{

	public LoginView loginView;

	public GuiFrame(){

		setSize(1000, 700);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		loginView = new LoginView();

		loginView.loginGui(this);
		setVisible(true);
	}
}	