package SimpleWarGame;

public class Armor {
    public double defencePower;
    // Mendefinisikan atribut dalam class Armor
    protected double defensePower;
    String name;

    // Konstruktor class Armor, mengambil parameter name dan defensePower
    Armor(String name, double defensePower) {
        this.name = name;
        this.defensePower = defensePower;
    }

    // Membuat method untuk menampilkan detail armor ke konsol
    void display() {
        System.out.println("Armor: " + this.name + ", defence power: " + this.defensePower);
    }
}
