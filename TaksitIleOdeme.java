
public class TaksitIleOdeme implements Strategy {

        @Override
        public double KrediKartiBakiyegor(double bakiye, double girilenMiktar) 
        {

        if (girilenMiktar > 100) {
                System.out.println("12 ay taksite bölünüyor.\n Her ay kesilecek miktar:"+girilenMiktar/12+"TL'dir."
                +"Kalan bakiyeniz:"+(bakiye-girilenMiktar/12)+"TL'dir.");
                }
        else{
                System.out.println("6 ay taksite bölünüyor.\n Her ay kesilecek miktar:"+girilenMiktar/6+"TL'dir."
                +"Kalan bakiyeniz:"+(bakiye-girilenMiktar/6)+"TL'dir.");
                }
            return girilenMiktar;
        
        }

        @Override
        public double BankaKartiBakiyeGor(double bakiye, double girilenMiktar) {
        return bakiye;
        }
    }
