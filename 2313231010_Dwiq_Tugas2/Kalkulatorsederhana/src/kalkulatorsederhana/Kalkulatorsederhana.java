/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulatorsederhana;

import java.util.Scanner;

public class Kalkulatorsederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;

        do {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /, %): ");
            char operator = input.next().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            double hasil;
            boolean valid = true;

            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil: " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol!");
                    }
                    break;
                case '%':
                    if (angka2 != 0) {
                        hasil = angka1 % angka2;
                        System.out.println("Hasil: " + hasil);
                    } else {
                        System.out.println("Error: Modulus dengan nol!");
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid!");
                    valid = false;
            }

            System.out.print("Apakah Anda ingin menghitung lagi? (y/n): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'y' || ulangi == 'Y');

        System.out.println("Terima kasih telah menggunakan kalkulator.");
        input.close();
    }
}

