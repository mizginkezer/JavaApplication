/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mizgi
 */
public class uygulamabes {
    public static void calis5()
    {
                Scanner giris = new Scanner(System.in);

        List<Integer> kayit = new ArrayList<Integer>();
        Scanner tara = new Scanner(System.in);
        int sec=0;
        while(sec!=2)
        {
            StringBuilder menucikti = new StringBuilder();
            System.out.println("Rastgele Zar Atma Oyununa Hoşgeldiniz!");
            menucikti.append("1: Zar Atmak İçin Tuşlayınız\n");
            menucikti.append("2: Geçmiş Kayıtları Listelemek İçin Tuşlayınız \n");
            menucikti.append("3: Çıkış Yapmak İçin Tuşlayın \n");
            System.out.println(menucikti);
            System.out.println(".....................................................................");
            sec=tara.nextInt();
            int secim =100;
            if(sec==1)
            {
                int zar1=(int)(Math.random()*6+1);
                int zar2=(int)(Math.random()*6+1);
                System.out.println("Birinci Zar Sonucu: "+zar1);
                System.out.println("İkinci Zar Sonucu: "+zar2);
                int karar;
                Scanner karartara = new Scanner(System.in);
                System.out.println("Sonuçları Kayıt Etmek İster Misiniz? \n Evet İçin:1 Hayır İçin:2 Sayısını Tuşlayınız");
                karar=karartara.nextInt();
                 if (secim == 1){
                System.out.println("Zarların Değeri : " + zar1 + "," + zar2);
                System.out.println("Kayıt istiyor musun ? 1 - Evet  2 - Hayır");
                int zarkayit = giris.nextInt();
                if (zarkayit == 1){
                    System.out.println("Kayıt Başarılı");
                    kayit.add(zar1);
                    kayit.add(zar2);
                    System.out.println("Tekrar atmak istiyor musun ? 1 - Evet 2 - Hayır");
                    int Zar2 = giris.nextInt();
                    if (Zar2 == 1) {
                        int tekrarZar1 = (int) (Math.random() * 6 + 1);
                        int tekrarZar2 = (int) (Math.random() * 6 + 1);
                        System.out.println("Tekrar Atılan " +tekrarZar2 + "," +tekrarZar2 + " Kayıt için 1  . Devam etmek için 2 Sayısını Tuşlayınız. ");
                        int tekrar = giris.nextInt();
                        if (tekrar == 1) {
                            kayit.add(tekrarZar1);
                            kayit.add(tekrarZar2);
                        }
                    }
                }
                else if (zarkayit == 2) {
                    System.out.println("Tekrar Zar Atmak ? 1 - Evet 2 - Hayır");
                    int kayitsızzar = giris.nextInt();
                    if (kayitsızzar == 1){
                        int kayitsiz1zar1 = (int) (Math.random() * 6 + 1);
                        int kayitsiz2zar2 = (int) (Math.random() * 6 + 1);
                        System.out.println("Tekrar Zarlar. " +kayitsiz1zar1 + "," +kayitsiz2zar2 + "  Kayıt için 1 e . Devam etmek için 2 ye basın. ");
                        int tekrar = giris.nextInt();
                        if (tekrar == 1) {
                            kayit.add(kayitsiz2zar2);
                            kayit.add(kayitsiz2zar2);
                        }
                    }
                }
            }
            else if(secim == 2){
                System.out.println(kayit);
            }
            else if(secim == 3){
                sorulisteleri.SoruListeleri();
            }
            else
                System.out.println("Hatalı Giriş");
        }
    }
}
            
}



