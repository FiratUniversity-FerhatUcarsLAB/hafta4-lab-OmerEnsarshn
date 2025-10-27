/*
 * Ad Soyad: Ömer Ensar Şahin
 * Ogrenci No: 250542022
 * Tarih: 27.10.2025
 * Aciklama: Gorev 3 - Maaş Hesap
 * Bu program, kullanıcının girdiği brüt maaş, haftalık çalışma saati ve mesai saatine göre maaş bordrosu oluşturarak tüm gelir, kesinti ve net maaş hesaplamalarını yapar.
 * Ayrıca, kesinti oranı, saatlik ve günlük net kazanç gibi istatistikleri de formatlı bir şekilde ekrana yazdırır.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */
import java.util.Scanner;
    public class MaasHesap{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            final double SGK_ORANI = 0.14;
            final double GELIR_VERGISI_ORANI = 0.15;
            final double DAMGA_VERGISI_ORANI = 0.00759;
            
            System.out.print("Calisanin Adi Soyadi:  ");
            String adSoyad = input.nextLine();
            
            System.out.print("Aylik Brut Maas (TL):  ");
            double brutMaas = input.nextDouble();
            
            System.out.print("Haftalik Calisma Saati:  ");
            int haftalikSaat = input.nextInt();
            
            System.out.print("Mesai Saati Sayisi:  ");
            int mesaiSaati = input.nextInt();
            
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;
        
        double SGK = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = SGK + gelirVergisi + damgaVergisi;
        
        double netMaas = toplamGelir - toplamKesinti;
        
        double kesintiOrani = (toplamKesinti/toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176;
        double GunlukNetKazanc = netMaas / 22;
        
        System.out.println("n===== MAAS BORDROSU =====");
        System.out.printf("Ad Soyad: %s\n", adSoyad);
        System.out.printf("Brut Maas: %.2f TL\n", brutMaas);
        System.out.printf("Mesai Ucreti: %.2f TL\n", mesaiUcreti);
        System.out.printf("Toplam Gelir: %.2f TL\n", toplamGelir);

        System.out.println("\n--- Kesintiler ---");
        System.out.printf("SGK (%%14): %.2f TL\n", SGK);
        System.out.printf("Gelir Vergisi (%%15): %.2f TL\n", gelirVergisi);
        System.out.printf("Damga Vergisi (%%0.759): %.2f TL\n", damgaVergisi);
        System.out.printf("Toplam Kesinti: %.2f TL\n", toplamKesinti);

        System.out.println("\n--- Net Maas ---");
        System.out.printf("Net Maas: %.2f TL\n", netMaas);
        System.out.println("\n--- Istatistikler ---");
        System.out.printf("Kesinti Orani: %.1f%%\n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc: %.2f TL\n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc: %.2f TL\n", GunlukNetKazanc);
        System.out.println("==========================");
        
        input.close();
        
        }
    }
