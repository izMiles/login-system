package book.system.view;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.controller.LoginController;
import book.system.controller.RegisterController;


 public class GuiFrame extends JFrame {
	 public LoginController controller;
	public RegisterController rController;
	 
//================== PANEL 1 ====================================/
	   public JLabel usernameLabel,passwordLabel;
       public  JButton loginBtn,registerBtn;
       public  TextField loginUserText,loginPassT;
		
		





		
// ===================PANEL 2 =================================================/		
		public JLabel NameLabel,PasswordLabel,UsernameLabel,RegisterLabel;
		public 	JButton registerCancelBtn,registerSaveBtn;
		public TextField NameText,PasswordText,UsernameText;
		
       







//====================== PANEL 3 ==============================//
   JLabel NameLabel3;
   JButton logoutBtn;
   



		
		

 public void guiFrame(){

       
        controller = new LoginController(this); 
		rController = new RegisterController(this);

      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
		
        setSize(400,500);
		
		logsView();
		
		 setVisible(true);


 }



	
	
	
	












    public void logsView(){
		JPanel panel1 = new JPanel();
		
		
 
 
 
        panel1.setLayout(null);
        panel1.setSize(380,480);
        panel1.setBackground(new Color(232,209,132));

        add(panel1);
		
		
		
		
//----------------------------------------------------------------------------//

        loginBtn = new JButton("Login");
        loginBtn.setBounds(130,320,120,30);
        panel1.add(loginBtn);
		loginBtn.addActionListener(controller.getLoginBtn());






        registerBtn = new JButton("Register");
        registerBtn.setBounds(130,360,120,30);
		registerBtn.addActionListener(controller.getRegisterBtn());
		
		
        panel1.add(registerBtn);
		
		
		
		
		
		
		
		

//----------------------------------------------------------------------------//
        loginUserText = new TextField();
        loginUserText.setBounds(40,140,300,26);
        panel1.add(loginUserText);
		
		
		

        usernameLabel = new JLabel("USERNAME");
        usernameLabel.setBounds(40,120,300,26);
        panel1.add(usernameLabel);

//-------------------------------------------------------------------------------//



        loginPassT = new TextField();
        loginPassT.setBounds(40,240,300,26);
        panel1.add(loginPassT);

        passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setBounds(40,220,300,26);
        panel1.add(passwordLabel);

//----------------------------------------------------------------------------------------
      


	
	
	}
	
	
	public TextField getLoginUsername(){
		return loginUserText;
	}
	
	public TextField getLoginPassword(){
		return loginPassT;
	}
	
	
	
	


















	
//========================== PANEL 2  ==================================================//	
	
	
	
	
	
	public	void registerGUI(){
		
		JPanel panel2 = new JPanel();
//----------------------------------------------------------------------------//		
		panel2.setLayout(null);
		panel2.setSize(390,490);
		panel2.setBackground(new Color(50, 168, 158));
		add(panel2);
	

//------------------------------------------------------------------------------/


	
		RegisterLabel = new JLabel("Register");
		RegisterLabel.setBounds(180,70,300,26);

		panel2.add(RegisterLabel);
		
		
	//----------------------------------------------------------------	/
		
		
		NameLabel = new JLabel("Name ");
		NameLabel.setBounds(40,115,40,26);
		panel2.add(NameLabel);
		
		
		
		
		NameText = new TextField("");
		NameText.setBounds(115,120,233,20);
		panel2.add(NameText);
	

//---------------------------------------------------------------------------	/


		UsernameLabel = new JLabel("Username");
		UsernameLabel.setBounds(40,150,60,26);
		panel2.add(UsernameLabel);
		
		
		UsernameText = new TextField("");
		UsernameText.setBounds(115,155,233,20);
		panel2.add(UsernameText);
		
		
		
	//----------------------------------------------------------------------//	
		
		PasswordLabel = new JLabel("Password");
		PasswordLabel.setBounds(40,180,60,26);
		panel2.add(PasswordLabel);
		
		
		PasswordText = new TextField("");
		PasswordText.setBounds(115,185,233,20);
		panel2.add(PasswordText);
		
	//----------------------------------------------------------------------//	
		
		registerCancelBtn = new JButton("Cancel");
		registerCancelBtn.setBounds(130,360,120,30);
		registerCancelBtn.addActionListener(rController.getCancelBtn());
		
		panel2.add(registerCancelBtn);
		
		
	//--------------------------------------------------------------------------//
	
		registerSaveBtn = new JButton("Register");
		registerSaveBtn.setBounds(130,320,120,30);
		registerSaveBtn.addActionListener(rController.getRegisterButton2());
		
		
		panel2.add(registerSaveBtn);
		
		
	
		
	}
	
	
	
	
	
	
	
	
	public TextField registerGetUserName(){
		
		return UsernameText;
		
	}
	
	
	public TextField registerGetName(){
		return NameText;
	}
	
	
	public TextField registerGetPassword(){
		return PasswordText;
		
	}
	

	













// ============================== PANEL 3 =========================================//


public void userView(String displayName){


		JPanel panel3 = new JPanel();

        panel3.setLayout(null);
        panel3.setSize(390,480);
        panel3.setBackground(new Color(3, 157, 252));

        add(panel3); 




		NameLabel3 = new JLabel(displayName);
		NameLabel3.setBounds(50,90,120,30);
		panel3.add(NameLabel3);



	    logoutBtn = new JButton("Logout");
        logoutBtn.setBounds(130,320,120,30);

		logoutBtn.addActionListener(controller.getLogoutBtn());

        panel3.add(logoutBtn);











}






















	
	
	
	
	
	
	
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


