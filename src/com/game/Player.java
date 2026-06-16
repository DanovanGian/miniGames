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
        System.out.println("\n");
        musuh.defance(this.senjata.Damage);
        System.out.println("sisa HP " + musuh.nama + " " + this.health);

    }

    void defance(double attackPower) {
    
        double sisaDamage = attackPower;
        
        //jika armor masih ada 
        if (this.armor.defense > 0){
             
            if (sisaDamage >= this.armor.defense) {
                sisaDamage = this.armor.defense - sisaDamage;
                System.out.println("");

            // Damage lebih besar dari armor
            }
        }
        /*jika armor ada maka saerangan terlabih dahulu akan di terima oleh armor, 
        jika armor tidak ada maka serangan akan langsung diterima oleh health
        dan juga jika damage itu lebih besar dari pada armor yang ada maka damage yang di hasilkan akan di alokasikan ke armor lalu ke  health*/
        
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
