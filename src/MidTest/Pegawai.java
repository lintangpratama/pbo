package MidTest;

import java.util.ArrayList;
import java.util.List;

public class Pegawai {
    //Membuat beberapa atribut yang dimiliki oleh pegawai, baik pegawai kontrak atau pegawai tetap
    protected int noPeg;
    protected String nama;
    protected short kehadiran;
    protected int uangMakan;
    protected int gajiPokok;
    // List suatu String yang berisi data-data setiap pegawai yang nanti akan ditampilkan ke pegguna
    protected List<String> listPegawai = new ArrayList<>();

    // Konstruktor kelas Pegawai, mengambil 4 data sebagai parameter
    public Pegawai(int noPeg, String nama, short kehadiran, int gajiPokok) {
        this.noPeg = noPeg;
        this.nama = nama;
        this.kehadiran = kehadiran;
        // Seperti ketentuan pada soal, uang makan dihitung dengan Rp25.000 dikali jumlah kehadiran
        this.uangMakan = 25000 * this.kehadiran;
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan data pada list pegawai
    public void lihatData() {
        // Mencoba melakukan foreach pada data tiap index dari array-nya, kemudian melakukan printout tiap indexnya
        try {
            for (String pegawai : listPegawai) {
                System.out.println(pegawai);
            }
        // Jika terjadi error list kosong atau null, lakukan printout data kosong
        } catch (NullPointerException err) {
            System.out.println("Data masih kosong\n");
        }
    }
}
