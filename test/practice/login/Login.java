package book.system.login;

import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.*;

class Login{


    public String loginFileHandling(String loginUser, String loginPass){
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\godwi\\Desktop\\test\\practice\\database\\users.dat"))){

            String line;
            if((line = reader.readLine() ) !=null){

                String[] parts = line.split("\t");

                String firstName = parts[0];
                String lastName = parts[1];
                String userName = parts[2];
                String passWord = parts[3];

                if(loginUser.equals(userName) && loginPass.equals(passWord)){
                    return firstName + lastName;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    }
