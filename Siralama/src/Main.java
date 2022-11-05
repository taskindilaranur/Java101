import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.println("Birbirinden Farklı Üç Sayı Giriniz!");
        System.out.print("Birinci Sayı :");
        a = inp.nextDouble();

        System.out.print("İkinci Sayı :");
        b = inp.nextDouble();

        System.out.print("Üçüncü Sayı :");
        c = inp.nextDouble();

        if (a < b && a < c && b < c) {
            System.out.println(a);
            System.out.println(b);
            System.out.print(c);

        } else if (a < b && a < c && c < b) {
            System.out.println(a);
            System.out.println(c);
            System.out.print(b);

        } else if (b < a && b < c && c < a) {
            System.out.println(b);
            System.out.println(c);
            System.out.print(a);

        } else if (b < a && b < c && a < c) {
            System.out.println(b);
            System.out.println(a);
            System.out.print(c);

        } else if (c < a && c < b && b < a) {
            System.out.println(c);
            System.out.println(b);
            System.out.print(a);

        } else if (c < a && c < b && a < b) {
            System.out.println(c);
            System.out.println(a);
            System.out.print(b);

        }
    }
}