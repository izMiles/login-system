package book.system.dashboard;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class UserView {
    
    JLabel userTitle, nameDisplay;
    JButton logoutButton;
    JPanel userPanel;

    private UserController userController;


    public void userGui(JFrame tempoFrame, String getfName){

        userController = new UserController(this);

        userPanel = new JPanel();
        userPanel.setSize(400,500);
        userPanel.setLayout(null);
       

        userTitle = new JLabel("Welcome " + getfName);
        userTitle.setBounds(100, 40, 300, 50);
        userPanel.add(userTitle);

        logoutButton = new JButton("LOGOUT");
        logoutButton.setBounds(280, 400, 100, 40);
        logoutButton.addActionListener(userController.getLogoutButton(tempoFrame));
        userPanel.add(logoutButton);
        
        userPanel.setVisible(true);
        tempoFrame.add(userPanel);
    }
}
