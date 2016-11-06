/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import java.io.File;
/**
 *
 * @author RachmiAzanisa
 */
public class Login implements ActionListener, FocusListener {
    LoginPage view;
    public Login(){
        view = new LoginPage();
        view.setVisible(true);
        view.addListener(this);
        view.setTitle("Login Sistem Penyewaan");
        this.view.getTfUserName().addFocusListener(this);
        this.view.getTfPassword().addFocusListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source= e.getSource();
        if(source.equals(view.getBottonRegistrasi())){
            new Regitrasi();
        }else{
            if(){
                
            }else{
                JOptionPane.showMessageDialog(null, "Username atau Password Salah, silahkan coba lagi");
            }
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
       
    }

    @Override
    public void focusLost(FocusEvent e) {
        Object o = e.getSource();
        if(o.equals(this.view.getTfUserName())){
            if(this.view.getUserName().equals("")){
                JOptionPane.showMessageDialog(null, "Harap isi username anda");
            }
        }else{
            if((new String(this.view.getPassword())).equals("")){
                JOptionPane.showMessageDialog(null, "Harap isi password anda");
            }
        }
    }
   
}
