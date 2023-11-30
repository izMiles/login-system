package book.system.register;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.login.LoginView;
import java.io.*;


public class RegisterController {
    public RegisterView registerView;
    public LoginView loginView;
    private Register register;

    public RegisterController(RegisterView registerView){
        this.registerView = registerView;
        this.loginView = new LoginView();
        this.register = new Register();

    }

    public ActionListener getExitButton(JFrame tempFrame){
        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

                tempFrame.getContentPane().removeAll();
                tempFrame.repaint();

                loginView.loginGui(tempFrame);
            }
        };
    }


    public ActionListener getRegButton(JFrame tempFrame, JTextField fnameInput, JTextField lnameInput, JTextField usernInput, JTextField passwInput){
        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

                String getfName = fnameInput.getText();
                String getlName = lnameInput.getText();
                String getuserName = usernInput.getText();
                String getPassword = passwInput.getText();

                register.registerFileHandling(getfName, getlName, getuserName, getPassword);
                tempFrame.getContentPane().removeAll();
                tempFrame.repaint();
                loginView.loginGui(tempFrame);
            }
        };

    }



}
