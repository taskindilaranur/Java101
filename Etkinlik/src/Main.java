import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double C;

        Scanner inp = new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Giriniz :");
        C = inp.nextDouble();

        if (C < 5){
            System.out.print("Kayak Yapmaya Gidebilirsiniz!");

        } else if (5 <= C && C < 15) {
            System.out.print("Sinema İzlemeye Gidebilirsiniz!");

        } else if (15 <= C && C < 25) {
            System.out.print("Piknik Yapmaya Gidebilirsiniz!");

        } else{
            System.out.print("Yüzmeye Gidebilirsiniz!");
        }
    }
}