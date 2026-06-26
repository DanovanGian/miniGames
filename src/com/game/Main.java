package com.game;

public class Main {

    public static void main(String[] args) {

        // Player
        Player Player1 = new Player("Gian Danovan", 1, 120);
        Player Player2 = new Player("Steve", 5, 120);
        Player Player3 = new Player("Nicholas", 10, 120);
        Player Player4 = new Player("Alex", 3, 120);

        // Weapon
        Weapon DiamondSword = new Weapon("Diamond Sword", 2, 20);
        Weapon Panah = new Weapon("Panah", 2, 15);
        Weapon Kerikil = new Weapon("Kerikil", 1, 5);
        Weapon Ketapel = new Weapon("Ketapel", 3, 8);

        // Armor
        Armor DiamondHelmet = new Armor("Diamond Helmet", 2, 40);
        Armor BajuKulit = new Armor("Baju Kulit", 2, 20);
        Armor BajuBesi = new Armor("Baju Besi", 2, 35);
        Armor BajuEmas = new Armor("Baju Emas", 2, 30);

        // Player1 Atribut pakai
        Player1.pakaiSenjata(DiamondSword);
        Player1.pakaiArmor(DiamondHelmet);
        // Player2 Atribut pakai
        Player2.pakaiSenjata(Ketapel);
        Player2.pakaiArmor(BajuKulit);
        // Player3 Atribut pakai
        Player3.pakaiSenjata(Kerikil);
        Player3.pakaiArmor(BajuEmas);
        // Player4 Atribut pakai
        Player4.pakaiSenjata(Panah);
        Player4.pakaiArmor(BajuBesi);

        // memenggil method yang menampilkan data
        Player1.ShowPlayer();
        System.out.println("\n");
        Player2.ShowPlayer();

        // fitur bertempur
        System.out.println("\n===========================");
        System.out.println("**PERTEMPURAN DI MULAI!!** ");
        System.out.println("===========================\n");

        //Pertempuran di mulai 
        Player.pertempuran (Player1, Player2);
       



    }
}
