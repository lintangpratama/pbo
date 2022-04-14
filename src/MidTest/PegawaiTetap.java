package MidTest;

public class PegawaiTetap extends Pegawai {
    // Melakukan inisialisasi atribut tunjangan
    protected int tunjangan = 500000;

    // Konstruktor kelas PegawaiTetap yang juga mem-passing data parameter ke induknya yaitu Pegawai
    public PegawaiTetap(int noPeg, String nama, short kehadiran, int gajiPokok) {
        super(noPeg, nama, kehadiran, gajiPokok);
    }

    // Method untuk menghitung gaji pegawai tetap sesuai ketentuan
    public int hitungGaji() {
        return this.uangMakan + this.gajiPokok + this.tunjangan;
    }

    // Method untuk mendapatkan data pegawai tetap
    public String getPegawaiTetap() {
        return "Nomor Pegawai: " + this.noPeg + "\n" +
                "Nama Pegawai: " + this.nama + "\n" +
                "Status Pegawai: Tetap\n" +
                "Kehadiran: " + this.kehadiran + "\n" +
                "Gaji: " + this.hitungGaji() + "\n";
    }
}
