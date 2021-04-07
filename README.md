# BANKA PROJESİ
#### Tasarım desenleri için yaptığım ilk örnek 
### Kullandığım desenler 
 - **Strategy Pattern**
 - **Factory Pattern**

 ### Ayrıntılar :
---

>Kendi kartımızı oluşturup bu kart üzerinde işlemler yapabileceğimiz bir banka projesi oluşturduk. Bu projede Yaratıcı Tasarım Deseni üyesi Factory Pattern ve Davranışsal Tasarım Deseni üyesi Strategy Pattern kullandık. 

>Factory Pattern nesnenin nasıl yaratılacağını kalıtım yoluyla alt sınıflara bırakıp nesne yaratımı için tek ara yüz kullanarak, ara yüzle nesne yaratım işlevlerini temelde birbirinden ayırmaya yarayan desendir. Factory Pattern kullanarak kart tipi ara yüzünden banka kartı ve kredi kartı oluşturduk. Bu iki farklı kart aynı ara yüzdeki fonksiyonları kendilerine göre kullanarak farklı çıktılar veriyorlar.
 
>Strategy Pattern bir dizi algoritma tanımlar, bu algoritmaların erişimi için ara yüz sağlar ve algoritmaları tanımlarken birbirlerinin yerine kullanılabilir özellikte tasarlar. Strategy Pattern kullanarak ara yüzden implement ettiğimiz sınıflar üzerinde kart tipine göre farklı işlemler yapıyoruz.

>Factory Pattern da KartTipi ara yüzünde create ve maaş fonksiyonlarını oluşturuyoruz. KartTipi seç sınıfından hangi kartı oluşturacak olduğumuzu seçmekteyiz. Banka kartı ve kredi kartı sınıflarını ara yüzden implement ettik ve fonksiyonları kart tipine göre düzenledik.  Strategy Pattern da Strategy isminde bir ara yüz oluşturduk. KrediKartıBakiyeGör ve BankaKartıBakiyeGör adında iki tane fonksiyon oluşturduk. Ardından ParaCek, ParaYatır, TaksitleOdeme ve ParaTransferi sınıflarını implement ettik. Durum sınıfında ara yüzden nesne üretip ara yüzdeki fonksiyonlara ulaştık. Demo da ise main fonksiyonunun içinde kart oluşturup, oluşturduğumuz kartlar üzerinde işlemler gerçekleştirebiliyoruz.















































