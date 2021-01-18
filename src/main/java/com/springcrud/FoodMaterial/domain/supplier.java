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
public class supplier {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID_Supplier;
    private String Nama;
    private String Jenis;
    private String Alamat;
    private String No_HP;

    public supplier() {
        super();
    }

    public supplier(int ID_Supplier, String Nama, String Jenis, String Alamat, String No_HP) {
        super();
        this.ID_Supplier = ID_Supplier;
        this.Nama = Nama;
        this.Jenis = Jenis;
        this.Alamat = Alamat;
        this.No_HP = No_HP;
    }

    public int getID_Supplier() {
        return ID_Supplier;
    }

    public void setID_Supplier(int ID_Supplier) {
        this.ID_Supplier = ID_Supplier;
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

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNo_HP() {
        return No_HP;
    }

    public void setNo_HP(String No_HP) {
        this.No_HP = No_HP;
    }
}
