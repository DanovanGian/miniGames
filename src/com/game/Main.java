package com.game;

//class untuk player 
class Player {
    String nama;
    int level;
    double helath;

    Weapon senjata;
    Arrmor arrmor;

    Player (String nama, int level, double helath){
        this.nama = nama;
        this.level =level;
        this.helath = helath;
    }
    void pakaiSenjata(Weapon senjata){
        this.senjata = senjata;
    }
    void pakaiArrmor(Arrmor arrmor){
        this.arrmor = arrmor;
    }
}
//class untuk senjata 
class Weapon {
    String nama;
    int level;
    double power;

    Weapon (String nama, int level, double power){
        this.nama = nama;
        this. level = level;
        this.power = power;

    }

    void show(){
        System.out.println("Nama Senjata : " + this.nama);
        System.out.println("Level Senjata : " + this.level);
        System.out.println("Power Senjata : " + this.power);

    }
}
//class untuk arrmor
class Arrmor {
    String nama;
    int level;
    double defense;

    Arrmor (String nama, int level, double defense){
        this.nama = nama;
        this.level = level; 
        this.defense = defense;
    }
}

public class Main {

    public static void main(String[] args) {

        //object pemain 1
        Player Pemain1 = new Player("Gian Danovan", 15, 98);
        //obect Arrmor 1
        Arrmor Arrmor1 = new Arrmor("Diamond Helmet", 2, 200);
        //object senjata 1
        Weapon Senjata1 = new Weapon ("Diamond Sword", 2, 25);

        //pemain pakai senjata
        Pemain1.pakaiSenjata(Senjata1);

        Pemain1.senjata.show();

    }
}


