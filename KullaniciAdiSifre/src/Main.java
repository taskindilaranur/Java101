import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz :");
        username = inp.nextLine();

        System.out.print("Şifrenizi Giriniz :");
        password = inp.nextLine();

        if (username.equals("patika")) {

        } else {
            System.out.println("Kullanıcı Adını Hatalı Girdiniz!");
        }
        if (password.equals("java1234")) {

        } else {
            System.out.print("Şifrenizi Hatalı Girdiniz!");
        }
    }
}