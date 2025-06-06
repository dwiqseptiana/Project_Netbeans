/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacedemo;

/**
 *
 * @author amemiya
 */
// Interface

interface Hewan {

void bersuara(); // Method abstrak

}

// Implementasi pada kelas Kucing

class Kucing implements Hewan {

@Override

public void bersuara() {

System.out.println("Kucing mengeong: Meow Meow!");

}

}

// Implementasi pada kelas Anjing

class Anjing implements Hewan {

@Override

public void bersuara() {

System.out.println("Anjing menggonggong: Woof Woof!");

}

}
// Main class

public class InterfaceDemo {

public static void main(String[] args) {

Hewan kucing = new Kucing();

Hewan anjing = new Anjing();

kucing.bersuara();

anjing.bersuara();

}

}
