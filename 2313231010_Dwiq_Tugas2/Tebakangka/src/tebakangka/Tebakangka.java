/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tebakangka;

import java.util.Random;
import java.util.Scanner;

public class Tebakangka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int angkaRahasia = rand.nextInt(100) + 1;  // angka antara 1–100
        int tebakan = -1;
        int percobaan = 0;

        System.out.println("=== Permainan Tebak Angka ===");
        System.out.println("Tebak angka dari 1 sampai 100.");
        System.out.println("Ketik 0 untuk keluar.");

        while (tebakan != angkaRahasia) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();

            if (tebakan == 0) {
                System.out.println("Kamu keluar dari permainan. Angka rahasianya adalah: " + angkaRahasia);
                break;
            }

            percobaan++;

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil!");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar!");
            } else {
                System.out.println("Selamat! Kamu menebak dengan benar.");
                System.out.println("Jumlah percobaan: " + percobaan);
            }
        }

        input.close();
    }
}
