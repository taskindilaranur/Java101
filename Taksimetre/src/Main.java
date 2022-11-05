import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km , parakm = 2.20 , min = 20 , acilis = 10 , para;
        Scanner inp = new Scanner(System.in);
        System.out.print("Gidilen Kilometreyi Giriniz :");
        km = inp.nextDouble();
        para = (parakm * km) + acilis;
        para = (para < min) ? min : para;
        System.out.print(para);
    }
}