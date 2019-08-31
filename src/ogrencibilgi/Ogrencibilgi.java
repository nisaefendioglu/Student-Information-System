/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrencibilgi;

import java.util.Scanner;

/**
 *
 * @author delll
 */
public class Ogrencibilgi {

    /**
     * @param args the command line arguments
     */
    public static void KisiselBilgiler(){
         Scanner ogrenci=new Scanner(System.in);
        //Kullanıcı Bilgilerini İsteme
        System.out.print("Adınızı Giriniz:");
        String ad=ogrenci.next();
        System.out.print("Soyadınızı Giriniz:");
        String soyad=ogrenci.next();
        System.out.print("Doğum Tarihinizi Giriniz:");
        int dogum=ogrenci.nextInt();
        System.out.print("Bölümünüzü giriniz:");
        String bolum=ogrenci.next();
        
        //Kullanıcı Adını Alma
         System.out.println("Öğrenci Bilgi Sistemi'ne Hoşgeldiniz");
         System.out.println("Kullanıcı Adınız:Adınız+Soyadınızdır."); //Kullanıcı adı bilgisi
         String kullanici=ad+soyad; //kullanıcı adının ad ve dogum tarihinden oluşmasını sağlayayan kod kısmı.
         System.out.print("Kullanıcı adınızı giriniz:");
         String kullaniciad=ogrenci.next();
         //Şifre Kontrolü
         if(kullanici.equals(kullaniciad)) //Girilen doğru bir şekilde kullanici adıyla eşleti ise
         {
        String sifre=soyad.substring(0,2); //soyadın ilk 2 harfinin alan kod kısmı.
        sifre=sifre+dogum;
        System.out.println("Parolanız soyadınızın ilk 2 harfi ve dogum yılınızdır.");
        System.out.print("Parolanızı giriniz:");
        String parola=ogrenci.next();
            if(parola.equals(sifre)) //Şifre doğruluğunda yapılabilecek islemler
            {
                System.out.println("Giriş Başarılı!");
                islemler();
                System.out.print("Yapmak İstediğiniz İşlemi Seçiniz:");
                int secim=ogrenci.nextInt();
                
           if(secim==1){ //Kişisel Bilgiler
               System.out.println("Ad:" + ad);
               System.out.println("Soyad:" + soyad);
               System.out.println("Doğum Tarihi:"+ dogum);
               System.out.println("Bölümü:" + bolum);
               
           }
           else if(secim==2){ //Ortak Dersler
               ortakDersler();
           }
           else if(secim==3){ //Ortalama hesaplama
             ortalamaHesapla();
           }
           
           else if(secim==4) { //Ders Kayıt İşlemleri
               dersKayit();
               
           }
                    else if(secim==5){ //Ders Programı
                      dersProgrami();       
                }
                else if(secim==6){ //Online Dersler
                    onlineDersler();
                }
                else if(secim==7){ //Duyurular
                    duyurular();
                }
                else if(secim==8){ //Sınav Programı
                  sinavProgrami();
                }
                else if(secim==9){ //Anketler
                   anketler();
                }
                  else if(secim==10) { //Odeme Yontemlerı Secımı
                       finansalİslemler();
                } //secim parantezi =010
                  else if(secim==11){ //Belge Talebi
                      belgeTalebi();
                  }
                  
                  else if(secim==12) //Devamsızlık Bilgisi
                  {
                     devamsizlik();
                  }
                  else if(secim==13){ //Danışman Bilgileri
                      
                       danismanBilgileri();
                  }
                  else if(secim==14){ //Akademik Takvim
                    akademikTakvim();
                      
                  }
                  else if (secim==15){ //Sınav Sonuçları
                      sonuclar();
                  }
            }
            else { //Parolaya Bağlı Hatalı Giriş
            System.out.print("Hatalı Giriş Yaptınız.");
            }
         }
         else{ //Kullanıcı Adına Bağlı Hatalı Giriş
        System.out.print("Hatalı Giriş Yaptınız.");
        
    }
 }
    
    
    public static void ortakDersler(){
    
    System.out.println("Alınan Ortak Dersler");
    System.out.println("Türk Dili ve Edebiyatı");
    System.out.println("Matematik");
    System.out.println("İletişim");
    System.out.println("Atatürk İlkeleri ve İnkılapları");
    System.out.println("Sosyal Sorumluluk ve Etik");
    
}
    public static void ortalamaHesapla(){
        Scanner ogrenci=new Scanner(System.in);
        System.out.print("Hesaplamak istediğiniz dersin vize notunu giriniz:");
        double vize=ogrenci.nextDouble();
        System.out.print("Hesaplamak istediğiniz dersin final notunu giriniz:");
        double fnl=ogrenci.nextDouble();
        
        vize=vize*40/100; //vizenin %40 ını alır
        fnl=fnl*60/100; //finalin %60 ını alır
        double ortalama=vize+fnl; //vize ve finalin ortalamasını hesaplar
        
        if(ortalama>=90 && ortalama<=100){
            System.out.print("Harf notunuz: AA/MÜKEMMEL");
        }
        else if (ortalama>=85 && ortalama<=89){
            System.out.print("BA/PEKİYİ");
        }
        else if(ortalama>=75 && ortalama<=84){
            System.out.print("BB/İYİ");
        }
        else if(ortalama>=70 && ortalama<=74){
            System.out.print("CB/ORTA");
        }
        else if(ortalama>=60 && ortalama<=69){
            System.out.print("CC/GEÇER");
        }
        else if(ortalama>=50 && ortalama<=59){
            System.out.print("DC/ŞARTLI GEÇECEK");
        }
        else if(ortalama>=40 && ortalama<=49){
            System.out.print("DD/ŞARTLI GEÇER");
        }
        else if(ortalama>=30 && ortalama<=39){
            System.out.print("FD/BASARISIZ");
        }
        else if(ortalama>=0 && ortalama<=29){
            System.out.print("FF/BAŞARISIZ");
        }
    }
    
