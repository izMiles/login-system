package book.system.dashboard;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.login.LoginView;


public class UserController {
    
    private UserView userView;
    public LoginView loginView;

    public UserController(UserView userView){
        this.userView = userView;
        this.loginView = new LoginView();
    }
    
    public ActionListener getLogoutButton(JFrame tempoFrame){
        return new ActionListener(){

            public void actionPerformed(ActionEvent e){
                
                tempoFrame.getContentPane().removeAll();
                tempoFrame.repaint();

                loginView.loginGui(tempoFrame);
                JOptionPane.showMessageDialog(null,"logout successfully!");


            }
        };
    }
}
