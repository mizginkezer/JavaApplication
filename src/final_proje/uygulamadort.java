/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_proje;
import java.util.Scanner;
/**
 *
 * @author mizgi
 */
public class uygulamadort {
    public static void calis4(){
 Scanner input = new Scanner(System.in);
        int secim = 100;

        while (secim != 3) {

            String kirmizirenk= "Kırmızı";
            String yesilrenk = "Yeşil";
            String mavirenk = "Mavi";
            int kirmiziKitapSayisi = 14;
            int yesilKitapSayisi = 14;
            int maviKitapSayisi = 14;
            System.out.println("\n1 - Bir rafta sırasıyla kırmızı, yeşil, mavi kitaplar art arda sıralanacak.");
            System.out.println("2 - Bir rafta eşit sayıda olmak üzere sırasıyla önce kırmızı, sonra yeşil, en son ise mavi kitaplar sıralanacak.");
            System.out.println("3 - Sorulara dönmek için 3 Sayısını Tuşlayınız.");
            secim = input.nextInt();
            
     switch (secim) {
         case 1:
             System.out.println("Sırasıyla kırmızı - yeşil - mavi kitaplar sıralandı.");
             while (maviKitapSayisi != 0) {
                 System.out.print(kirmizirenk + " " + yesilrenk+ " " + mavirenk + " " );
                 yesilKitapSayisi--;
                 kirmiziKitapSayisi--;
                 maviKitapSayisi--;
             }
             break;
         case 2:
             System.out.println("Sırasıyla önce kırmızı, sonra yeşil, en son mavi kitaplar sıralandı");
             while (kirmiziKitapSayisi != 0) {
                 System.out.print(kirmizirenk + " ");
                 kirmiziKitapSayisi--;
             }
             while (yesilKitapSayisi != 0) {
                 System.out.print(yesilrenk + " ");
                 yesilKitapSayisi--;
             }
             while (maviKitapSayisi != 0) {
                 System.out.print(mavirenk + " ");
                 maviKitapSayisi--;
             }
             break;
         case 3:
             sorulisteleri.SoruListeleri();
             break;
         default:
             System.out.println("Giriş Hatalı");
             break;
     }
        }
    }
}