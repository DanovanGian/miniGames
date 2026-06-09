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

    void ShowPlayer(){
        System.out.println("====================");
        System.out.println("* STATISTIK PLAYER *");
        System.out.println("====================");
        System.out.println("Usermane : " + this.nama);
        System.out.println("Level    : " + this.level);
        System.out.println("Health    : " + this.helath + " hp");
        System.out.println("\n");
        this.senjata.ShowWeapon();
        System.out.println("\n");
        this.arrmor.ShowArrmor();
        System.out.println("====================");

    }
}
//class untuk senjata 
class Weapon {
    String nama;
    int level;
    double power;

    Weapon (String nama, int level, double power){
        this.nama = nama;
        this.level = level;
        this.power = power;

    }
    //method untuk menampilkan data senjata 
    void ShowWeapon(){
        System.out.println("Nama Senjata  : " + this.nama);
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
    //method untuk menampilkan data arrmor 
    void ShowArrmor(){
        System.out.println("Nama Arrmor     : " + this.nama);
        System.out.println("Level Arrmor    : " + this.level);
        System.out.println("Defense Arrmor  : " + this.defense);
    }
}

public class Main {

    public static void main(String[] args) {

        //object pemain 
        Player Player1 = new Player("Gian Danovan", 1, 98);
        Player Player2 = new Player("Steve", 5,100);
        Player Player3 = new Player("Nicholas", 10,50);



        //object senjata 
        Weapon DiamondSword = new Weapon ("Diamond Sword", 2, 250);
        Weapon Panah = new Weapon ("Panah", 2, 50);
        Weapon Kerikil = new Weapon ("Kerikil", 1, 10);
        Weapon Ketapel = new Weapon ("Ketapel", 3, 25);
        //obect Arrmor 
        Arrmor DiamondHelmet = new Arrmor("Diamond Helmet", 2, 200);
        Arrmor BajuKulit = new Arrmor("Baju Kulit", 2, 50);
        Arrmor BajuBesi = new Arrmor("Baju Besi", 2, 100);
        Arrmor BaJuEmas = new Arrmor("Baju Emas", 2, 150);
       

        //Player1 Atribut pakai
        Player1.pakaiSenjata(DiamondSword);
        Player1.pakaiArrmor(DiamondHelmet);

        //Player2 Atribut pakai
        Player1.pakaiSenjata(Ketapel);
        Player1.pakaiArrmor(DiamondHelmet);

        //Player2 Atribut pakai
        Player1.pakaiSenjata(Kerikil);
        Player1.pakaiArrmor(BajuKulit);

        //memenggil method yang menampilkan data 
        Player1.ShowPlayer();
        System.out.println("\n");

        Player2.ShowPlayer();
        System.out.println("\n");

        Player3.ShowPlayer();
        System.out.println("\n");

    }
}


