import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuz :");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();
        double ortalama = ((mat + fizik + kimya + turkce + tarih + muzik) / 6.0);
        System.out.println("Ortalamanız : " + ortalama);
        int a = 60;
        boolean kosul = ortalama >= a;
        String str = (kosul) ? "Geçtiniz" : "Kaldınız";
        System.out.print(str);

    }
}
