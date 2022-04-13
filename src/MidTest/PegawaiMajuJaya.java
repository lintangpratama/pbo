package MidTest;

import java.util.Scanner;

public class PegawaiMajuJaya {
    public static void showMenu() {
        System.out.println("--- Pegawai Maju Jaya ---");
        System.out.println("1. Input Data Pegawai");
        System.out.println("2. Lihat Data Pegawai");
        System.out.println("0. Keluar\n");
    }

    public static void showEmployeeOption() {
        System.out.println("1. Input Data Pegawai Kontrak");
        System.out.println("2. Input Data Pegawai Tetap\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short kehadiran = 123;
        Pegawai pegawaiRoot = new Pegawai(111, "Hamdan", kehadiran, 111111);

        showMenu();
        System.out.print("Masukkan pilihan: ");
        int option = input.nextInt();

        while (option != 0) {
            if (option == 1) {
                showEmployeeOption();
                System.out.print("Masukkan pilihan: ");
                int optionEmployee = input.nextInt();
                if (optionEmployee == 1) {
                    System.out.print("Masukkan nomor pegawai: ");
                    int noPeg = input.nextInt();
                    System.out.print("Masukkan nama pegawai: ");
                    String nama = input.next();
                    System.out.print("Masukkan kehadiran pegawai: ");
                    short kehadiranPegawai = input.nextShort();
                    System.out.print("Masukkan gaji pokok pegawai: ");
                    int gajiPokok = input.nextInt();
                    System.out.print("Masukkan masa kontrak pegawai: ");
                    short masaKontrak = input.nextShort();

                    PegawaiKontrak pegawai = new PegawaiKontrak(noPeg, nama, kehadiranPegawai, gajiPokok, masaKontrak);
                    pegawaiRoot.listPegawai.add(pegawai.getPegawaiKontrak());
                } else if (optionEmployee == 2) {
                    System.out.print("Masukkan nomor pegawai: ");
                    int noPeg = input.nextInt();
                    System.out.print("Masukkan nama pegawai: ");
                    String nama = input.next();
                    System.out.print("Masukkan kehadiran pegawai: ");
                    short kehadiranPegawai = input.nextShort();
                    System.out.print("Masukkan gaji pokok pegawai: ");
                    int gajiPokok = input.nextInt();

                    PegawaiTetap pegawai = new PegawaiTetap(noPeg, nama, kehadiranPegawai, gajiPokok);
                    pegawaiRoot.listPegawai.add(pegawai.getPegawaiTetap());
                } else {
                    System.exit(0);
                }
            } else if (option == 2) {
                pegawaiRoot.lihatData();
            }
            showMenu();
            System.out.print("Masukkan pilihan: ");
            option = input.nextInt();
        }
        System.exit(0);

    }
}
