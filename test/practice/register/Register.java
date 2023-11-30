package book.system.register;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


 class Register {
    
    public void registerFileHandling(String rfName, String rlName, String ruserName, String rPassword){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\godwi\\Desktop\\test\\practice\\database\\users.dat", true))){
            writer.write(rfName + "\t" + rlName + "\t" + ruserName + "\t" + rPassword + "\t");
            writer.newLine();

            JOptionPane.showMessageDialog(null, "Register Successfull!");

        }catch (IOException e){
            e.printStackTrace();
        }
        }
    }

