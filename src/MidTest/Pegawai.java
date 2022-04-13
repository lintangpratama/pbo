package MidTest;

import java.util.ArrayList;
import java.util.List;

public class Pegawai {
    protected int noPeg;
    protected String nama;
    protected short kehadiran;
    protected int uangMakan;
    protected int gajiPokok;
    protected List<String> listPegawai = new ArrayList<>();

    public Pegawai(int noPeg, String nama, short kehadiran, int gajiPokok) {
        this.noPeg = noPeg;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.uangMakan = 25000 * this.kehadiran;
        this.gajiPokok = gajiPokok;
    }

    public void lihatData() {
        try {
            for (String pegawai: listPegawai) {
                System.out.println(pegawai);
            }
        } catch (NullPointerException err) {
            System.out.println("Data masih kosong\n");
        }
    }
}
