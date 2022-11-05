import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b;
        int select;

        Scanner inp = new Scanner(System.in);

        System.out.print("İşlem Yapacağınız İlk Sayıyı Giriniz :");
        a = inp.nextDouble();

        System.out.print("İşlem Yapacağınız İkini Sayıyı Giriniz :");
        b = inp.nextDouble();

        System.out.println("1 = Toplama\n2 = Çıkarma\n3 = Çarpma\n4 = Bölme");
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz :");

        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam :" + (a + b));
                break;
            case 2:
                System.out.print("Çıkarma :" + (a - b));
                break;
            case 3:
                System.out.print("Çarpım :" + (a * b));
                break;
            case 4:
                System.out.print("Bölüm :" + (a / b));
                break;
            default:
                System.out.print("Hatalı Giriş Yaptınız!");
        }
    }
}