import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int numCounter = 0;
        int numValue = 0;
        int tempN;
        int sumValue = 0;
        int result = 0;
        int numPow;

        System.out.print("Lutfen Bir Sayi Giriniz : ");
        n = input.nextInt();
        tempN = n;
        while (tempN != 0) {
            tempN /= 10;
            numCounter++;

        }

        tempN = n;
        while (tempN != 0) {
            numValue = tempN % 10;
            numPow = 1;
            for (int i = 1; i <= numCounter; i++) {
                numPow *= numValue;
            }
            sumValue += numValue;
            result += numPow;
            tempN /= 10;





        }if (result == n) {
            System.out.println(n + " Sayisi Bir Amstrong Sayisidir.");
        } else {
            System.out.println(n + " Sayisi Bir Amstrong Sayisi Degildir.");
        }

        System.out.println("Basamak Degerleri Toplami : " + sumValue);

    }
}
