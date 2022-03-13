package inheritance;//miras

public class Main {

    public static void main(String[] args) {


        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber = "15560";
        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "30989";

        SendikaCustomer BBDK = new SendikaCustomer();
        BBDK.customerNumber = "23234";

        CustomerManager customerManager = new CustomerManager();

        Customer[] customers ={engin,hepsiBurada,BBDK};
       customerManager.addMultiple(customers);

    }
}
