package MidTest;

public class PegawaiKontrak extends Pegawai {
    protected short masaKontrak;

    public PegawaiKontrak(int noPeg, String nama, short kehadiran, int gajiPokok, short masaKontrak) {
        super(noPeg, nama, kehadiran, gajiPokok);
        this.masaKontrak = masaKontrak;
    }

    public int hitungGaji() {
        return this.uangMakan + this.gajiPokok;
    }

    public String getPegawaiKontrak() {
        return "Nomor Pegawai: " + this.noPeg + "\n" +
                "Nama Pegawai: " + this.nama + "\n" +
                "Status Pegawai: Kontrak\n" +
                "Kehadiran: " + this.kehadiran + "\n" +
                "Gaji: " + this.hitungGaji() + "\n";
    }
}
