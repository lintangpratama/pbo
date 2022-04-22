package Abstract;

import java.util.Scanner;

public class PermainanStrategy extends Permainan {
    PermainanStrategy(String namaPemain, int levelPemain) {
        setNamaPemain(namaPemain);
        setLevelPemain(levelPemain);
    }

    public int getLevelPemain() {
        return this.levelPemain;
    }

    public void setLevelPemain(int levelPemain) {
        this.levelPemain = levelPemain;
    }

    public String getNamaPemain() {
        return this.namaPemain;
    }

    public void setNamaPemain(String namaPemain) {
        this.namaPemain = namaPemain;
    }

    public void jalankan() {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Input your name: ");
        String name = input.nextLine();

        System.out.print("Input your level: ");
        int level = input.nextInt();
        String levelString;

        if (level > 0) {
            levelString = "Normal";
        } else if (level > 20) {
            levelString = "Medium";
        } else if (level > 80 && level <= 100) {
            levelString = "Hard";
        } else {
            levelString = "Level not found";
        }

        System.out.print("Hit: ");
        int hit = input.nextInt();

        System.out.print("Miss: ");
        int miss = input.nextInt();

        PermainanArcade player1 = new PermainanArcade(name, level);
        System.out.println("Nama pemain: " + player1.getNamaPemain());
        System.out.println("Level pemain: " + levelString);
        System.out.println("Skor: " + player1.hitungSkor(hit, miss));
    }

    public int hitungSkor(int hit, int miss) {
        return (hit * 3) - miss;
    }
}
