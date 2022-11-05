import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double Akilo, Ekilo, Dkilo, Mkilo, Pkilo;
        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlıcan = 5.0;
        double Atutar, Etutar, Dtutar, Mtutar, Ptutar, toplam;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç Kilo Armut Aldınız :");
        Akilo = inp.nextDouble();
        System.out.print("Kaç Kilo Elma Aldınız :");
        Ekilo = inp.nextDouble();
        System.out.print("Kaç Kilo Domates Aldınız :");
        Dkilo = inp.nextDouble();
        System.out.print("Kaç Kilo Muz Aldınız :");
        Mkilo = inp.nextDouble();
        System.out.print("Kaç Kilo Patlıcan Aldınız :");
        Pkilo = inp.nextDouble();
        Atutar = Akilo * Armut;
        System.out.println("Ödenecek Armut Tutarı :" + Atutar);
        Etutar = Ekilo * Elma;
        System.out.println("Ödenecek Elma Tutarı :" + Etutar);
        Dtutar = Dkilo * Domates;
        System.out.println("Ödenecek Domates Tutarı :" + Dtutar);
        Mtutar = Mkilo * Muz;
        System.out.println("Ödenecek Muz Tutarı :" + Mtutar);
        Ptutar = Pkilo * Patlıcan;
        System.out.println("Ödenecek Patlıcan Tutarı :" + Ptutar);
        toplam = Atutar + Etutar + Dtutar + Mtutar + Ptutar;
        System.out.print("Toplam Ödenecek Tutar :" + toplam);
    }
}