    public static void dersKayit()
    {
        Scanner ogrenci=new Scanner(System.in);
         System.out.println("1.Nesne Tabanlı Programlama");
         System.out.println("2.Veri Tabanı");
         System.out.println("3.İşletim Sistemi");
         System.out.println("4.Finansman");
         System.out.print("Kayıt olmak istediğiniz dersi seçiniz:");
                int kayit=ogrenci.nextInt();
                if(kayit==1){ //Nesne tabanlı programlama seçildi ise
                    System.out.println("Nesne Tabanlı Programlama Dersine Başarıyla Kaydoldunuz.");
                    
                }
                else if(kayit==2){ //veri tabanı dersi seçildi ise
                    System.out.println("Veri Tabanı Dersine Başarıyla Kaydoldunuz.");
                    
                }
                else if(kayit==3){ //işletim sistemi dersi seçildiyse
                    System.out.println("İşletim Sistemi Dersine Başarıyla Kaydoldunuz.");
                }
                else if(kayit==4){ //fınansman dersi seçildiyse
                    System.out.println("Finansman Dersine Başarıyla Kaydoldunuz.");
                }
    }
    public static void dersProgrami(){
         System.out.println("DERS PROGRAMINIZ:");
         System.out.println("Pazartesi:14.00-17.00 Finansman");
         System.out.println("Salı:12.30-15.30 Matematik");
         System.out.println("Çarşamba:11.00-13.00 İstatistik");
         System.out.println("Perşembe:-");
         System.out.println("Cuma:12.00-14.00 Veri Tabanı");
         System.out.println("Cumartesi:09.00-12.00 Nesne Tabanlı Programlama");
         System.out.println("Pazar:-");
    }
    public static void onlineDersler(){
        System.out.println("Online Dersleriniz:");
        System.out.println("Sosyal Sorumluluk ve Etik");
        System.out.println("Türk Dili ve Edebiyatı");
    }
    public static void duyurular(){
        System.out.println("Duyurular");
         System.out.println("Veri Tabanı Dersi:2.nci quiz 12.nci hafta yapılacaktır.(3 aralık-7 aralık)ilgili öğrencilere duyurulur.");
          System.out.println("İstatistik Dersi:çarşamba günü(20.12.2018)tarindeki ders aynı gün saat 9.00 (dokuz)da yapılacaktır.ilgili öğrencilere duyurulur.sabah saat 8.00 de ders olmayacaktır.");
                
    }
    public static void sinavProgrami(){
                    System.out.println("Sınav Programınız:");
                    System.out.println("12.11.2018\n" +
                    "Saat	Derslik	Ders Adı\n" +
                    "10:00	H6044	MFY269 İŞLETME FİNANSMANI");
                    System.out.println("14.11.2018\n" +
                    "Saat	Derslik	Ders Adı\n" +
                    "10:00	D2409	ISF269 İSTATİSTİK");
                    System.out.println("16.11.2018\n" +
                    "Saat	Derslik	Ders Adı\n" +
                    "12:00	D2230	UYB201 NESNE YÖNELİMLİ PROGRAMLAMA");
                    System.out.println("17.11.2018\n" +
                    "Saat	Derslik	Ders Adı\n" +
                    "12:00	D2230	UYB208 VERİ TABANI");
                    System.out.println("18.11.2018\n" +
                    "Saat	Derslik	Ders Adı\n" +
                    "12:00	D2230	UYB210 MATEMATİK");
                    
    }
    public static void anketler(){
        Scanner ogrenci=new Scanner(System.in);
        System.out.println("1.Genel Ders Değerlendirmesi");
                   System.out.println("2.Danışman Değerlendirmesi");
                    System.out.print("Hangisini Değerlendirmek İstersiniz?");
                  int degerlendirme=ogrenci.nextInt();
                  if(degerlendirme==1){ //Ders degerlendirme formu
                      System.out.println("Dersinize Giren Öğretim Üyeleri Dersinize Yeterınce Hakim mi?");
                      String s1=ogrenci.next();
                      System.out.println("Anlayamadığınız Konuları Hocanıza Rahatlıkla Sorabiliyor musunuz?");
                      String s2=ogrenci.next();
                      System.out.println("Ankete Katıldığınız İçin Teşekkürler. Verdiğiniz Bilgileri Göz Önünde Bulunduracağız.");
                  }
                  else if(degerlendirme==2){ //Danısman hoca degerlendirme formu
                      System.out.println("Danışman Hocanızla Görüşme Sıklığınız nedir?");
                      String s3=ogrenci.next();
                      System.out.println("Danışman Hocanızla İletişiminizden Memnun musunuz?");
                      String s4=ogrenci.next();
                      System.out.println("Ankete Katıldığınız İçin Teşekkürler. Verdiğiniz Bilgileri Göz Önünde Bulunduracağız.");
                  }
    }
    
