package com.game;

public class Main {

    public static void main(String[] args) {

        // object pemain
        Player Player1 = new Player("Gian Danovan", 1, 98);
        Player Player2 = new Player("Steve", 5, 100);
        Player Player3 = new Player("Nicholas", 10, 50);
        // object senjata
        Weapon DiamondSword = new Weapon("Diamond Sword", 2, 250);
        Weapon Panah = new Weapon("Panah", 2, 50);
        Weapon Kerikil = new Weapon("Kerikil", 1, 10);
        Weapon Ketapel = new Weapon("Ketapel", 3, 25);
        // obect Armor
        Armor DiamondHelmet = new Armor("Diamond Helmet", 2, 200);
        Armor BajuKulit = new Armor("Baju Kulit", 2, 50);
        Armor BajuBesi = new Armor("Baju Besi", 2, 100);
        Armor BaJuEmas = new Armor("Baju Emas", 2, 150);

        // Player1 Atribut pakai
        Player1.pakaiSenjata(DiamondSword);
        Player1.pakaiArmor(DiamondHelmet);
        // Player2 Atribut pakai
        Player2.pakaiSenjata(Ketapel);
        Player2.pakaiArmor(DiamondHelmet);
        // Player3 Atribut pakai
        Player3.pakaiSenjata(Kerikil);
        Player3.pakaiArmor(BajuKulit);

        // memenggil method yang menampilkan data
        Player1.ShowPlayer();
        System.out.println("\n");
        Player2.ShowPlayer();

        // fitur bertempur
        System.out.println("\nPERTEMPURAN DI MULAI!!");
        Player1.Serangan(Player2);

    

    }
}
