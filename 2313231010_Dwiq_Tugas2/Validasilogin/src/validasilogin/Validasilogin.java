/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validasilogin;

import java.util.Scanner;

public class Validasilogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String usernameBenar = "admin";
        String passwordBenar = "123";
        int percobaan = 0;
        boolean loginBerhasil = false;

        while (percobaan < 3 && !loginBerhasil) {
            System.out.print("Masukkan username: ");
            String usernameInput = input.nextLine();

            System.out.print("Masukkan password: ");
            String passwordInput = input.nextLine();

            if (usernameInput.equals(usernameBenar) && passwordInput.equals(passwordBenar)) {
                System.out.println("Selamat datang, " + usernameInput + "!");
                loginBerhasil = true;
            } else {
                percobaan++;
                System.out.println("Username atau password salah. Percobaan ke-" + percobaan);
            }
        }

        if (!loginBerhasil) {
            System.out.println("Akun diblokir!");
        }

        input.close();
    }
}

