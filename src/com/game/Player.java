package com.game;

public class Player {
    String nama;
    int level;
    double health;

    Weapon senjata;
    Armor armor;

    Player(String nama, int level, double health) {
        this.nama = nama;
        this.level = level;
        this.health = health;
    }

    void pakaiSenjata(Weapon senjata) {
        this.senjata = senjata;
    }

    void pakaiArmor(Armor armor) {
        this.armor = armor;
    }

    void Serangan(Player musuh) {

        System.out.println(this.nama + " Menyerang " + musuh.nama + " sebesar " + this.senjata.Damage );
        System.out.println("\n");
        musuh.defance(this.senjata.Damage);

    }

    void defance(double attackPower) {
        /*sya mau jika damage   yang di berikan itu lebih besar dari
        armor milik si lawan maka health akan di kurangi dengan damage yang di terima 
         */
        double damage;

        if (attackPower > this.armor.defense) {
            damage = attackPower - health;
        } else {
            damage = 0;
        }
        System.out.println(this.nama + " menerima serangan sebesar " + damage);
        System.out.println("sisa HP " + this.nama + " " + health);

    }

    void ShowPlayer() {
        System.out.println("====================");
        System.out.println("* STATISTIK PLAYER *");
        System.out.println("====================");
        System.out.println("Usermane : " + this.nama);
        System.out.println("Level    : " + this.level);
        System.out.println("Health    : " + this.health + " hp");
        System.out.println("\n");
        this.senjata.ShowWeapon();
        System.out.println("\n");
        this.armor.ShowArmor();
        System.out.println("====================");

    }
}
