/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Mobil;
import Model.Penyewaan;
import Model.StrategiPenyewaan;
import View.MenuPenyewaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Dian Dwi Arini
 */
public class ControllerMenuPenyewaan implements ActionListener{
    MenuPenyewaan view;
    Penyewaan p;
    StrategiPenyewaan jenisPenyewaan;
    Mobil mobil;
    
    public ControllerMenuPenyewaan(Penyewaan p){
        this.p=p;
        view = new MenuPenyewaan();
        view.setVisible(true);
        view.addListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         Object source = e.getSource();
         if(source.equals(view.getBtnSewa())){
             Penyewaan penyewaan = new Penyewaan(jenisPenyewaan, mobil);
//             penyewaan = ArrayList[]; //simpan ke arraylist
             
         }
    }
}


