package inheritance;//miras demektir.

//ünlü bir coder engin demiroğ çok üstünde durdu ; Polimorfizm (çok biçimlilik); bir türün başka bir tür gibi davranabilme ve bu tür gibi kullanılabilme özelliğinden kaynaklanır.
// Nesne yönelimli programlama dillerinde çok biçimcilik özelliği de yine aynı temel sınıftan türetilmiş olan sınıflarda paylaşılan bir uygulamadır.
//Diğer bir ifadeyle aşırı yüklenen aynı metodun diğer sınıflara farklı şekillerde uyarlanabilmesidir. Nesnenin davranışı, çalışma anında belirlenir.
// Bu nedenle pek çok programcı, çok biçimcilik özelliği sayesinde nesnelerin türünü önceden bilmesi gerekmez.
// Polimorfizm, pek çok işlemi oldukça kolaylaştıran bir kavramdır. Bir nesnenin birden fazla nesne gibi davranmasına Polimorfizm denir.

public class Main {

    public static void main(String[] args) {


        IndividualCustomer hasan = new IndividualCustomer();
        hasan.customerNumber = "15560";
        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "30989";

        SendikaCustomer BBDK = new SendikaCustomer();
        BBDK.customerNumber = "23234";

        CustomerManager customerManager = new CustomerManager();

        Customer[] customers = {hasan, hepsiBurada, BBDK};

        customerManager.addMultiple(customers);

    }
}
