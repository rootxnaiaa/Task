package TugasPakChandra;

import java.util.Scanner;
public class PecahanUang {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] pecahan = { 100000, 50000, 20000, 10000, 5000, 2000, 1000 };
        int[] jumlahPecahan = new int[pecahan.length];
        
        System.out.print("Masukkan nilai uang dalam rupiah: ");
        int uang = input.nextInt();
        
        int i =0;
        while (uang > 0 && i < pecahan.length) {
            jumlahPecahan[i] = uang / pecahan[i];
            uang %= pecahan[i];
            i++;
      }
        System.out.println("Jumlah pecahan uang yang diperoleh adalah:");
        for (int j = 0; j < pecahan.length; j++) {
            
            if (jumlahPecahan[j] > 0) {
            System.out.println(jumlahPecahan[j] + " lembar " + pecahan[j] + " rupiah");
         }
      }
   }
}
