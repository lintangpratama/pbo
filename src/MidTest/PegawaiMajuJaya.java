package MidTest;

import java.util.Scanner;

public class PegawaiMajuJaya {
    // Method untuk menampilkan menu
    public static void showMenu() {
        System.out.println("--- Pegawai Maju Jaya ---");
        System.out.println("1. Input Data Pegawai");
        System.out.println("2. Lihat Data Pegawai");
        System.out.println("0. Keluar\n");
    }

    // Method untuk menampilkan menu input data pegawai
    public static void showEmployeeOption() {
        System.out.println("1. Input Data Pegawai Kontrak");
        System.out.println("2. Input Data Pegawai Tetap\n");
    }

    // Method utama tempat program dijalankan
    public static void main(String[] args) {
        // Melakukan inisialisasi objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Data dummy untuk membuat objek Pegawai
        short kehadiran = 123;
        Pegawai pegawaiRoot = new Pegawai(111, "Hamdan", kehadiran, 111111);

        // Menampilkan menu dan input opsi yang dipilih pengguna
        showMenu();
        System.out.print("Masukkan pilihan: ");
        int option = input.nextInt();

        // Selama opsi bukan sama dengan 0, program di bawah akan selalu berjalan
        while (option != 0) {
            // Pilihan input pegawai
            if (option == 1) {
                showEmployeeOption();
                System.out.print("Masukkan pilihan: ");
                int optionEmployee = input.nextInt();
                // Pilihan input pegawai kontrak
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

                    // Melakukan pembuatan objek PegawaiKontrak menggunakan data yang diinput user
                    PegawaiKontrak pegawai = new PegawaiKontrak(noPeg, nama, kehadiranPegawai, gajiPokok, masaKontrak);
                    // Meng-insert-kan data pegawai kontrak ke list data pegawai
                    pegawaiRoot.listPegawai.add(pegawai.getPegawaiKontrak());

                    // Pilihan input pegawai tetap
                } else if (optionEmployee == 2) {
                    System.out.print("Masukkan nomor pegawai: ");
                    int noPeg = input.nextInt();
                    System.out.print("Masukkan nama pegawai: ");
                    String nama = input.next();
                    System.out.print("Masukkan kehadiran pegawai: ");
                    short kehadiranPegawai = input.nextShort();
                    System.out.print("Masukkan gaji pokok pegawai: ");
                    int gajiPokok = input.nextInt();

                    // Melakukan pembuatan objek PegawaiTetap menggunakan data yang diinput user
                    PegawaiTetap pegawai = new PegawaiTetap(noPeg, nama, kehadiranPegawai, gajiPokok);
                    // Meng-insert-kan data pegawai tetap ke list data pegawai
                    pegawaiRoot.listPegawai.add(pegawai.getPegawaiTetap());
                } else {
                    System.exit(0);
                }
            // Pilihan untuk menampilkan list data semua pegawai
            } else if (option == 2) {
                pegawaiRoot.lihatData();
            }
            // Jika pilihan yang dipilih bukan 1, 2, atau 0, program akan terus meminta input pilihan
            showMenu();
            System.out.print("Masukkan pilihan: ");
            option = input.nextInt();
        }
//        Jika opsi sama dengan 0 maka program akan berhenti
        System.exit(0);

    }
}
