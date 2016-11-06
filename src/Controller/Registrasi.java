/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Akun;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
/**
 *
 * @author RachmiAzanisa
 */
public class Registrasi implements ActionListener, FocusListener {
    Registrasi view;
    Akun akun;
    public Registrasi(){
        view = new Registrasi();
        view.setVisible(true);
        view.addListener(this);
        this.akun = null;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object source = e.getSource();
        if(source.equals(view.getBtnKembaliRegistrasi())){
            new Login(akun);
        } else if (source.equals(view.getBtnRegistrasiRegistrasi())){
            String username = view.getUsername();
            String password = view.getPassword();
            String nama = view.getNama();
            String ulangipassword = view.getUlangiPassword();
            if (akun == null){
                Akun akun = new Akun(nama, username, password, ulangipassword);
            }
            new ControllerMenuUtama(akun);
        } //else if (source.equals(view.getTfNama())
    }

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addListener(Registrasi aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*private Object getBtnRegistrasiRegistrasi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    /*private Object getBtnKembaliRegistrasi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
   
}
