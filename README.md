Berikut README yang cocok untuk proyek Mini Game RPG Sederhana yang sedang kamu buat.

# Mini Game RPG Sederhana (Java)
## Deskripsi
Mini Game RPG Sederhana adalah proyek pembelajaran Object-Oriented Programming (OOP) menggunakan bahasa Java.
Pada proyek ini terdapat beberapa objek utama:
- Player
- Weapon
- Armor
Setiap player dapat menggunakan senjata dan armor yang berbeda serta melakukan serangan terhadap player lain.
---
## Fitur
✅ Membuat karakter player
✅ Membuat senjata (Weapon)
✅ Membuat armor (Armor)
✅ Menampilkan statistik player
✅ Sistem serangan antar player
✅ Sistem pertahanan berdasarkan nilai defense armor
---
## Struktur Project

src/
└── com/
└── game/
├── Main.java
├── Player.java
├── Weapon.java
└── Armor.java

---
## Class Diagram Sederhana

Player
│
├── nama
├── level
├── health
├── Weapon senjata
└── Armor armor

Weapon
│
├── nama
├── level
└── damage

Armor
│
├── nama
├── level
└── defense

---
## Cara Menjalankan Program
### Compile
```bash
javac -d bin src/com/game/*.java

Run

java -cp bin com.game.Main

⸻

Contoh Data

Player

Nama	Level	Health
Gian Danovan	1	100
Steve	5	100
Nicholas	10	100

Weapon

Nama	Damage
Diamond Sword	75
Panah	50
Ketapel	10
Kerikil	5

Armor

Nama	Defense
Diamond Helmet	50
Baju Kulit	25
Baju Besi	40
Baju Emas	45

⸻

Contoh Output

====================
* STATISTIK PLAYER *
====================
Username : Gian Danovan
Level : 1
Health : 100.0 hp
Nama Senjata : Diamond Sword
Level Senjata : 2
Damage Senjata : 75.0
Nama Armor : Diamond Helmet
Level Armor : 2
Defense Armor : 50.0
====================
PERTEMPURAN DI MULAI!!
Gian Danovan Menyerang Steve sebesar 75.0
Steve menerima serangan sebesar 25.0

⸻

Konsep OOP yang Digunakan

Class

* Player
* Weapon
* Armor

Object

Player player1 = new Player("Gian Danovan",1,100);

Constructor

Player(String nama, int level, double health)

Method

void Serangan(Player musuh)
void ShowPlayer()

Composition (Has-A Relationship)

Player memiliki Weapon
Player memiliki Armor
Weapon senjata;
Armor armor;

⸻

Pengembangan Selanjutnya

Beberapa fitur yang dapat ditambahkan:

* Sistem HP berkurang saat terkena serangan
* Critical Damage
* Level mempengaruhi damage
* Healing Potion
* Inventory
* Monster / Enemy
* Sistem EXP
* Naik Level
* Battle Loop hingga salah satu player kalah

⸻

Author

Gian Danovan

Mahasiswa Informatika - Institut Teknologi Del
