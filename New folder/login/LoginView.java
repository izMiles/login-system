package project.finals.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LoginView{
	
	private LoginController loginController;


	public void loginGui(JFrame GuiFrame){

		loginController = new LoginController(this);


		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(500, 0, 500, 700);
		loginPanel.setBackground(new Color(30, 30, 35));
		loginPanel.setLayout(null);
		
		JLabel title = new JLabel("My Notepad");
		title.setFont(new Font("MV Boli", Font.PLAIN,30));
		title.setForeground((Color.white));
		title.setBounds(170, 80, 200, 30);
		loginPanel.add(title);


		JLabel signLabel = new JLabel("USERNAME");
		signLabel.setBounds(100, 190, 150, 30);
		signLabel.setForeground((Color.white));
		loginPanel.add(signLabel);

		JTextField signInput = new JTextField();
		signInput.setBounds(100, 225, 300, 40);
		signInput.setBackground((Color.white));
		signInput.setForeground((Color.black));
		signInput.setFont(new Font("SansSerif", Font.PLAIN,16));
		loginPanel.add(signInput);

		JLabel passLabel = new JLabel("PASSWORD");
		passLabel.setBounds(100, 285, 150, 30);
		passLabel.setForeground((Color.white));
		loginPanel.add(passLabel);

		JPasswordField passInput = new JPasswordField();
		passInput.setBounds(100, 320, 300, 40);
		passInput.setBackground((Color.white));
		passInput.setForeground((Color.black));
		passInput.setFont(new Font("SansSerif", Font.PLAIN,16));
		loginPanel.add(passInput);

		JButton loginBtn = new JButton("LOGIN");
		loginBtn.setBounds(150, 420, 200, 40);
		loginBtn.setBackground(new Color(219, 53, 53));
		loginBtn.setForeground((Color.white));
		loginBtn.setBorderPainted(false);
		loginBtn.setFocusPainted(false);
		loginPanel.add(loginBtn);

		JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
		separator.setBounds(250, 550, 5, 50);
		loginPanel.add(separator);

		JButton signInBtn = new JButton ("SIGN IN");
		signInBtn.setBounds(130, 550, 100, 40);
		signInBtn.setFont(new Font("SansSerif", Font.PLAIN, 14));
		signInBtn.setForeground((Color.white));
		signInBtn.setBorderPainted(false);
		signInBtn.setFocusPainted(false);
		signInBtn.setBackground(new Color(30, 30, 35));
		loginPanel.add(signInBtn);

		JButton createAccBtn = new JButton ("REGISTER");
		createAccBtn.setBounds(270, 550, 120, 40);
		createAccBtn.setBorderPainted(false);
		createAccBtn.setFont(new Font("SansSerif", Font.PLAIN, 14));
		createAccBtn.setFocusPainted(false);
		createAccBtn.setForeground((Color.white));
		createAccBtn.setBackground(new Color(30, 30, 35));
		createAccBtn.addActionListener(loginController.getRegisterButton(GuiFrame));
		loginPanel.add(createAccBtn);


		loginPanel.setVisible(true);
		GuiFrame.add(loginPanel);
	}
}