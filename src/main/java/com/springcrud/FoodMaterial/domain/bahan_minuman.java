package com.springcrud.FoodMaterial.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ghozy
 */

@Entity
public class bahan_minuman {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID_Bahan_Minuman;
    private String Nama;
    private String Jenis;
    private int Stok;
    private String Satuan;

    public bahan_minuman() {
        super();
    }

    public bahan_minuman(int ID_Bahan_Minuman, String Nama, String Jenis, int Stok, String Satuan) {
        super();
        this.ID_Bahan_Minuman = ID_Bahan_Minuman;
        this.Nama = Nama;
        this.Jenis = Jenis;
        this.Stok = Stok;
        this.Satuan = Satuan;
    }

    public int getID_Bahan_Minuman() {
        return ID_Bahan_Minuman;
    }

    public void setID_Bahan_Minuman(int ID_Bahan_Minuman) {
        this.ID_Bahan_Minuman = ID_Bahan_Minuman;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public String getSatuan() {
        return Satuan;
    }

    public void setSatuan(String Satuan) {
        this.Satuan = Satuan;
    }
}
