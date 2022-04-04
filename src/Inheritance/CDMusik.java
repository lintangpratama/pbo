package Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CDMusik extends CD {
    List<String> entriFilm = new ArrayList<>();
    String penyanyi;
    String publisher;
    String kategori;
    String hits;
    enum kategoriEnum {
        C,
        J,
        P,
        R,
        O
    }

    public CDMusik(String judul, String penyanyi, String hits, String publisher, String produser, int stok, String kategori) {
        super(judul, produser, stok);
        this.publisher = publisher;
        this.penyanyi = penyanyi;
        this.kategori = kategori;
        this.hits = hits;
    }

    public static String setKategori(int option) {
        kategoriEnum result = null;
        switch (option) {
            case 0 -> result = kategoriEnum.C;
            case 1 -> result = kategoriEnum.J;
            case 2 -> result = kategoriEnum.P;
            case 3 -> result = kategoriEnum.R;
            case 4 -> result = kategoriEnum.O;
        }
        assert result != null;
        return result.toString();
    }

    public static CDMusik initMusik() {
        Scanner input = new Scanner(System.in);

        // User inputting the data
        System.out.print("\nMasukkan judul album: ");
        String judul = input.nextLine();

        System.out.print("\nMasukkan penyanyi: ");
        String penyanyi = input.nextLine();

        System.out.print("\nMasukkan nama publisher: ");
        String publisher = input.nextLine();

        System.out.print("\nMasukkan nama produser: ");
        String produser = input.nextLine();

        System.out.print("\nMasukkan lagu hits dalam album: ");
        String hits = input.nextLine();

        System.out.print("\nMasukkan stok album: ");
        int stok = input.nextInt();

        System.out.print("\n0. Classic\n1. Jazz\n2. Pop\n3. Rock\n4. Other \nMasukkan kategori album: ");
        int ctg = input.nextInt();
        String kategori = setKategori(ctg);

        return new CDMusik(judul, penyanyi, publisher, produser, hits, stok, kategori);
    }

    public static void showMenu() {
        System.out.println("********************");
        System.out.println("***** CD Musik *****");
        System.out.println("********************\n");

        System.out.println("--------Menu-------- ");
        System.out.println("1. Masukkan data musik");
        System.out.println("2. Lihat data musik");
        System.out.println("0. Keluar");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CDMusik cd = new CDMusik("Album", "Penyanyi", "Lagu", "Publisher", "Produser", 12, "Kategori");

        showMenu();
        System.out.print("Masukkan pilihan: ");
        int option = input.nextInt();

        while (option != 0) {
            if (option == 1) {
                CDMusik init = initMusik();
                cd.entriFilm.add(init.judul);
            } else if (option == 2) {
                cd.entriFilm.forEach((judul) -> System.out.println("- " + judul));
            }

            showMenu();
            System.out.print("Masukkan pilihan: ");
            option = input.nextInt();
        }

        System.exit(1);
    }
}
