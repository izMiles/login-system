package project.finals.register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterView{
	
	private RegisterController registerController;


	public void registerGui(JFrame GuiFrame){

		registerController = new RegisterController(this);

		JPanel registerPanel = new JPanel();
		registerPanel.setSize(400,500);
		registerPanel.setBackground(new Color(30, 30, 35));
		registerPanel.setLayout(null);

		JLabel title = new JLabel("My Notepad");
		title.setFont(new Font("MV Boli", Font.PLAIN,20));
		title.setForeground((Color.white));
		title.setBounds(135, 20, 150, 30);
		registerPanel.add(title);

		JButton signInBtn = new JButton ("SIGN IN");
		signInBtn.setBounds(50, 70, 100, 30);
		signInBtn.setForeground((Color.white));
		signInBtn.setBorderPainted(false);
		signInBtn.setFocusPainted(false);
		signInBtn.setBackground(new Color(30, 30, 35));
		signInBtn.addActionListener(registerController.getLoginButton(GuiFrame));
		registerPanel.add(signInBtn);

		JButton createAccBtn = new JButton ("CREATE ACCOUNT");
		createAccBtn.setBounds(200, 70, 150, 30);
		createAccBtn.setBorderPainted(false);
		createAccBtn.setFocusPainted(false);
		createAccBtn.setForeground((Color.white));
		createAccBtn.setBackground(new Color(30, 30, 35));
		registerPanel.add(createAccBtn);

		JLabel nameLabel = new JLabel("NAME");
		nameLabel.setBounds(40, 125, 150, 30);
		nameLabel.setForeground((Color.white));
		registerPanel.add(nameLabel);

		JTextField nameInput = new JTextField();
		nameInput.setBounds(40, 160, 300, 30);
		nameInput.setBackground((Color.white));
		nameInput.setFont(new Font("SansSerif", Font.PLAIN,16));
		registerPanel.add(nameInput);

		JLabel usernLabel = new JLabel("USERNAME");
		usernLabel.setBounds(40, 200, 150, 30);
		usernLabel.setForeground((Color.white));
		registerPanel.add(usernLabel);

		JTextField usernInput = new JTextField();
		usernInput.setBounds(40, 235, 300, 30);
		usernInput.setBackground((Color.white));
		usernInput.setFont(new Font("SanesSerif", Font.PLAIN, 16));
		registerPanel.add(usernInput);

		JLabel passLabel = new JLabel("PASSWORD");
		passLabel.setBounds(40, 275, 150, 30);
		passLabel.setForeground((Color.white));
		registerPanel.add(passLabel);

		JPasswordField passInput = new JPasswordField();
		passInput.setBounds(40, 310, 300, 30);
		passInput.setBackground((Color.white));
		registerPanel.add(passInput);

		JButton registerBtn = new JButton("REGISTER");
		registerBtn.setBounds(90, 370, 200, 40);
		registerBtn.setBackground(new Color(219, 53, 53));
		registerBtn.setForeground((Color.white));
		registerBtn.setFocusPainted(false);
		registerBtn.setBorderPainted(false);
		registerPanel.add(registerBtn);





		GuiFrame.add(registerPanel);


	}
}