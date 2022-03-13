package oopintro;

public class ProductManager {

    public  void addToCart(Product product){
        System.out.println(product.getId()+" Sepete ekleme kodu çağırıldı. "+product.getName());

    }
}
