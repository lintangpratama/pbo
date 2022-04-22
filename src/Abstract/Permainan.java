package Abstract;

// Mendefinisikan class abstract
public abstract class Permainan {
    // Atribut class abstract Permainan
    String namaPemain;
    int levelPemain;

    public abstract int getLevelPemain();

    public abstract void setLevelPemain(int levelPemain);

    public abstract String getNamaPemain();

    // Method class abstract Permainan
    public abstract void setNamaPemain(String namaPemain);

    public abstract void jalankan();

    public abstract int hitungSkor(int hit, int miss);
}
