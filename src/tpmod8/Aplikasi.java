/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpmod8;

import Model.FileIO;
import Model.Mobil;
import Model.Member;
import Model.Kategori;
import java.util.ArrayList;

/**
 *
 * @author alvinmatias69
 */
public class Aplikasi {
    private ArrayList<Kategori> listKategori;
    private ArrayList<Mobil> listMobil;
    private ArrayList<Member> listMember;
    private FileIO database = new FileIO()s;
    
    public void createAkun(Member member){
        listMember.add(member);
    }
    
    public void addKategori(Kategori kategori){
        listKategori.add(kategori);
    }
    
    public void addMobil(Mobil mobil){
        listMobil.add(mobil);
    }
    
    public void loadMobil(){
        listMobil = database.loadMobil();
    }
    
    public void loadKategori(){
        listKategori = database.loadKategori();
    }
    
    public void saveMobil(){
        database.saveMobil(listMobil);
    }
    
    public void saveKategori(){
        database.saveKategori(listKategori);
    }
}
