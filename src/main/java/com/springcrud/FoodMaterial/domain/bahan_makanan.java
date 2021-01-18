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
public class bahan_makanan {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID_Bahan_Makanan;
    private String Nama;
    private String Jenis;
    private int Stok;
    private String Satuan;

    public bahan_makanan() {
        super();
    }

    public bahan_makanan(int ID_Bahan_Makanan, String Nama, String Jenis, int Stok, String Satuan) {
        super();
        this.ID_Bahan_Makanan = ID_Bahan_Makanan;
        this.Nama = Nama;
        this.Jenis = Jenis;
        this.Stok = Stok;
        this.Satuan = Satuan;
    }

    public int getID_Bahan_Makanan() {
        return ID_Bahan_Makanan;
    }

    public void setID_Bahan_Makanan(int ID_Bahan_Makanan) {
        this.ID_Bahan_Makanan = ID_Bahan_Makanan;
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
