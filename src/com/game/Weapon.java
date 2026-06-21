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
    public String getnamaWeapon(){ return nama; }
    public int getlevelWeapon (){ return level; }
    public double getdamageWeapon(){return damage;}
    //setter 
    public void setnamaWeapon (String nama){
        this.nama = nama;
    }
    public void setlevelWeapon (int level){
        this.level = level;
    }
    public void setdamageWeapon (double damage){
        this.damage = damage;
    }
    
}
