
public class KrediKarti implements KartTipi {
        public void create() {
             System.out.println("Kredi kartı oluşturuldu");
        }
          Demo d=new Demo();
          
          @Override
        public double maas(double maasgirin) {
            if (maasgirin <= 1000) {
                System.out.println("Kredi kartı başvurusu yapamazsınız.Maaş tutarınız yeterli değildir.");
                d.i=0;

            } else {
                System.out.println("Kredi kartı oluşturuldu.");
                System.out.println("Kart limitiniz:" + (maasgirin + 500) + " TL olarak belirlenmiştir.");
            }
        return 0;
        }

}
