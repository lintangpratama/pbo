package Interface;

import java.util.Objects;

public class DataLogin implements Login {
    String usernameData = "lintangpratama";
    String passwordData = "1234";

    public boolean validasi(String username, String password) {
        if (!Objects.equals(username, "") || !Objects.equals(password, "")) {
            return true;
        }
        System.out.println("Username atau password tidak boleh kosong.");
        return false;
    }

    public boolean cekData(String username, String password) {
        if (Objects.equals(username, usernameData) && Objects.equals(password, passwordData)) {
            return true;
        }
        System.out.println("Username atau password salah.");
        return false;
    }
}
