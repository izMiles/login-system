package project.finals.view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class GuiFrame extends JFrame{

	public LoginView loginView;

	public GuiFrame(){

		setSize(400, 500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		loginView = new LoginView();

		loginView.loginGui(this);
		setVisible(true);
	}
}