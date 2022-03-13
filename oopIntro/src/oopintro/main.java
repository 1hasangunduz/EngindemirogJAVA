package oopintro;

public class main {

    public static void main(String[] args) {
        //super(): basedekini çalıştırır.
        Product product1 = new Product();
        product1.setId(13);
        product1.setName("Acer Plur");
        product1.setUnitPrice(12000);
        product1.setDetail("1 TB memory & 12 GB RAM");
        product1.setDiscount(10);
        System.out.println(product1.getUnitPriceAfterDiscount());

        Product product2 = new Product();
        product2.setId(15);
        product2.setName("HP spicy");
        product2.setUnitPrice(12520);
        product2.setDetail("2 GB memory & 16 GB RAM");
        product2.setDiscount(12);
        System.out.println(product2.getUnitPriceAfterDiscount());

//        oopintro.Product[] products = {product1,product2};
//        for (oopintro.Product product: products) {
//            System.out.println(product.id+","+product.name+","+product.unitPrice+","+product.detail);
//        }

        Category category1 = new Category(1,"computer");
        Category category2 = new Category(2,"Züccaciye");

        Category category3= new Category();
        category3.setId(1);
        category3.setName( "hasan" );

        System.out.println(category1.getName());
        System.out.println(category2.getName()+" "+ category3.getName());
        Category[] categorys = {category1, category2,category3};
        for (Category category : categorys) {
            System.out.println(category.id + " , " + category.name);
        }
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);


    }
}

