package com.game;

public class Weapon {
    private String nama;
    private int level;
    private double Damage;

    Weapon(String nama, int level, double power) {
        this.nama = nama;
        this.level = level;
        this.Damage = power;

    }

    // method untuk menampilkan data senjata
    public void ShowWeapon() {
        System.out.println("Nama Senjata  : " + this.nama);
        System.out.println("Level Senjata : " + this.level);
        System.out.println("Damage Senjata : " + this.Damage);

    }
}
