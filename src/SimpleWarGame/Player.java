package SimpleWarGame;

// Membuat class Player
public class Player {
    // Memberikan atribut pada kelas Player
    String name;
    double health;
    int level;
    Weapon weapon;
    Armor armor;

    // Konstruktor class Player, mengambil parameter name dan health
    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    // Membuat method attack
    // Mengambil data attack dari atribut attackPower pada object class Weapon yang direferensikan oleh atribut weapon class Player dan menampilkannya
    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        // Menampilkan data attack ke konsol
        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        // Opponent memanggil method defense
        opponent.defense(attackPower);
    }

    // Membuat method defense dan mengambil parameter berupa attackPower dari lawannya
    void defense(double attackPower) {
        // Mendefinisikan variabel damage
        double damage;

        // Melakukan pengecekan, apabila defense lebih kecil dari attack, maka data damage berupa data attack weapon dikurangi data defense armor
        if (this.armor.defencePower < attackPower) {
            damage = attackPower - this.armor.defencePower;
        // Jika defense lebih besar dari attack, maka damagenya akan bernilai 0
        } else {
            damage = 0;
        }

        // Atribut health player dikurangi dengan damager yang diterima
        this.health -= damage;
        // Menampilkan data damage ke konsol
        System.out.println(this.name + " gets damage " + damage);
    }

    // Membuat method untuk menginisialisasi atribut weapon dengan object class Weapon
    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Membuat method untuk menginisialisasi atribut armor dengan object class Armor
    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    // Membuat method display untuk menampilkan nama player, health player, weapon details, dan armor details ke konsol
    void display() {
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health + " HP");
        this.weapon.display();
        this.armor.display();
    }
}
