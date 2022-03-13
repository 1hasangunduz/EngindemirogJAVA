package inheritance;//miras

public class Main {

    public static void main(String[] args) {


        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber = "15560";
        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "30989";

        CustomerManager customerManager = new CustomerManager();
        customerManager.add(engin);
        customerManager.add(hepsiBurada);
    }
}
