package com.game;


class Player {
    String nama;
    int level;
    double helath;

    Player (String nama, int level, double helath){
        this.nama = nama;
        this.level =level;
        this.helath = helath;
    }
}

class Weapon {
    String nama;
    int level;
    double power;

    Weapon (String nama, int level, double power){
        this.nama = nama;
        this. level = level;
        this.power = power;

    }
}

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
        Player Player1 = new Player("gian", 15, 98);
    }
}


