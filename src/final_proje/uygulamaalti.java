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
public class uygulamaalti {
   public static void calis6(){
     int secim = 0;
StringBuilder menucikti = new StringBuilder();
Scanner secimtara = new Scanner(System.in);
menucikti.append("Lütfen aşagıdaki matematik işlemlerinden birini seçiniz...\n");
menucikti.append("1-) 4 İşlem \n");
menucikti.append("2-)Karakök Alma\n");
menucikti.append("3-) Küpkök Alma\n");
menucikti.append("4-) Kuvvet Alma \n");
menucikti.append("5-)Faktoriyel hesabı yapma\n");
while(secim!=6)
{
System.out.println(menucikti);
secim=secimtara.nextInt();
switch(secim)
{
case 1:
StringBuilder menudortislem = new StringBuilder();
Scanner islemtara = new Scanner(System.in);
menudortislem.append("1-)Toplama İşlemi\n");
menudortislem.append("2-)Çıkarma İşlemi\n");
menudortislem.append("3-)Çarpma İşlemi\n");
menudortislem.append("4-)Bölme İşlemi\n");
System.out.println(menudortislem);
int sec = secimtara.nextInt();
    if(sec==1)
    {
    int s1,s2,sonuc;
    Scanner giris = new Scanner(System.in);
    System.out.println("Birinci Sayıyı Giriniz:");
    s1=giris.nextInt();
    System.out.println("İkinci Sayıyı Giriniz:");
    s2=giris.nextInt();
    sonuc=s1+s2;
    System.out.println("Sonuç:"+sonuc);
    }
    else if(sec==2)
    {
    int sayi1,sayi2,sonuc1;
    Scanner giris1 = new Scanner(System.in);
    System.out.println("Birinci Sayıyı Giriniz:");
    sayi1=giris1.nextInt();
    System.out.println("İkinci Sayıyı Giriniz:");
    sayi2=giris1.nextInt();
    sonuc1=sayi1-sayi2;
    System.out.println("Sonuç:"+sonuc1);
    }
     else if(sec==3)
     {
    int sa1,sa2,sonuc2;
    Scanner giris2 = new Scanner(System.in);
    System.out.println("Birinci Sayıyı Giriniz:");
    sa1=giris2.nextInt();
    System.out.println("İkinci Sayıyı Giriniz:");
    sa2=giris2.nextInt();
    sonuc2=sa1*sa2;
    System.out.println("Sonuç:"+sonuc2);
     }
    else if(sec==4)
    {
        
        double say1,say2,sonuc3;
    Scanner giris3 = new Scanner(System.in);
    System.out.println("Birinci Sayıyı Giriniz:");
       say1=giris3.nextDouble();
       System.out.println("İkinci Sayıyı Giriniz:");
       say2=giris3.nextDouble();
    sonuc3=say1/say2;
    System.out.println("Sonuç:"+sonuc3);
    }
    break;
    case 2:
    int sayii1 = 0,karakoksonuc;
    Scanner karakok = new Scanner(System.in);
    System.out.println("Sayı Giriniz:");
    sayii1=karakok.nextInt();
    karakoksonuc=(int) Math.sqrt(sayii1);
    System.out.println("Sonuç:"+karakoksonuc);
    break;
    case 3:
    int kupsayi = 0,kupkoksonuc;
    Scanner kupkok = new Scanner(System.in);
    System.out.println("Sayı Giriniz:");
    sayii1=kupkok.nextInt();
    kupkoksonuc=(int) Math.pow(sayii1,10/3);
    System.out.println("Sonuç:"+kupkoksonuc);
    break;
    case 4:
    int kok1,kok2,sonuckuvvet;
    Scanner kuvvet = new Scanner(System.in);
    System.out.println("Sayıyı Giriniz:");
    kok1=kuvvet.nextInt();
    System.out.println("kuvvet Giriniz:");
    kok2=kuvvet.nextInt();
    sonuckuvvet=(int) Math.pow(kok1, kok2);
    System.out.println("Sonuç:"+sonuckuvvet);
    break;
    case 5:
    int faktoriyelsonuc = 1,sayii;
    Scanner faktoriyelgiris = new Scanner(System.in);
    System.out.println("Sayıyı Giriniz:");
    sayii=faktoriyelgiris.nextInt();
     for(int i=2; i<=sayii; i++){ 
     faktoriyelsonuc=i*faktoriyelsonuc; 
} 
     System.out.println("Sonuc="+faktoriyelsonuc);
    break;
}

}

}
}
   
   
    

    

