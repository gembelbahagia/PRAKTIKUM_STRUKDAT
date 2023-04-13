package coba2;

import java.util.Scanner;

public class SEGITIGA <T extends Number>{
        public T Alas;
        public T Tinggi;
        
        public SEGITIGA(T Alas, T Tinggi){
            this.Alas=Alas;
            this.Tinggi=Tinggi;
        }


        public int getResultAsInt(SEGITIGA segitiga){
            return (int) (Alas.doubleValue()*Tinggi.doubleValue()/2);
        }

        public double getResultAsDouble(SEGITIGA segitiga){
            return Alas.doubleValue()*Tinggi.doubleValue()/2;
        }

        public static void main(String[] args) {
            Scanner pilih = new Scanner(System.in);
            Scanner input = new Scanner(System.in);
            System.out.println("-----MODUL1-----");

            System.out.println("1. Integer");
            System.out.println("2. Double");
            System.out.print("Pilih   :");
            int menu = pilih.nextInt();

            switch(menu){
                
                
                
                case 1 :
                System.out.println("/n");
                System.out.print("Masukan Alas    :");
                int Alas = input.nextInt();
                System.out.print("Masukan Tinggi  :");
                int Tinggi = input.nextInt();
                SEGITIGA<Integer> LuasTipeInt = new SEGITIGA<>(Alas, Tinggi);
                System.out.println("Hasil   :"+ LuasTipeInt.getResultAsInt(LuasTipeInt));


                break;

                case 2 :
                System.out.println("/n");
                System.out.print("Masukan Alas    :");
                double Alass = input.nextDouble();
                System.out.print("Masukan Tinggi  :");
                double Tinggii = input.nextDouble();
                SEGITIGA<Double> LuasTipeDouble = new SEGITIGA<>(Alass, Tinggii);
                System.out.println(" Hasil  :"+ LuasTipeDouble.getResultAsDouble(LuasTipeDouble));


                break;
            }
            
        }

}
