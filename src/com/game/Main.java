package com.game;

public class Main {

    public static void main(String[] args) {

        // object pemain
        Player Player1 = new Player("Gian Danovan", 1, 100);
        Player Player2 = new Player("Steve", 5, 100);
        Player Player3 = new Player("Nicholas", 10, 100);
        Player Player4 = new Player ("alex", 3, 100);
        // object senjata
        Weapon DiamondSword = new Weapon("Diamond Sword", 2, 75);
        Weapon Panah = new Weapon("Panah", 2, 50);
        Weapon Kerikil = new Weapon("Kerikil", 1, 5);
        Weapon Ketapel = new Weapon("Ketapel", 3, 10);
        // obect Armor
        Armor DiamondHelmet = new Armor("Diamond Helmet", 2, 50);
        Armor BajuKulit = new Armor("Baju Kulit", 2, 25);
        Armor BajuBesi = new Armor("Baju Besi", 2, 40);
        Armor BaJuEmas = new Armor("Baju Emas", 2, 45);

        // Player1 Atribut pakai
        Player1.pakaiSenjata(DiamondSword);
        Player1.pakaiArmor(DiamondHelmet);
        // Player2 Atribut pakai
        Player2.pakaiSenjata(Ketapel);
        Player2.pakaiArmor(BajuKulit);
        // Player3 Atribut pakai
        Player3.pakaiSenjata(Kerikil);
        Player3.pakaiArmor(BaJuEmas);
        //Player4 Atribut pakai
        Player4.pakaiSenjata(Panah);
        Player4.pakaiArmor(BajuBesi);
        
    
        // memenggil method yang menampilkan data
        Player1.ShowPlayer();
        System.out.println("\n");
        Player2.ShowPlayer();

        // fitur bertempur
        System.out.println("\nPERTEMPURAN DI MULAI!! \n");



        while (Player1.health > 0 && Player2.health > 0) {
            Player1.Serangan(Player2);
            if (Player2.health <= 0){
                System.out.println("PEMENANGNYA ADALAH PLAYER 1!!");
            
            }
            Player2.Serangan(Player1);
            if (Player1.health <= 0){
                System.out.println("PEMENANGNYA ADALAH PLAYER 2!!");
            }

            
        }
       
        // System.out.println("SELANJUTNYA AKAN MENAMBAH FITUR SALING SERANG");
        // System.out.println("AKAN ADA PENYESUAIAN NILAI SERANGAN DAN DFENSE");
        // System.out.println("OKE DONE SELANJUTNYA AKAN SAYA TAMBAHKAN FITUR UNTUK MELAKUKAN PERANG TERUS MENERUS SAMPAI HP SALAH SATU PLAYER HABIS");

    }
}
