package inheritance;

public class CustomerManager {

    //overloading : iki aynı isim verip farklı parametre alma.
    public void add(Customer customer) {
        System.out.println(customer.customerNumber + "-> kaydedildi.");
    }

    //Bulk Insert
    public void addMultiple(Customer[] customers) {
        //gönderilen her müşteriyi gezecek ve add'i çalıştırıcak.
        for(Customer customer:customers){
            add(customer);
        }

    }
}
//SOLID - Open closed principle buradaki yapı.