

public class KartTipiSec {
    public KartTipi getKartTipi(String sec) {
    if (sec == "Kredi Kartı") {
          return new KrediKarti();

    }
   
    else if (sec == "BankaKarti") {
           return new BankaKarti();

    }
   
    else
    return null;
   
    }
}
