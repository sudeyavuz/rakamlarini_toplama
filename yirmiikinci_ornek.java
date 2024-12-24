package JAVA101;
import java.util.Scanner;
public class yirmiikinci_ornek {
    public static void main(String[] args) {
        int number, topsayi = 0;
        Scanner scan = new Scanner(System.in);


        System.out.print("rakamları toplanacak sayıyı giriniz: ");
        number = scan.nextInt();

        while (number != 0) {

            topsayi += number % 10;
            number = number / 10;

        }
        System.out.println("sayıların toplamı: " + topsayi);

    }
    }

