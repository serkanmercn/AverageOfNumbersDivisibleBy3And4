import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz: ");
        k = inp.nextInt();

        int iterasyonAdet=0;
        int toplam=0;

        for (int i =1; i <= k; i++) {
            if (i % 3 == 0 || i%4 ==0) {
                toplam +=i;
                iterasyonAdet++;
                System.out.println("3`e ve 4`e Tam Bolunebilen " + iterasyonAdet + " .Sayi: " + i);
            }


        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Rapor Toplam: " + iterasyonAdet + " Sayi Tam Bolunebilmektedir. \n" +
                "Sayilarin Tolami: " + toplam + "\n" +
                "Aritmatik Ortalamasi: " + toplam/iterasyonAdet + "\n");
    }
}