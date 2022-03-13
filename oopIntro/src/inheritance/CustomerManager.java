package inheritance;

public class CustomerManager {

    //overloading : iki aynı isim verip farklı parametre alma.
    public void add(IndividualCustomer customer) {
        System.out.println(customer.customerNumber + "kaydedildi.");
    }

    public void add(CorporateCustomer customer) {
        System.out.println(customer.customerNumber + "kaydedildi.");
    }
}
