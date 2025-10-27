/*
 * Ad Soyad: Ömer Ensar Şahin
 * Ogrenci No: 250542022
 * Tarih: 27.10.2025
 * Aciklama: Gorev 2 - Geometrik Hesap
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */
import java.util.Scanner;
    public class GeometrikHesap{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            final double PI= 3.14159;
            
            System.out.println("=== GEOMETRIK HESAPLAYICI ===");
            System.out.print("Dairenin yaricapini girin (cm):  ");
            double r = input.nextDouble();
            
            double DaireAlani = PI * r * r;
            double DaireCevresi = 2 * PI * r;
            double DaireCapi = 2 * r;
            double kureHacmi = (4.0/3.0) * PI * Math.pow(r, 3);
            double KureYuzeyAlani = 4 * PI * r * r;
            
            System.out.println("\nSONUCLAR:");
            System.out.println("----------");
            System.out.printf("Daire Alani        : %.2f cm^2%n", DaireAlani);
            System.out.printf("Daire Cevresi      : %.2f cm%n", DaireCevresi);
            System.out.printf("Daire Capi         : %.2f cm%n", DaireCapi);
            System.out.printf("Kure Hacmi         : %.2f cm^3%n", kureHacmi);
            System.out.printf("Kure Yüzey Alani   : %.2f cm^2%n", KureYuzeyAlani);
         
            input.close();   
        }
    }
