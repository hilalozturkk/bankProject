
public  class ParaYatir implements Strategy {

        @Override
        public double KrediKartiBakiyegor(double bakiye, double girilenMiktar) {

        return bakiye + girilenMiktar;
            }


        public double BankaKartiBakiyeGor(double bakiye, double girilenMiktar) {

        return bakiye + girilenMiktar;
             }
}
