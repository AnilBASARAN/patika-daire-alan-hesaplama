import java.util.Scanner;
public class DaireHesap {
    public static void main(String[] args) {
        // pi sayısının değişmeyeceğini göz önüne alarak sabit olarak atıyoruz değişkeni
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz");
        double r = input.nextDouble();
        double alan = PI * r * r;
        alan = Math.round(alan*100);

        double cevre = 2 * PI * r;

        System.out.println("Dairenin alanı : " + alan/100);
        System.out.println("Dairenin cevresi : " + cevre);
    }
}
