package com.game;

public class Weapon {
    private String nama;
    private int level;
    private double damage;

    Weapon(String nama, int level, double power) {
        this.nama = nama;
        this.level = level;
        this.damage = power;

    }

    // method untuk menampilkan data senjata
    public void ShowWeapon() {
        System.out.println("Nama Senjata  : " + this.nama);
        System.out.println("Level Senjata : " + this.level);
        System.out.println("Damage Senjata : " + this.damage);

    }

    //getter 
    public String getNama(){ return nama; }
    public int getLevel (){ return level; }
    public double getDamage(){return damage;}
    //setter 
    public void setNama (String nama){
        this.nama = nama;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setDamage(double damage){
        this.damage = damage;
    }
    
}
