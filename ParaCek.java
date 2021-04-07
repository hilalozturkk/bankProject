
public class ParaCek implements Strategy {

        @Override
        public double KrediKartiBakiyegor(double bakiye, double girilenMiktar) {
            System.out.println("Kesilen miktar:"+girilenMiktar/100*1);
            return bakiye - girilenMiktar- (girilenMiktar/100*1);
        }

        @Override
        public double BankaKartiBakiyeGor(double bakiye, double girilenMiktar) {

        return bakiye - girilenMiktar;
        }

}

