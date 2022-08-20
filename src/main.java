import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100);
        int right = 0;
        int selected;
        boolean isFind = false;

        int[] wrongNumber = new int[5];
        Scanner inp = new Scanner(System.in);

        while (right < 5) {
            System.out.print("tahmin giriniz:");
            selected = inp.nextInt();

            if ((selected) < 0 || (selected > 100)) {
                System.out.println("Lutfen 0-100 araliginda bir deger giriniz.");
                wrongNumber[right] = selected;
                right++;
                System.out.println("kalan hakkiniz:" + (5 - right));
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler dogru tahmin ettiniz.\nGizli sayi:" + number);
                isFind = true;
                break;
            } else {
                System.out.println("Yanlis tahmin.Lutfen tekrar deneyiniz:");
                if (selected < number) {
                    System.out.println(selected + "   dan buyuk tahmin yapiniz.");
                } else {
                    System.out.println(selected + "  dan kucuk tahmin yapiniz.");
                }
                wrongNumber[right] = selected;
                right++;
                System.out.println("kalan hakkiniz:" + (5 - right));
                isFind = false;
            }
        }

        if (!isFind) {
            System.out.println("Yanlis girdiginiz sayilar:  " + Arrays.toString(wrongNumber));
        }
    }

}
