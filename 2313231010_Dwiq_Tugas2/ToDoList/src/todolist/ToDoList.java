/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftarTugas = new ArrayList<>();
        int pilihan;

        do {
            // Menu
            System.out.println("\n=== MENU TO-DO LIST ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Semua Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan tugas baru: ");
                    String tugas = input.nextLine();
                    daftarTugas.add(tugas);
                    System.out.println("Tugas berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n=== Daftar Tugas ===");
                    if (daftarTugas.isEmpty()) {
                        System.out.println("Belum ada tugas.");
                    } else {
                        for (int i = 0; i < daftarTugas.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarTugas.get(i));
                        }
                    }
                    break;

                case 3:
                    if (daftarTugas.isEmpty()) {
                        System.out.println("Tidak ada tugas yang bisa dihapus.");
                        break;
                    }
                    System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                    int index = input.nextInt();
                    input.nextLine(); // Membersihkan newline
                    if (index > 0 && index <= daftarTugas.size()) {
                        String removed = daftarTugas.remove(index - 1);
                        System.out.println("Tugas \"" + removed + "\" berhasil dihapus.");
                    } else {
                        System.out.println("Nomor tugas tidak valid.");
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);

        input.close();
    }
}
