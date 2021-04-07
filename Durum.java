
public class Durum {
        
    private Strategy strategy;

        public Durum(Strategy strategy){
            this.strategy = strategy;
        }

    public double banka(double num1,double num2){
    return strategy.BankaKartiBakiyeGor(num1, num2);
    }
    public double kredi(double num1,double num2){
    return strategy.KrediKartiBakiyegor(num1, num2);
    }
}