package Interface;

public class Cetak {
    public static void cetak() {
        System.out.println("Komputer : ");
        Komputer komputerBaru = new Komputer();
        komputerBaru.klik_kanan();
        komputerBaru.klik_kiri();
        komputerBaru.double_klik();
        System.out.println("========================");
        System.out.println("PC : ");
        PC PCBaru = new PC();
        PCBaru.tekan_enter();
        System.out.println("========================");
        System.out.println("Laptop : ");
        Laptop laptopBaru = new Laptop();
        laptopBaru.klik_kanan();
        laptopBaru.klik_kiri();
        laptopBaru.double_klik();
        laptopBaru.tekan_enter();
        System.out.println("========================");
    }

    public static void main (String []args) {
        System.out.println("Komputer : ");
        Komputer komputerBaru = new Komputer();
        komputerBaru.klik_kanan();
        komputerBaru.klik_kiri();
        komputerBaru.double_klik();
        System.out.println("========================");
        System.out.println("PC : ");
        PC PCBaru = new PC();
        PCBaru.tekan_enter();
        System.out.println("========================");
        System.out.println("Laptop : ");
        Laptop laptopBaru = new Laptop();
        laptopBaru.klik_kanan();
        laptopBaru.klik_kiri();
        laptopBaru.double_klik();
        laptopBaru.tekan_enter();
        System.out.println("========================");
    }
}
