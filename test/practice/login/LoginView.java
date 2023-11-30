package book.system.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class LoginView{
    
    JLabel usernameLabel, passwordLabel, title;
    JTextField usernameInput, passwordInput;
    JButton loginBtn, registerBtn;
    
    private LoginController loginController;
    
    public void loginGui(JFrame GuiFrame){

        loginController = new LoginController(this);

        JPanel loginPanel = new JPanel();
        loginPanel.setSize(400, 500);
        loginPanel.setLayout(null);
        loginPanel.setVisible(true);
        
        title = new JLabel("LOGIN");
        title.setBounds(180, 10, 150, 30);
        loginPanel.add(title);

        usernameLabel = new JLabel("USERNAME");
        usernameLabel.setBounds(10, 80, 150, 30);
        loginPanel.add(usernameLabel);

        usernameInput = new JTextField();
        usernameInput.setBounds(10, 115, 350 ,30);
        loginPanel.add(usernameInput);

        passwordLabel = new JLabel("PASSOWRD");
        passwordLabel.setBounds(10, 155, 150, 30);
        loginPanel.add(passwordLabel);

        passwordInput = new JTextField();
        passwordInput.setBounds(10, 190, 350, 30);
        loginPanel.add(passwordInput);
        
        loginBtn = new JButton("LOGIN");
        loginBtn.setBounds(120, 250, 100, 40);
        loginBtn.addActionListener(loginController.getLoginButton(GuiFrame, usernameInput, passwordInput));
        loginBtn.addActionListener(null);
        loginPanel.add(loginBtn);

        registerBtn = new JButton("REGISTER");
        registerBtn.setBounds(120, 300, 100, 40);
        registerBtn.addActionListener(loginController.getRegisterButton(GuiFrame));
        loginPanel.add(registerBtn);

        
         GuiFrame.add(loginPanel); 
        
    }
}
