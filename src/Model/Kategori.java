/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author alvinmatias69
 */
public class Kategori {
    private String nama;
    private int jumlahKursi;

    public Kategori(String nama, int jumlahKursi) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
    
}
