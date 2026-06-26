package com.game;

public class Player {
    private String nama;
    private int level;
    private double health;

    Weapon senjata;
    Armor armor;

    public Player(String nama, int level, double health) {
        this.nama = nama;
        this.level = level;
        this.health = health;
    }

    // getter
    public String getnamaPlayer() {
        return nama;
    }

    public int getlevelPlayer() {
        return level;
    }

    public double gethealthPlayer() {
        return health;
    }

    // setter
    public void setnamaPlayer(String nama) {
        this.nama = nama;
    }

    public void setlevelPlayer(int level) {
        this.level = level;
    }

    public void sethealthPlayer(double health) {
        this.health = health;
    }
    //method untuk equip senjata kepada player 
    void pakaiSenjata(Weapon senjata) {
        this.senjata = senjata;
    }
    //method untuk equip armor kepada player 
    void pakaiArmor(Armor armor) {
        this.armor = armor;
    }

    void defance(double attackPower) {

        double sisaDamage = attackPower;

        // jika armor masih ada
        if (armor.getdefenseArmor() > 0) {
            // ini ketika attack powernya lbih besar dibandingkan armornya powernya maka
            // arrmor langsung pecah dan habis
            if (sisaDamage >= this.armor.getdefenseArmor()) {
                sisaDamage = sisaDamage - this.armor.getdefenseArmor();
                System.out.println(this.nama + " Kehilangan Armor Sebesar " + this.armor.getdefenseArmor());

                armor.setdefenseArmor(0);

            } else {
                // katika armor masih bisa menahan total damage dan damage habis di kurangi oleh
                // total defense
                this.armor.setdefenseArmor(this.armor.getdefenseArmor() - sisaDamage);
                System.out.println("Armor " + this.nama + " Kehilangan Defense Sebesar " + sisaDamage);
                System.out.println("Sisa Defnse Armor : " );

                sisaDamage = 0;

            }
        }
        // jika armor tidak ada maka damage akan langsung masuk ke health lawan
        if (sisaDamage > 0) {
            this.health = this.health - sisaDamage;
            System.out.println(this.nama + " Menerima Damage Langsung Sebesar " + sisaDamage);

            sisaDamage = 0;

        }

        System.out.println("Sisa Armor " + this.armor.getdefenseArmor());
        System.out.println("Sisa HP " + this.nama + " : " + this.health);
        System.out.println("\n");

    }

    void Serangan(Player musuh) {

        System.out.println(
                getnamaPlayer() + " Menyerang " + musuh.getnamaPlayer() + " sebesar " + senjata.getdamageWeapon());
        musuh.defance(this.senjata.getdamageWeapon());

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

    public static void pertempuran(Player PemainA, Player PemainB) {
        while (PemainA.gethealthPlayer() > 0 && PemainB.gethealthPlayer() > 0) {
            PemainA.Serangan(PemainB);
            PemainB.ShowPlayer();
            if (PemainB.gethealthPlayer() <= 0) {
                System.out.println("PEMENANGNYA ADALAH "+ PemainA.getnamaPlayer());
                break;

            }
            PemainB.Serangan(PemainA);
            PemainA.ShowPlayer();
            if (PemainA.gethealthPlayer() <= 0) {
                System.out.println("PEMENANGNYA ADALAH " + PemainB.getnamaPlayer());
                break;
            }

        }
    }
}
