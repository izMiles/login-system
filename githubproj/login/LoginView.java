package project.finals.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LoginView{
	
	private LoginController loginController;


	public void loginGui(JFrame GuiFrame){

		loginController = new LoginController(this);


		JPanel loginPanel = new JPanel();
		loginPanel.setSize(400, 500);
		loginPanel.setBackground(new Color(30, 30, 35));
		loginPanel.setLayout(null);
		
		JLabel title = new JLabel("My Notepad");
		title.setFont(new Font("MV Boli", Font.PLAIN,20));
		title.setForeground((Color.white));
		title.setBounds(135, 20, 150, 30);
		loginPanel.add(title);

		JButton signInBtn = new JButton ("SIGN IN");
		signInBtn.setBounds(50, 70, 100, 30);
		signInBtn.setForeground((Color.white));
		signInBtn.setBorderPainted(false);
		signInBtn.setFocusPainted(false);
		signInBtn.setBackground(new Color(30, 30, 35));
		loginPanel.add(signInBtn);

		JButton createAccBtn = new JButton ("CREATE ACCOUNT");
		createAccBtn.setBounds(200, 70, 150, 30);
		createAccBtn.setBorderPainted(false);
		createAccBtn.setFocusPainted(false);
		createAccBtn.setForeground((Color.white));
		createAccBtn.setBackground(new Color(30, 30, 35));
		createAccBtn.addActionListener(loginController.getRegisterButton(GuiFrame));
		loginPanel.add(createAccBtn);

		JLabel signLabel = new JLabel("USERNAME");
		signLabel.setBounds(40, 130, 150, 30);
		signLabel.setForeground((Color.white));
		loginPanel.add(signLabel);

		JTextField signInput = new JTextField();
		signInput.setBounds(40, 170, 300, 50);
		signInput.setBackground((Color.white));
		signInput.setForeground((Color.black));
		signInput.setFont(new Font("SansSerif", Font.PLAIN,16));
		loginPanel.add(signInput);

		JLabel passLabel = new JLabel("PASSWORD");
		passLabel.setBounds(40, 240, 150, 30);
		passLabel.setForeground((Color.white));
		loginPanel.add(passLabel);

		JTextField passInput = new JTextField();
		passInput.setBounds(40, 280, 300, 50);
		passInput.setBackground((Color.white));
		passInput.setForeground((Color.black));
		passInput.setFont(new Font("SansSerif", Font.PLAIN,16));
		loginPanel.add(passInput);

		JButton loginBtn = new JButton("SIGN IN");
		loginBtn.setBounds(90, 370, 200, 40);
		loginBtn.setBackground(new Color(219, 53, 53));
		loginBtn.setForeground((Color.white));
		loginBtn.setBorderPainted(false);
		loginBtn.setFocusPainted(false);
		loginPanel.add(loginBtn);


		loginPanel.setVisible(true);
		GuiFrame.add(loginPanel);
	}
}