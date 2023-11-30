package book.system.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.register.RegisterView;
import book.system.dashboard.UserView;
import book.system.register.RegisterController;

public class LoginController {

     public RegisterView registerView;
     public LoginView loginView;
     public Login login;
     public UserView userView;
     

    public LoginController(LoginView loginView){
       this.registerView = new RegisterView();
       this.loginView = loginView;
       this.login = new Login();
       this.userView = new UserView();
       
    }

    public ActionListener getRegisterButton(JFrame GuiFrame){
        return new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                
                GuiFrame.getContentPane().removeAll();
                GuiFrame.repaint();
            
               registerView.registerGui(GuiFrame);
            }
        };
    }

    public ActionListener getLoginButton(JFrame GuiFrame, JTextField usernameInput, JTextField passwordInput){
        return new ActionListener(){

            public void actionPerformed(ActionEvent e){
                
                String getUser = usernameInput.getText();
                String getPass = passwordInput.getText();

                if(getUser.isEmpty() || getPass.isEmpty()){

                    JOptionPane.showMessageDialog(null,"Please Fill up all Before Login");

				}else{

             String displayName = login.loginFileHandling(getUser, getPass);
            
             if(displayName != null){
                
             GuiFrame.getContentPane().removeAll();
             GuiFrame.repaint();
            userView.userGui(GuiFrame, getUser);
             
            JOptionPane.showMessageDialog(null,"Login Successful");
				}
				else{
						JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
				}

            
            


             




            }
        }
    };
    
    }
}
