import java.util.Scanner;


public class Demo {
    public static int i = 1;
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        while (i == 1) {
            
            double paraYatirmaTutari = 0.0, paraCekme = 0.0, bakiye = 0.0, paraTransfer = 0.0,
            taksitliparatransfer = 0.0;

            int kartSec, islemSec = 0;

            float kartNo, olusturulanBakiye, olusturulanKartNo;

            String olusturulanad, olusturlanSoyad;

            Kisiler kisiler = new Kisiler(11111111, "Hilal", "Öztürk", 50000);

            KartTipiSec sf = new KartTipiSec();// kart oluştur

            Durum durum = new Durum(new ParaCek());
            Durum durum1 = new Durum(new ParaYatir());
            Durum durum2 = new Durum(new ParaTransferi());
            Durum durum3 = new Durum(new TaksitIleOdeme());

            System.out.println(
            "Mevcut bir karta işlem yapmak için 1'e basınız.\n" + "Yeni kart oluşturmak için 2'ye basınız.");

            islemSec = scanner.nextInt();

            if (islemSec == 1) {
                System.out.println("Kart numaranızı giriniz.");
                kartNo = scanner.nextFloat();
                if (kartNo == kisiler.numara) {
                    System.out.println("Mevcut bakiyeniz:" + kisiler.bakiye + "\n"
                    + "Yapmak istediğiniz işlemi seçin:\nPara yatırmak için 1'e\n"
                    + "Para çekmek için 2'ye basınız.\n" + "Para transferi için 3'e basınız.\n");
                    islemSec = scanner.nextInt();
                    if (islemSec == 1) {
                        System.out.println("Yatirmak istediğiniz tutarı giriniz.");
                        paraYatirmaTutari = scanner.nextDouble();

                        System.out.println("Yatırılan tutar:" + paraYatirmaTutari + "\nToplam bakiye:"
                        + durum1.banka(kisiler.bakiye, paraYatirmaTutari));

                    } 
                    else if (islemSec == 2) {
                        System.out.println("Çekmek istediğiniz tutarı giriniz.");
                        paraCekme = scanner.nextDouble();

                        System.out.println("Çekilen tutar:" + paraCekme + "\nToplam bakiye:"
                        + durum.banka(kisiler.bakiye, paraCekme));

                    } 
                    
                    else if (islemSec == 3) {
                        System.out.println("Transfer etmek istediğiniz tutarı giriniz.");
                        paraTransfer = scanner.nextDouble();
                        durum2.banka(kisiler.bakiye, paraTransfer);

                    }
                } 
                
                else {
                System.out.println("Girdiğiniz kart numarası yanlış.Tekrar deneyiniz.");
                }
            }

            else if (islemSec == 2) {

            System.out.println("Oluşturmak istediğiniz Kart tipini seçin :\n" + "Kredi kartı için 1'e\n"
            + "Banka Kartı için 2'ye basın");
            kartSec = scanner.nextInt();

            if (kartSec == 1) {
                System.out.println("İsim giriniz:");
                olusturulanad = scanner.next();
                System.out.println("Soy isminizi giriniz:");
                olusturlanSoyad = scanner.next();

                olusturulanKartNo = 11111112;
                System.out.println("Bakiyenizi belirleyiniz.");
                olusturulanBakiye = scanner.nextFloat();

                Kisiler kisiler2 = new Kisiler(11111111, olusturulanad, olusturlanSoyad, olusturulanBakiye);
                KartTipi kartTipi = sf.getKartTipi("Kredi Kartı");
                kartTipi.maas(kisiler2.bakiye);
                if (i == 1) {
                    System.out.println("Bilgileriniz:\n" + "İsim:" + kisiler2.name + "\nSoyİsim:" + kisiler2.soyIsim);
                    System.out.println("Mevcut bakiyeniz:" + kisiler2.bakiye + "\n"
                    + "Yapmak istediğiniz işlemi seçin:\nPara yatırmak için 1'e\n"
                    + "Para çekmek için 2'ye basınız.\n" + "Para transferi için 3'e basınız.\n"
                    + "Taksit ile ödeme yapmak için 4'e basınız.\n");
                    islemSec = scanner.nextInt();
                    if (islemSec == 1) {
                        System.out.println("Yatirmak istediğiniz tutarı giriniz.");
                        paraYatirmaTutari = scanner.nextDouble();

                        System.out.println("Yatırılan tutar:" + paraYatirmaTutari + "\nToplam bakiye:"
                        + durum1.kredi(kisiler2.bakiye, paraYatirmaTutari));

                    } 
                    else if (islemSec == 2) {
                        System.out.println("Çekmek istediğiniz tutarı giriniz.");
                        paraCekme = scanner.nextDouble();

                        System.out.println("Çekilen tutar:" + paraCekme + "\nToplam bakiye:"
                        + durum.kredi(kisiler2.bakiye, paraCekme));

                        } 
                    else if (islemSec == 3) {
                        System.out.println("Transfer etmek istediğiniz tutarı giriniz.");
                        paraTransfer = scanner.nextDouble();

                        durum2.kredi(kisiler2.bakiye, paraTransfer);

                         } 
                    else if (islemSec == 4) {
                        System.out.println("Taksitle ödenecek tutar giriniz.");
                        taksitliparatransfer = scanner.nextDouble();

                        durum3.kredi(kisiler2.bakiye, taksitliparatransfer);
                        }
                    } 
                    
                else {
                    System.out.println("Çıkış yapılıyor..");
                    }
                }

                else if (kartSec == 2) 
                {
                    System.out.println("İsim giriniz:");
                    olusturulanad = scanner.next();
                    System.out.println("Soy isminizi giriniz:");
                    olusturlanSoyad = scanner.next();

                    olusturulanKartNo = 11111113;
                    System.out.println("Bakiyenizi belirleyiniz.");
                    olusturulanBakiye = scanner.nextFloat();
                    Kisiler kisiler3 = new Kisiler(11111111, olusturulanad, olusturlanSoyad, olusturulanBakiye);
                    KartTipi kartTipi = sf.getKartTipi("BankaKarti");
                    kartTipi.create();
                    System.out.println("Bilgileriniz:\n" + "İsim:" + kisiler3.name + "\nSoyİsim:" + kisiler3.soyIsim);

                    System.out.println("Mevcut bakiyeniz:" + kisiler3.bakiye + "\n"
                    + "Yapmak istediğiniz işlemi seçin:\n" + "Para yatırmak için 1'e\n"
                    + "Para çekmek için 2'ye basınız.\n" + "Para transferi için 3'e basınız.\n");
                    islemSec = scanner.nextInt();
                    if (islemSec == 1) {
                        System.out.println("Yatirmak istediğiniz tutarı giriniz.");
                        paraYatirmaTutari = scanner.nextDouble();

                        System.out.println("Yatırılan tutar:" + paraYatirmaTutari + "\nToplam bakiye:"
                        + durum1.banka(kisiler3.bakiye, paraYatirmaTutari));

                    } 
                    else if (islemSec == 2) {
                        System.out.println("Çekmek istediğiniz tutarı giriniz.");
                        paraCekme = scanner.nextDouble();

                        System.out.println("Çekilen tutar:" + paraCekme + "\nToplam bakiye:"
                        + durum.banka(kisiler3.bakiye, paraCekme));

                    } 
                    else if (islemSec == 3) {
                        System.out.println("Transfer etmek istediğiniz tutarı giriniz.");
                        paraTransfer = scanner.nextDouble();

                        System.out.println("Transfer edilen tutar:" + paraTransfer + "\nToplam bakiye:"
                        + durum2.banka(kisiler3.bakiye, paraTransfer));

                    } 
                    else if (islemSec == 4) {
                        System.out.println("Taksitle ödenecek tutar giriniz.");
                        taksitliparatransfer = scanner.nextDouble();
                        System.out.println("\nToplam bakiye:" + durum3.banka(kisiler3.bakiye, taksitliparatransfer));
                    }
            }

            else {
            System.out.println("Mevcut bir işlem seçmediniz.");

            }
            }
        }
    }
}
