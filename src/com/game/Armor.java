package com.game;

public class Armor {
    private String nama;
    private int level;
    private double defense;

    public Armor(String nama, int level, double defense) {
        this.nama = nama;
        this.level = level;
        this.defense = defense;
    }

    // method untuk menampilkan data armor
    void ShowArmor() {
        System.out.println("Nama Armor     : " + this.nama);
        System.out.println("Level Armor    : " + this.level);
        System.out.println("Defense Armor  : " + this.defense);
    }

    // getter 
    public String getShowArmor() { return nama; }
    public int getlevel() { return level; }
    public double getdefense() { return defense; }

    //setter
    public void setNama(String nama) {
        this.nama = nama;

    }
    public void setLevel(int level) {
        this.level = level;

    }
    public void setdefense(double defense) {
        this.defense = defense;

    }

}
