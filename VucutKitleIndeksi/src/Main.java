import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy , kilo , indeks;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (m cinsinden) Giriniz :");
        boy = inp.nextDouble();
        System.out.print("Lütfen Kilonuzu (kg cinsinden) Giriniz :");
        kilo = inp.nextDouble();
        indeks = kilo / (boy * boy);
        System.out.print(indeks);
    }
}