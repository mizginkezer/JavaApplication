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
public class sorulisteleri {
    public static void SoruListeleri(){
            Scanner giris = new Scanner(System.in);
            int secim = 100;
            while (secim != 0)
            {
                System.out.println("Nesne Tabanlı Programla Java Uygulama Ödevi Soruları İçin");
                System.out.println("1. Soru İçin 1'i Tuşlayın (Yön Oyunu)");
                System.out.println("2. Soru İçin 2'yi Tuşlayın (İsim Tahmin Oyunu)");
                System.out.println("3. Soru İçin 3'ü Tuşlayın (Kelime Oyunu)");
                System.out.println("4. Soru İçin 4'ü Tuşlayın (Kütüphane İşlem Oyunu)");
                System.out.println("5. Soru İçin 5'i Tuşlayın (Zar Oyunu)");
                System.out.println("6. Soru İçin 6'yi Tuşlayın (Hesap İşlemleri)");
                System.out.println("Projeyi Sonlandırmak İçin 0 a Basınız...");
                secim = giris.nextInt();

                if (secim == 1) {
                    System.out.println("1. Soru Yüklendi || Yön Oyunu");
                   // uygulamabir.calis1();
                } else if (secim == 2) {
                    System.out.println("2. Soru Yüklendi || İsim Tahmin Oyunu");
                    uygulamaiki.calis2();
                } else if (secim == 3) {
                    System.out.println("3. Soru Yüklendi || Kelime Oyunu");
                    uygulamauc.calis3();
                } else if (secim == 4) {
                    System.out.println("4. Soru Yüklendi || Kütüphane İşlem Oyunu");
                    uygulamadort.calis4();
                } else if (secim == 5) {
                    System.out.println("5. Soru Yüklendi || Zar Oyunu");
                    uygulamabes.calis5();
                } else if (secim == 6) {
                    System.out.println("6. Soru Yüklendi || Hesap İşlemleri");
                    uygulamaalti.calis6();
                } else if (secim == 0) {
                    System.exit(0);
                } else {
                    System.out.println("Yanlış Giriş Tekrar Deneyiniz.");
                }
            }
        }
      
        }
    