package book.system.register;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RegisterView {
    
    JLabel fnameLabel, lnameLabel, usernLabel, passwLabel, regTitle;
    JTextField fnameInput, lnameInput, usernInput, passwInput;
    JButton regBtn, exitBtn;
    JPanel registerPanel;

    private RegisterController registerController;

    public void registerGui(JFrame tempFrame){

        registerController = new RegisterController(this);

        registerPanel = new JPanel();
        registerPanel.setSize(400, 500);
        registerPanel.setLayout(null);
        registerPanel.setVisible(true);
        
        regTitle = new JLabel("REGISTER");
        regTitle.setBounds(180, 10, 150, 30);
        registerPanel.add(regTitle);

        fnameLabel = new JLabel("First Name");
        fnameLabel.setBounds(10, 50, 150, 30);
        registerPanel.add(fnameLabel);

        fnameInput = new JTextField();
        fnameInput.setBounds(10, 90, 350, 30);
        registerPanel.add(fnameInput);

        lnameLabel = new JLabel("Last Name");
        lnameLabel.setBounds(10, 130, 150, 30);
        registerPanel.add(lnameLabel);

        lnameInput = new JTextField();
        lnameInput.setBounds(10, 170, 350, 30);
        registerPanel.add(lnameInput);

        usernLabel = new JLabel("Username");
        usernLabel.setBounds(10, 210, 150, 30);
        registerPanel.add(usernLabel);

        usernInput = new JTextField();
        usernInput.setBounds(10, 250, 350, 30);
        registerPanel.add(usernInput);

        passwLabel = new JLabel("Password");
        passwLabel.setBounds(10, 290, 150 ,30);
        registerPanel.add(passwLabel);

        passwInput = new JTextField();
        passwInput.setBounds(10, 330, 350 ,30);
        registerPanel.add(passwInput);

        regBtn = new JButton ("REGISTER");
        regBtn.setBounds(280, 400, 100, 40);
        regBtn.addActionListener(registerController.getRegButton(tempFrame, fnameInput, lnameInput, usernInput, passwInput));
        registerPanel.add(regBtn);

        exitBtn = new JButton ("EXIT");
        exitBtn.setBounds(180, 400, 100, 40);
        exitBtn.addActionListener(registerController.getExitButton(tempFrame));
        registerPanel.add(exitBtn);

        tempFrame.add(registerPanel);




        
    
    }
}
