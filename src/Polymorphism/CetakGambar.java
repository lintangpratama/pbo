package Polymorphism;

public class CetakGambar extends Bentuk {
    public static void main(String[] args) {
        Bentuk[] obj = {new Lingkaran(), new Elips(), new Segitiga()};
        CetakGambar cetak = new CetakGambar();

        cetak.gambar();
        cetak.hapus();

        System.out.println("======================");
        cetak.tampil(obj);
    }

    private void tampil(Bentuk[] obj) {
        for (int i = 0; i < obj.length; i++) {
            obj[i].gambar();
            obj[i].hapus();

            System.out.println("=======================");
        }
    }
}
