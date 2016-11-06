/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author alvinmatias69
 */
public class FileIO {
    public void saveKategori(ArrayList<Kategori> listKategori){
        try{
            FileOutputStream fos = new FileOutputStream("kategori.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listKategori);
            oos.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Kategori> loadKategori(){
        try{
            FileInputStream fis = new FileInputStream("kategori.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (ArrayList<Kategori>) ois.readObject();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public void saveMobil(ArrayList<Mobil> listMobil){
        try{
            FileOutputStream fos = new FileOutputStream("mobil.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listMobil);
            oos.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Mobil> loadMobil(){
        try{
            FileInputStream fis = new FileInputStream("kategori.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (ArrayList<Mobil>) ois.readObject();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
