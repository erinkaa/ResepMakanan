package com.example.resepmakanan.Adapter;

public class Menu {

    private String namaMenu, bahan, tahapan;

    public Menu() {}

    public Menu(String namaMenu, String bahan, String tahapan) {
        this.namaMenu = namaMenu;
        this.bahan = bahan;
        this.tahapan = tahapan;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getTahapan() {
        return tahapan;
    }

    public void setTahapan(String tahapan) {
        this.tahapan = tahapan;
    }
}