    public static void finansalİslemler(){
        Scanner ogrenci=new Scanner(System.in);
        System.out.println("Ödemeniz Gereken Tutar:7000");
                       System.out.println("1.Online Para Yatırma");
                       System.out.println("2.Elden Para Yatırma");
                         System.out.print("Ödemeyi Nasıl Yapmak İstediğinizi Seçiniz.");
                         int odeme=ogrenci.nextInt();
                if(odeme==1){
                System.out.print("Ödemenizin Ne Kadarını Gerçekleştirmek İstersiniz?");
                          int miktar=ogrenci.nextInt();
                if(miktar<7000){ //odenecek miktar istenen miktardan küçük olmalı
                System.out.print("Kart Numaranızı Giriniz:");
                           int kart=ogrenci.nextInt();
                           String onay="onay";
                            System.out.println("Ödemeyi Onaylamak İçin Onay Yazınız:");
                           String onay1=ogrenci.next();
                if(onay1.equals(onay)){ //onay verildi ise
                                System.out.println("İşleminiz Gerçekleştirildi.");
                               System.out.println("Geriye Kalan Ödenecek Tutarınız:" + (7000-miktar));
                           } 
                           else{
                                System.out.println("İşleminiz Gerçekleştirilemedi.");
                           }
                }
                else { //Ödenecek tutar yanlış girildi ise
                System.out.println("Ödenecek tutarı hatalı girdiniz. İyi günler.");
                
                }
                }
                else if (odeme==2){ //Nakit Ödeme ise
                 System.out.print("Banka Hesap Numaramız");
                           System.out.println(" 123 – 1234567 891 00");
                }
    }
    public static void belgeTalebi(){
        Scanner ogrenci=new Scanner(System.in);
        System.out.println("1.Öğrenci Belgesi");
        System.out.println("2.Transkript");
        System.out.print("İstediğiniz Belgenin Numarasını Yazınız.");
        int belge=ogrenci.nextInt();
        System.out.println("Talebiniz alınmıştır. İstenilen belge hazırlandığında tarafınıza bilgi verilecektir.");
    }
    public static void devamsizlik(){
        System.out.println("Herhangi bir devamsızlık bilginiz bulunmamaktadır.");
    }
    public static void danismanBilgileri(){
                      System.out.println("Danışman Bilgileri:");
                      System.out.println("Dr. Öğr. Üyesi İSMAİL CEM AY:");
                      System.out.println("Mail:ismailay@aydin.edu.tr");
                      System.out.println("Ofis : A Blok 2. Kat A1304 Nolu Ofis");
    }
    public static void akademikTakvim(){
        System.out.println("GÜZ YARIYILI");
                      System.out.println("Yatay Geçiş Başvuru Tarihleri 02.07.2018 - 15.08.2018");
                      System.out.println("Yatay Geçiş Sonuçlarının İlanı 29.08.2018");
                      System.out.println("Ders Kayıt İşlemleri 10.09.2018 - 19.09.2018");
                      System.out.println("Oryantasyon Programı 17.09.2018 - 19.09.2018");
                      System.out.println("Derslerin Başlaması 17.09.2018");
                      System.out.println("Ara Sınavlar 10.11.2018 - 18.11.2018");
                      System.out.println("Yarıyıl Sonu (Final) Sınavları 02.01.2019 - 13.01.2019");
                      System.out.println("Bütünleme Sınavları 21.01.2019 - 27.01.2019");
                      System.out.println("Mezuniyet İçin Not Yükseltme ve Tek Ders Sınavları 31.01.2019 - 01.02.2019");
                      System.out.println("BAHAR YARIYILI");
                      System.out.println("Yatay Geçiş Başvuru Tarihleri 14.01.2019 - 25.01.2019");
                      System.out.println("Yatay Geçiş Sonuçlarının İlanı 30.01.2019");
                      System.out.println("Ders Kayıt İşlemleri 31.01.2019 - 06.02.2019");
                      System.out.println("Derslerin Başlaması 04.02.2019");
                      System.out.println("Ara Sınavlar 30.03.2019 - 07.04.2019");
                      System.out.println("Yarıyıl Sonu(Final )Sınavları 20.05.2019- 31.05.2019");
                      System.out.println("Bütünleme Sınavları 10.06.2019 - 16.06.2019");
                      System.out.println("Mezuniyet İçin Not Yükseltme ve Tek Ders Sınavları 27.06.2019 - 28.06.2019");
                      
    }
    public static void islemler(){
                System.out.println("1.Kişisel Bilgiler");
                System.out.println("2.Ortak Dersler");
                System.out.println("3.Ortalama Hesaplama");
                System.out.println("4.Ders Kayıt İşlemleri");
                System.out.println("5.Ders Programı");
                System.out.println("6.Online Dersler");
                System.out.println("7.Duyurular");
                System.out.println("8.Sınav Programı");
                System.out.println("9.Anketler");
                System.out.println("10.Finans Bilgilerim/İşlemlerim");
                System.out.println("11.Belge Talebi");
                System.out.println("12.Devamsızlık Bilgilerim");
                System.out.println("13.Danışman Bilgileri");
                System.out.println("14.Akademik Takvim");
                System.out.println("15.Sınav Sonuçlarım");
    }
    public static void sonuclar(){
        System.out.println(" SOSYAL SORUMLULUK VE ETİK");
        System.out.println("Vize" +" " + "Final" + " "+ "Quiz" + " " +"Odev" );
        System.out.println("70" + " " + " "+ " "+ " " + "65" + " "+ " "+ " "+ " "+ "80"+ " "+ " " + " " +"72");
        
        System.out.println(" İSTATİSTİK");
        System.out.println("Vize" +" " + "Final" + " "+ "Quiz" + " " +"Odev" );
        System.out.println("50" + " " + " "+ " "+ " " + "55" + " "+ " "+ " "+ " "+ "80"+ " "+ " " + " " +"75");
        
        System.out.println(" NESNE TABANLI PROGRAMLAMA");
        System.out.println("Vize" +" " + "Final" + " "+ "Quiz" + " " +"Odev" );
        System.out.println("77" + " " + " "+ " "+ " " + "90" + " "+ " "+ " "+ "100"+ " "+ " "+"100");
        
        System.out.println(" VERİ TABANI");
        System.out.println("Vize" +" " + "Final" + " "+ "Quiz" + " " +"Odev" );
        System.out.println("80" + " " + " "+ " "+ " " + "65" + " "+ " "+ " "+ " "+ "80"+ " "+ " " + " " +"72");
        
        System.out.println(" MATEMATİK");
        System.out.println("Vize" +" " + "Final" + " "+ "Quiz" + " " +"Odev" );
        System.out.println("70" + " " + " "+ " "+ " " + "65" + " "+ " "+ " "+ " "+ "80"+ " "+ " " + " " +"-");
        
        System.out.println(" İŞLETME FİNANSMANI");
        System.out.println("Vize" +" " + "Final" + " "+ "Quiz" + " " +"Odev" );
        System.out.println("50" + " " + " "+ " "+ " " + "80" + " "+ " "+ " "+ " "+ "80"+ " "+ " " + " " +"72");
        
    }
    public static void main(String[] args) {
        KisiselBilgiler();
}
    
}
        // TODO code application logic here
    
    
