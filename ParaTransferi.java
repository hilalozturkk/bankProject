
public class ParaTransferi implements Strategy {

        @Override
        public double KrediKartiBakiyegor(double bakiye, double girilenMiktar) {

            System.out.println("Transfer edilen miktar:"
            +girilenMiktar+"\nKesilen ücret:"+girilenMiktar / 100 * 5+
            "\nBakiyeniz:"+ (bakiye-girilenMiktar-(girilenMiktar / 100 * 5)) );
            return bakiye-girilenMiktar-(girilenMiktar / 100 * 5);
         }

         
        @Override
        public double BankaKartiBakiyeGor(double bakiye, double girilenMiktar) {
            System.out.println("Mevcut bakiyeniz:"+(bakiye-girilenMiktar));
            return bakiye-girilenMiktar;
        }
}
