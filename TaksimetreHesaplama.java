package CaglaSonmez;

import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mesafe, taksimetreTutar;

        System.out.print("Gidilen mesafeyi (KM cinsinden) girin: ");
        mesafe = input.nextDouble();

        taksimetreTutar = 10 + (mesafe * 2.20);
        taksimetreTutar = Math.max(taksimetreTutar, 20); // Minimum ücret kontrolü

        System.out.println("Taksimetre Tutarı: " + taksimetreTutar + " TL");
    }
}






