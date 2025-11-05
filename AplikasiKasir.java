package com.mycompany.aplikasikasir;

import java.util.Scanner;

public class AplikasiKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBarang;
        int harga, jumlah, totalSemua = 0;
        double diskon = 0, totalBayar;
        String lanjut;

        System.out.println("=== Program Kasir Sederhana ===");

        
        do {
            System.out.print("Masukkan nama barang: ");
            namaBarang = input.nextLine();

            System.out.print("Masukkan harga barang: ");
            harga = input.nextInt();

            System.out.print("Masukkan jumlah barang: ");
            jumlah = input.nextInt();
            input.nextLine(); 

            int total = harga * jumlah;
            totalSemua += total;

            System.out.println("Subtotal untuk " + namaBarang + ": Rp " + total);
            System.out.print("Apakah ingin menambah barang lagi? (y/n): ");
            lanjut = input.nextLine();

        } while (lanjut.equalsIgnoreCase("y"));

        
        if (totalSemua >= 100000) {
            diskon = 0.10;
        } else if (totalSemua >= 50000) {
            diskon = 0.05;
        }

        totalBayar = totalSemua - (totalSemua * diskon);

        System.out.println("\n=== Struk Pembayaran ===");
        System.out.println("Total Belanja : Rp " + totalSemua);
        System.out.println("Diskon        : " + (diskon * 100) + "%");
        System.out.println("Total Bayar   : Rp " + totalBayar);
        System.out.println("===============================");
        System.out.print("Masukkan uang pembayaran: ");
        double bayar = input.nextDouble();
        System.out.println("Kembalian     : Rp " + (bayar - totalBayar));
        System.out.println("=== Terima Kasih Telah Berbelanja! ===");
    }
}
