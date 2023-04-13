package coba;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        for(String Loop = "Y"; Objects.equals(Loop, "Y"); Loop = w.nextLine()) {
        Scanner ingput = new Scanner(System.in);
        Scanner pilih = new Scanner(System.in);

        System.out.print("\n");
        System.out.println("                        ==========  Tugas   =========");
        System.out.println("                         ======  Praktikum 2 ======");
        System.out.print("\n");

        System.out.println("     1. Hasil dalam bentuk Integer");
        System.out.println("     2. Hasil dalam bentuk Double");
        System.out.print("\n");

        System.out.print("     Pilih mana? 1 atau 2?? : ");

        try {

            int mana = pilih.nextInt();

            switch (mana) {
                case 1:

                    try {

                        System.out.print("\n");
                        System.out.println("                         INTEGER");
                        System.out.print("     Masukkan Nilai Alas      : ");
                        double Alas = ingput.nextDouble();
                        System.out.print("     Masukkan Nilai Tinggi    : ");
                        double Tinggi = ingput.nextDouble();

                        rumus rumus = new rumus();

                        Segitiga<Integer> luasTipeInt = new Segitiga<>((int) Alas, (int) Tinggi);
                        System.out.print("\n");
                        System.out.println("                         HASIL");
                        System.out.println("     Luas segitiga dalam bentuk integer : " + rumus.getResultAsInt(luasTipeInt));

                        System.out.println("\n");
                        System.out.print("                    Ulang ? [Y/n] : ");
                    } catch (InputMismatchException e) {
                        System.err.println(e + "   (Masukkan angka coyyy)");
                    }
                    break;
                case 2:

                    try {
                        System.out.print("\n");
                        System.out.println("                         DOUBLE");
                        System.out.print("     Masukkan Nilai Alas      : ");
                        double Alas = ingput.nextDouble();
                        System.out.print("     Masukkan Nilai Tinggi    : ");
                        double Tinggi = ingput.nextDouble();

                        rumus rumus = new rumus();

                        Segitiga<Double> luasTipeDouble = new Segitiga<>(Alas, Tinggi);
                        System.out.print("\n");
                        System.out.println("                         HASIL");
                        System.out.println("     Luas segitiga dalam bentuk double : " + rumus.getResultAsDouble(luasTipeDouble));

                        System.out.println("\n");
                        System.out.print("                    Ulang ? [Y/n] : ");

                    } catch (InputMismatchException e) {
                        System.err.println(e + "   (Masukkan angka coyyy)");
                    }

                    break;
            }

        } catch (Exception e) {
            System.err.println("Pilihan Tidak Ada");
        }


    }
    }
    
}
