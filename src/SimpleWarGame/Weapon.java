package SimpleWarGame;

public class Weapon {
    // Mendefinisikan atribut dalam class Weapon
    double attackPower;
    String name;

    // Konstruktor class Weapon, mengambil parameter name dan attackPower
    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    // Membuat method untuk menampilkan detail weapon ke konsol
    void display() {
        System.out.println("Weapon: " + this.name + ", attack power: " + this.attackPower);
    }
}
