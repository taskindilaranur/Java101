import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double r , alan , cevre;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz :");
        r = inp.nextDouble();
        cevre = 2 * Math.PI * r;
        System.out.println("Dairenin Çevresi :" + cevre);
        alan = Math.PI * r * r;
        System.out.print("Dairenin alanı :" +alan);

    }
}