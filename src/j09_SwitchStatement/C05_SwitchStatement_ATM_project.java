package j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchStatement_ATM_project {

    public static void main(String[] args) {

/*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("    *****       ");
        System.out.println("  *** ATM'ye hoşgeldiniz ***");
        System.out.println("bBakiye ögrenme-> 1\n para yatırma->2\npara çekme ->3\nçıkış->4\nGiriniz:");
        int seçim = sc.nextInt();
        int bakiye = 1000;

        switch (seçim) {

            case 1:
                System.out.println("bakiyeniz :" + bakiye);
                break;

            case 2:
                System.out.println("yatıracagınız miktarı giriniz");
                int yatırılanMiktar = sc.nextInt();
                bakiye += yatırılanMiktar;
                System.out.println("bakiyenin güncel hali :" + bakiye);
                break;

            case 3:
                System.out.println("ne kadar çekecen:");
                int cekilenMiktar = sc.nextInt();
                if (cekilenMiktar > bakiye) {
                    System.out.println("agam niidin olmayan parayı mı cekecen :(");
                    System.out.println("ahanda bakiyen güncelhali :" + bakiye);

                } else {
                    bakiye -= cekilenMiktar;
                    System.out.println("agam bakiyenin güncel hali:" + bakiye);

                }
                break;
            case 4:
                System.out.println("agam  çıkışın yapıldı selametle");
                break;
            default:
                System.out.println("hatalı şecim girdiniz tekrar deneyiniz");


        }


    }


}
