package Interface;

import java.util.Objects;
import java.util.Scanner;

public class TesLogin {
    public static void menuUtama() {
        System.out.println("MENU UTAMA");
        System.out.println("----------------");
        System.out.println("Menu Pilihan: ");
        System.out.println("    A. LOGIN");
        System.out.println("    B. EXIT");
        System.out.println("----------------");
        System.out.print("Pilihan Anda: ");
    }

    public static void menuPilihan(String username) {
        System.out.println("SELAMAT DATANG, " + username);
        System.out.println("================");
        System.out.println("MENU PILIHAN");
        System.out.println("----------------");
        System.out.println("1. Tes Komputer");
        System.out.println("2. LOG OFF");
        System.out.println("----------------");
        System.out.print("Pilihan Anda: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataLogin auth = new DataLogin();

        menuUtama();
        String pilihanMenuUtama = input.nextLine();

        while (!Objects.equals(pilihanMenuUtama, "B".toLowerCase())) {
            if (Objects.equals(pilihanMenuUtama, "A".toLowerCase())) {
                System.out.print("Masukkan username: ");
                String username = input.nextLine();
                System.out.print("Masukkan password: ");
                String password = input.nextLine();
                if (auth.cekData(username, password) && auth.validasi(username, password)) {
                    menuPilihan(username);
                    String opsiMenuPilihan = input.nextLine();
                    while (!Objects.equals(opsiMenuPilihan, "2")) {
                        if (Objects.equals(opsiMenuPilihan, "1")) {
                            Cetak.cetak();
                            menuPilihan(username);
                            opsiMenuPilihan = input.nextLine();
                        } else {
                            menuPilihan(username);
                            opsiMenuPilihan = input.nextLine();
                        }
                    }
                    menuUtama();
                    pilihanMenuUtama = input.nextLine();
                } else {
                    menuUtama();
                    pilihanMenuUtama = input.nextLine();
                }
            } else {
                menuUtama();
                pilihanMenuUtama = input.nextLine();
            }
        }
        System.exit(1);
    }
}
