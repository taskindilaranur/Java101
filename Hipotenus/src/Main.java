import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a , b , c;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üçgenin A Kenarını Giriniz :");
        a = inp.nextDouble();
        System.out.print("Üçgenin B Kenarını Giriniz :");
        b = inp.nextDouble();
        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs :" + c);
    }
}