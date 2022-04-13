package MidTest;

public class PegawaiTetap extends Pegawai {
    protected int tunjangan = 500000;

    public PegawaiTetap(int noPeg, String nama, short kehadiran, int gajiPokok) {
        super(noPeg, nama, kehadiran, gajiPokok);
    }

    public int hitungGaji() {
        return this.uangMakan + this.gajiPokok + this.tunjangan;
    }

    public String getPegawaiTetap() {
        return  "Nomor Pegawai: " + this.noPeg + "\n" +
                "Nama Pegawai: " + this.nama + "\n" +
                "Status Pegawai: Tetap\n" +
                "Kehadiran: " + this.kehadiran + "\n" +
                "Gaji: " + this.hitungGaji() + "\n";
    }
}
