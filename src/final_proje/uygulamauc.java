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
public class uygulamauc {
    public static void calis3()
    {
        Scanner input = new Scanner(System.in);
        Scanner tara = new Scanner(System.in);
        String secim;
        int sec=0;
        boolean option = true;
        
        while(sec!=5)
        {
            StringBuilder menucikti = new StringBuilder();
            System.out.println("KELİME İŞLEME");
            menucikti.append("1: KELİME İÇİNDE BELİRTİLEN HARFİN İLK YERİNİ BUL \n");
            menucikti.append("2: KELİME İÇİNDE BELİRTİLEN HARFİN SON YERİNİ BUL \n");
            menucikti.append("3: KELİME İÇİNDE BELİRTİLEN HARTEN KAÇ TANE OLDUĞUNU BUL \n");
            menucikti.append("4: KELİMENİN X-Y ARASINDAKİ KELİME/HARF PARÇASINI BUL \n");
            menucikti.append("5: ÇIKIŞ YAP \n");
            System.out.println(menucikti);
            System.out.println("LÜTFEN YAPILACAK İŞLEMİ TUŞLAYIN: ");
            sec=tara.nextInt();
            String kelime,harf;
            switch(sec)
            {
                case 1:
                    
                    Scanner kelimebul = new Scanner(System.in);
                    System.out.println("LÜTFEN BİR KELİME GİRİNİZ: ");
                    kelime=kelimebul.next();
                    Scanner harfbul = new Scanner(System.in);
                    System.out.println("LÜTFEN YAZDIĞINIZ KELİME İÇİNDE BİR HARF GİRİNİZ: ");
                    harf=harfbul.next();
                    System.out.println("YAZILAN HARFİN KELİME İÇİNDEKİ İLK YERİ: "+kelime.indexOf(harf));
                    break;
                    
                    case 2:
                    Scanner kelimebul1 = new Scanner(System.in);
                    System.out.println("LÜTFEN BİR KELİME GİRİNİZ: ");
                    kelime=kelimebul1.next();
                    Scanner harfbul1 = new Scanner(System.in);
                    System.out.println("LÜTFEN YAZDIĞINIZ KELİME İÇİNDE BİR HARF GİRİNİZ: ");
                    harf=harfbul1.next();
                    System.out.println("YAZILAN HARFİN KELİME İÇİNDEKİ SON YERİ: "+kelime.indexOf(harf));
                    break; 

                    
                    case 3:
                    String cumle ; int karakter;     
                    Scanner gir =new Scanner (System.in);     
                    System.out.println("LÜTFEN BİR KELİME GİRİNİZ: ");     
                    cumle =gir.nextLine();     
                    karakter =cumle.length(); 
                    System.out.println("Girilen KELİMEDE "+karakter+ " TANE HARF VAR.");
                    break;
                    
                    
                    case 4:
                    int x,y;
                    String metin;
                    Scanner metinbul = new Scanner(System.in);
                    System.out.print("LÜTFEN BİR KELİME GİRİNİZ: ");
                    metin=metinbul.next();
                    Scanner xbul = new Scanner(System.in);
                    System.out.print("KELİME BAŞLANGICI İÇİN BİR SAYI GİRİNİZ: ");
                    x=xbul.nextInt();
                    Scanner ybul = new Scanner(System.in);
                    System.out.print("KELİME BİTİŞİ İÇİN BİR SAYI GİRİNİZ: ");
                    y=ybul.nextInt();
                    System.out.println(x+" VE "+y+" ARASINDAKİ KELİME/HARF: "+metin.substring(x,y));
                    break;

                    
            }
            
                      System.out.print("Çıkış Yapmak İster Misiniz? (y/n): Evet İçin: y Hayır İçin: n Tuşlayınız: ");
			secim = input.next();
			if (secim.equals("y")) 
                        {
			    option = true;
			} 
                        else 
                        {
			    option = false;
			    System.out.println("Sonraki İşleme Geçildi! \n");
			}
            
			
        }
    }
}
