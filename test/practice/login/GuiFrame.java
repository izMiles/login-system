package book.system.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.login.LoginView;
import book.system.register.RegisterView;
//import book.system.dashboard.UserView;

public class GuiFrame extends JFrame {
    
    public LoginView loginView;
    public RegisterView registerView;

    public GuiFrame(){

        setTitle("BOOK SYSTEM");
        setSize(400, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        loginView = new LoginView();
        registerView = new RegisterView();

        loginView.loginGui(this);

        setVisible(true);
    }
}
