import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Matematik, Fizik, Kimya, Turkce, Muzik, Ortalama;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz :");
        Matematik = inp.nextDouble();

        if (Matematik > 100) {
            Matematik = 0;
        } else if (Matematik < 0) {
            Matematik = 0;
        }

        System.out.print("Fizik Notunuzu Giriniz :");
        Fizik = inp.nextDouble();

        if (Fizik > 100) {
            Fizik = 0;
        } else if (Fizik < 0) {
            Fizik = 0;
        }

        System.out.print("Kimya Notunuzu Giriniz :");
        Kimya = inp.nextDouble();

        if (Kimya > 100) {
            Kimya = 0;
        } else if (Kimya < 0) {
            Kimya = 0;
        }

        System.out.print("Türkçe Notunuzu Giriniz :");
        Turkce = inp.nextDouble();

        if (Turkce > 100) {
            Turkce = 0;
        } else if (Turkce < 0) {
            Turkce = 0;
        }

        System.out.print("Müzik Notunuzu Giriniz :");
        Muzik = inp.nextDouble();

        if (Muzik > 100) {
            Muzik = 0;
        } else if (Muzik < 0) {
            Muzik = 0;
        }

        Ortalama = ((Matematik + Fizik + Kimya + Turkce + Muzik) / 5);

        if (Ortalama >= 55) {
            System.out.print("Geçtiniz!\nOrtalamanız :" + Ortalama);
        } else {
            System.out.print("Kaldınız!\nOrtalamanız :" + Ortalama);
        }
    }
}