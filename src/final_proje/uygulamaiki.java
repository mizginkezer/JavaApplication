/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_proje;
/**
 *
 * @author mizgi
 */

import java.util.Random;
import java.util.Scanner;

public class uygulamaiki {

    public static void calis2(){

        Scanner input = new Scanner(System.in);
        String[] isimler = {"mehmet", "buse", "irem", "nihal", "karaca", "efe", "furkan","ezgi","levent","elif","ibrahim"};
        int isimUz = isimler.length;
        Random rast = new Random();
        int isminUz = rast.nextInt(isimUz);
        String secilenisim = isimler[isminUz];
        int uzunluk = secilenisim.length();
        int isim = 0;
        boolean durum = false;
        boolean var_mi = false;
        boolean bulundu = false;
        char [] tahmin = new char[uzunluk];
        char harf;
        int hak = 5;
        while (durum == false){
            if (hak == 0) {
                System.out.println("Tüm Hakkınız Bitti. İsim: " + secilenisim);
                sorulisteleri.SoruListeleri();
            }
            Random rand = new Random();
            String rastad = isimler[rand.nextInt(isimler.length)];
            int harfler = rastad.length();
            System.out.print("İsim Seçildi. \n");
            System.out.println("İsmin " + harfler + " Harfi Var ");
            System.out.println("Seçilen İsim İçin Harf Girin: ");
            for (int i= 0; i < uzunluk; i++) {
                if (tahmin[i] == secilenisim.charAt(i)) {
                    System.out.print(tahmin[i]);
                }
                else
                    System.out.print("_ ");
            }
            System.out.print(" : ");
            harf = input.next().charAt(0);
            for (int j= 0; j < uzunluk; j++){
                if (tahmin[j] == harf){
                    var_mi = true;
                }
            }
            if (var_mi == false) {
                for (int k = 0; k < uzunluk; k++) {
                    if (secilenisim.charAt(k) == harf) {
                        tahmin[k] = harf;
                        bulundu = true;
                        isim++;
                    }
                }
            }
            if (var_mi)
                System.out.println(harf + " İsimde Mevcut. ");
            else if (bulundu == false) {
                hak--;
                System.out.println(harf + " İsimde yok. " + hak + " hakkınız kaldı.");
            }
            if (isim == uzunluk) {
                System.out.println("İsmi buldunuz. İsim : " + secilenisim);
                sorulisteleri.SoruListeleri();
            }
            if (isim == uzunluk) {
                durum = true;
            }
            var_mi = false;
            bulundu = false;
        }
    }
}