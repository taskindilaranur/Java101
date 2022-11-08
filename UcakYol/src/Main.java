import com.sun.deploy.net.proxy.WDefaultBrowserProxyConfig;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, fiyat, afiyat, para = 0.10;
        int yas, tip;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yolcunun Yaşını Giriniz :");
        yas = inp.nextInt();
        if (yas < 0) {
            System.out.print("Hatalı Giriş Yaptınız!");
            System.exit(0);
        }

        System.out.print("Gidilecek Mesafeyi Giriniz :");
        km = inp.nextDouble();
        if (km < 0) {
            System.out.print("Hatalı Giriş Yaptınız!");
            System.exit(0);
        }

        System.out.print("1 = Yalnızca Gidiş\n2 = Gidiş-Dönüş\nYolculuk Tipini seçiniz :");
        tip = inp.nextInt();
        if (tip < 1 && tip > 2) {
            System.out.print("Hatalı Giriş Yaptınız!");
            System.exit(0);
        }

        if (yas < 12 && tip == 1) {
            fiyat = (para * km) - ((para * km) * 0.5);
            System.out.print("Ödenecek Tutar :" + fiyat);

        } else if (yas < 12 && tip == 2) {
            fiyat = (para * km) - ((para * km) * 0.5);
            afiyat = fiyat - ((para * km) * 0.2);
            System.out.print("Ödenecek Tutar :" + afiyat);

        } else if (yas >= 12 && yas <= 24 && tip == 1) {
            fiyat = (para * km) - ((para * km) * 0.1);
            System.out.print("Ödenecek Tutar :" + fiyat);

        } else if (yas >= 12 && yas <= 24 && tip == 2) {
            fiyat = (para * km) - ((para * km) * 0.1);
            afiyat = fiyat - ((para * km) * 0.2);
            System.out.print("Ödenecek Tutar :" + afiyat);

        } else if (yas > 65 && tip == 1) {
            fiyat = (para * km) - ((para * km) * 0.3);
            System.out.print("Ödenecek Tutar :" + fiyat);

        } else if (yas > 65 && tip == 2) {
            fiyat = (para * km) - ((para * km) * 0.3);
            afiyat = fiyat - ((para * km) * 0.2);
            System.out.print("Ödenecek Tutar :" + afiyat);

        } else if (yas > 24 && yas <= 65 && tip == 1) {
            fiyat = para * km;
            System.out.print("Ödenecek Tutar :" + fiyat);

        } else if (yas > 24 && yas <= 65 && tip == 2) {
            fiyat = (para * km) - ((para * km) * 0.2);
            System.out.print("Ödenecek Tutar :" + fiyat);
        }

    }
}