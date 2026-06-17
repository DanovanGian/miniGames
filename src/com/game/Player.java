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

        System.out.println(this.nama + " Menyerang " + musuh.nama + " sebesar " + this.senjata.Damage);
        musuh.defance(this.senjata.Damage);

    }

    void defance(double attackPower) {

        double sisaDamage = attackPower;

        // jika armor masih ada
        if (this.armor.defense > 0) {
            // ini ketika attack powernya lbih besar dibandingkan armornya powernya maka
            // arrmor langsung pecah dan habis
            if (sisaDamage >= this.armor.defense) {
                sisaDamage = sisaDamage - this.armor.defense;
                System.out.println(this.nama + " Kehilangan Armor Sebesar " + this.armor.defense);

                this.armor.defense = 0;

            } else {
                // katika armor masih bisa menahan total damage dan damage habis di kurangi oleh
                // total defense
                this.armor.defense = this.armor.defense - sisaDamage;
                System.out.println(this.nama + " Armor Kehilangan Defense Sebesar " + sisaDamage);

                sisaDamage = 0;

            }
        }
        // jika armor tidak ada maka damage akan langsung masuk ke health lawan
        if (sisaDamage > 0) {
            this.health = this.health - sisaDamage;
            System.out.println(this.nama + " Menerima Damage Langsung Sebesar " + sisaDamage);

            sisaDamage = 0;
        

        }

        System.out.println("Sisa Armor " + this.armor.defense);
        System.out.println("Sisa HP " + this.nama + " : " + this.health);
        System.out.println("\n");

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
