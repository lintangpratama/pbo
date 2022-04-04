package Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CDFilm extends CD {
    List<String> entriFilm = new ArrayList<>();
    String pemain;
    String sutradara;
    String kategori;
    enum kategoriEnum {
        SU,
        D,
        R,
        A,
    }

    public CDFilm(String judul, String pemain, String sutradara, String produser, int stok, String kategori) {
        super(judul, produser, stok);
        this.sutradara = sutradara;
        this.pemain = pemain;
        this.kategori = kategori;
    }

    public static String setKategori(int option) {
        kategoriEnum result = null;
        switch (option) {
            case 0 -> result = kategoriEnum.SU;
            case 1 -> result = kategoriEnum.D;
            case 2 -> result = kategoriEnum.R;
            case 3 -> result = kategoriEnum.A;
        }
        assert result != null;
        return result.toString();
    }

    public static CDFilm initFilm() {
        Scanner input = new Scanner(System.in);

        // User inputting the data
        System.out.print("\nMasukkan judul film: ");
        String judul = input.nextLine();

        System.out.print("\nMasukkan pemain: ");
        String pemain = input.nextLine();

        System.out.print("\nMasukkan nama sutradara: ");
        String sutradara = input.nextLine();

        System.out.print("\nMasukkan nama produser: ");
        String produser = input.nextLine();

        System.out.print("\nMasukkan stok film: ");
        int stok = input.nextInt();

        System.out.print("\n0. Semua Umur\n1. Dewasa\n2. Remaja\n3. Anak-anak \nMasukkan kategori album: ");
        int ctg = input.nextInt();
        String kategori = setKategori(ctg);

        return new CDFilm(judul, pemain, sutradara, produser, stok, kategori);
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

        CDFilm cd = new CDFilm("Album", "pemain", "Lagu", "sutradara", 12, "Kategori");

        showMenu();
        System.out.print("Masukkan pilihan: ");
        int option = input.nextInt();

        while (option != 0) {
            if (option == 1) {
                CDFilm init = initFilm();
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
