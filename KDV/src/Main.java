import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double para, KDV = 18;
        Scanner inp = new Scanner(System.in);
        System.out.print("Paranızı Giriniz :");
        para = inp.nextDouble();
        double yeni = (((para*KDV)/100)+para);
        System.out.println("KDV'li Değeri :" + yeni);
        double eski = (yeni - para);
        System.out.print("KDV Tutarı :" + eski);
    }
}