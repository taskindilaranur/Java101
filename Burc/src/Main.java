import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day;
        String month;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Doğduğunuz Ayı Giriniz :");
        month = inp.nextLine();

        System.out.print("Lütfen Doğduğunuz Günü Giriniz :");
        day = inp.nextInt();

        if (month.equals("Mart") && day >=21) {
            System.out.print("Koç Burcusunuz!");

        } else if (month.equals("Nisan") && day >= 1 && day <= 20) {
            System.out.print("Koç Burcusunuz!");

        } else if (month.equals("Nisan") && day >= 21) {
            System.out.print("Boğa Burcusunuz!");

        } else if (month.equals("Mayıs") && day >= 1 && day <= 21) {
            System.out.print("Boğa Burcusunuz!");

        } else if (month.equals("Mayıs") && day >= 22) {
            System.out.print("İkizler Burcusunuz!");

        } else if (month.equals("Haziran") && day >= 1 && day <= 22) {
            System.out.print("İkizler Burcusunuz!");

        } else if (month.equals("Haziran") && day >= 23) {
            System.out.print("Yengeç Burcusunuz!");

        } else if (month.equals("Temmuz") && day >= 1 && day <= 22) {
            System.out.print("Yengeç Burcusunuz!");

        } else if (month.equals("Temmuz") && day >= 23) {
            System.out.print("Aslan Burcusunuz!");

        } else if (month.equals("Ağustos") && day >= 1 && day <= 22) {
            System.out.print("Aslan Burcusunuz!");

        } else if (month.equals("Ağustos") && day >= 23) {
            System.out.print("Başak Burcusunuz!");

        } else if (month.equals("Eylül") && day >= 1 && day <= 22) {
            System.out.print("Başak Burcusunuz!");

        } else if (month.equals("Eylül") && day >= 23) {
            System.out.print("Terazi Burcusunuz!");

        } else if (month.equals("Ekim") && day >= 1 && day <= 22) {
            System.out.print("Terazi Burcusunuz!");

        } else if (month.equals("Ekim") && day >= 23) {
            System.out.print("Akrep Burcusunuz!");

        } else if (month.equals("Kasım") && day >= 1 && day <= 21) {
            System.out.print("Akrep Burcusunuz!");

        } else if (month.equals("Kasım") && day >= 22) {
            System.out.print("Yay Burcusunuz!");

        } else if (month.equals("Aralık") && day >= 1 && day <= 21) {
            System.out.print("Yay Burcusunuz!");

        } else if (month.equals("Aralık") && day >= 22) {
            System.out.print("Oğlak Burcusunuz!");

        } else if (month.equals("Ocak") && day >= 1 && day <= 21) {
            System.out.print("Oğlak Burcusunuz!");

        } else if (month.equals("Ocak") && day >= 22) {
            System.out.print("Kova Burcusunuz!");

        } else if (month.equals("Şubat") && day >= 1 && day <= 19) {
            System.out.print("Kova Burcusunuz!");

        } else if (month.equals("Şubat") && day >= 20) {
            System.out.print("Balık Burcusunuz!");

        } else if (month.equals("Mart") && day >= 1 && day <= 20) {
            System.out.print("Balık Burcusunuz!");

        }
    }
}