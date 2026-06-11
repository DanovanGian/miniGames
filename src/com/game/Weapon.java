package com.game;

public class Weapon {
    String nama;
    int level;
    double Damage;

    Weapon(String nama, int level, double power) {
        this.nama = nama;
        this.level = level;
        this.Damage = power;

    }

    // method untuk menampilkan data senjata
    void ShowWeapon() {
        System.out.println("Nama Senjata  : " + this.nama);
        System.out.println("Level Senjata : " + this.level);
        System.out.println("Damage Senjata : " + this.Damage);

    }
}
