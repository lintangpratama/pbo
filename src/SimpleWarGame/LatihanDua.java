package SimpleWarGame;

public class LatihanDua {
    public static void main(String[] args) {
        // Menginisialisasi object player1 dari class Player dengan atribut "A" sebagai name dan 100 sebagai health
        Player player1 = new Player("A",100);
        // Menginisialisasi object player2 dari class Player dengan atribut "B" sebagai name dan 50 sebagai health
        Player player2 = new Player("B",50);

        // Menginisialisasi object sniper dari class Weapon dengan atribut "Sniper Rifle" sebagai name dan 15 sebagai attackPower
        Weapon sniper = new Weapon("Sniper Rifle",15);
        // Menginisialisasi object sniper dari class Weapon dengan atribut "Shotgun" sebagai name dan 7 sebagai attackPower
        Weapon shotGun = new Weapon("Shotgun",7);
        Armor rompiBaja = new Armor("Rompi Baja",10);
        Armor bajuBesi = new Armor("Baju Besi",5);

        // Memanggil method equiqWeapon dari player1 dengan parameter sniper (object dari class Weapon), object dari class Weapon kemudian menjadi atribut weapon dari class Player
        player1.equipWeapon(sniper);
        // Memanggil method equiqArmor dari player1 dengan parameter rompiBaja (object dari class Armor), object dari class Armor kemudian menjadi atribut armor dari class Player
        player1.equipArmor(rompiBaja);
        // Memanggil method display dari player1 untuk memberikan output berupa detail player seperti name, health, weapon, dan armor
        player1.display();

        // Memanggil method equiqWeapon dari player2 dengan parameter shotGun (object dari class Weapon), object dari class Weapon kemudian menjadi atribut weapon dari class Player
        player2.equipWeapon(shotGun);
        // Memanggil method equiqArmor dari player2 dengan parameter bajuBesi (object dari class Armor), object dari class Armor kemudian menjadi atribut armor dari class Player
        player2.equipArmor(bajuBesi);
        // Memanggil method display dari player2 untuk memberikan output berupa detail player seperti name, health, weapon, dan armor
        player2.display();
        System.out.println("\nPERTEMPURAAAN");
        System.out.println("\nEpisode - 1\n");

        // player1 melakukan attack kepada player2
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nEpisode - 2\n");

        // player2 melakukan attack kepada player1
        player2.attack(player1);
        player1.display();
        player2.display();
    }

    /*
    * - Flow Program -
    *
    * Pada awalnya, program membuat dua object Player, dua object Armor, dan dua object Weapon.
    * Tiap-tiap object memiliki atribut dan methodnya masing-masing sesuai kegunaannya
    * - Player memiliki atribut name, health, weapon, dan armor
    *   weapon didapat dari object class Weapon dan armor didapat dari object class Armor
    * - Weapon memiliki atribut name dan attackPower
    * - Armor memiliki atribut name dan defensePower
    *
    * Setelah itu, player1 dan player2 melakukan equip armor dan weapon dengan menggunakan method equipArmor dan equipWeapon
    * Argumen yang di-passing dari method itu adalah object weapon dan armor
    * Kemudian, object itu akan menjadi atribut weapon dan armor dari player1 dan player2
    *
    * Berlanjut ke proses pertempuran
    * player1 dan player2 sama-sama memiliki method attack dan defense
    * method attack harus dipanggil sedangkan method defense lawan dipanggil secara otomatis jika suatu player melakukan attack
    * Logika attack pada program di atas adalah:
    * - Jika attackPower weapon lebih besar daripada defensePower armor lawan, maka damagenya berupa hasil dari (attackPower - defensePower)
    * - Namun, jika tidak, maka damagenya adalah 0 karena attackPowernya tidak dapat "menembus" armor lawan
    *
    * Pada akhirnya, program mengeluarkan method display dari semua player
    * method ini berfungsi untuk menampikan data detail dari player, seperti:
    * - nama player
    * - health points player
    * - senjata player
    * - aror pplayer */
}
