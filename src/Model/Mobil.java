/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author RachmiAzanisa
 */
public class Mobil {
    private String nama;
    private long harga;
    private Kategori kategori;
    
    public Mobil(String nama, Kategori kategori, long harga){
        this.nama=nama;
        this.kategori=kategori;
        this.harga=harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public long getHarga() {
        return harga;
    }

    public Kategori getKategori() {
        return kategori;
    }
    
    
}
