package Interface;

public class Laptop implements Keyboard, MouseBaru {
    public void klik_kanan() {
        System.out.println("Mouse laptop : klik kanan");
    }
    public void klik_kiri() {
        System.out.println("Mouse laptop : klik kiri");
    }
    public void double_klik() {
        System.out.println("Mouse laptop : double klick");
    }
    public void tekan_enter() {
        System.out.println("Keyboard laptop : tekan enter");
    }
}
