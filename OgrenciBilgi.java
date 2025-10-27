/*
 * Ad Soyad: Ömer Ensar Şahin
 * Ogrenci No: 250542022
 * Tarih: 27.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        Scanner input = new Scanner(System.in);
            
            System.out.print("Adinizi Girin:  ");
            String ad = input.nextLine();
            
            System.out.print("Soyadinizi Girin:  ");
            String soyad = input.nextLine();
            
            System.out.print("Ogrenci Numaranizi Girin:  ");
            int ogrNo = input.nextInt();
            
            System.out.print("Yasinizi Girin:  ");
            int yas = input.nextInt();
            
            System.out.print("GPA (0.00 - 4.00):  ");
            double gpa = input.nextDouble();
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        
        
        // Soyad
        
        
        // Ogrenci No
        
        
        // Yas
        
        
        // GPA
        
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
            System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
            System.out.printf("Ogrenci No: %d%n", ogrNo);
            System.out.printf("Yas %d%n", yas);
            System.out.printf("Not Ortalamasi (GPA): %.2f%n", gpa);
        
            input.close();

        
        // Scanner'i kapatin (önemli pratik)
        
    }
}
