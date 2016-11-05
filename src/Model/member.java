/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Mirah
 */
public class member extends Akun{
    private String noMember;
    private ArrayList<Penyewaan> penyewaan;

    public member(String nama, String username, String password, int number) {
        super(nama, username, password);
    }
    
    public void sewaMobil(Penyewaan penyewaan){
        this.penyewaan.add(penyewaan);
    }

    public String getNoMember() {
        return noMember;
    }

    public ArrayList<Penyewaan> getPenyewaan() {
        return penyewaan;
    }

    public void setNoMember(String noMember) {
        this.noMember = noMember;
    }
    
    
    
    
    
}
