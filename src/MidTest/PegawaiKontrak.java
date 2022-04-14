package MidTest;

public class PegawaiKontrak extends Pegawai {
    // Melakukan inisialisasi atribut masaKontrak yang nantinya akan diinputkan oleh user
    protected short masaKontrak;

    // Konstruktor kelas PegawaiTetap yang juga mem-passing data parameter ke induknya yaitu Pegawai
    public PegawaiKontrak(int noPeg, String nama, short kehadiran, int gajiPokok, short masaKontrak) {
        super(noPeg, nama, kehadiran, gajiPokok);
        this.masaKontrak = masaKontrak;
    }

    // Method untuk menghitung gaji pegawai kontrak sesuai ketentuan
    public int hitungGaji() {
        return this.uangMakan + this.gajiPokok;
    }

    // Method untuk mendapatkan data pegawai kontrak
    public String getPegawaiKontrak() {
        return "Nomor Pegawai: " + this.noPeg + "\n" +
                "Nama Pegawai: " + this.nama + "\n" +
                "Status Pegawai: Kontrak\n" +
                "Kehadiran: " + this.kehadiran + "\n" +
                "Gaji: " + this.hitungGaji() + "\n";
    }
}
