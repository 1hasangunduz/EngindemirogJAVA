package oopintro;


public class Training {


    public static void main(String[] args) {

        int number = 2;

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("sayı asaldır.");
        } else System.out.println("sayı asal değildir.");










    /*    String message = "Bugün hava çok güzel.";

        String newMessage = message.replace(" ", "-"); //REPLACE : örnek olarak bir blok sistem var ,buradaki ismi url'ye vericez bu kullanılabilir.
        System.out.println(newMessage);
        System.out.println("-------------");

        System.out.println(message.substring(2)); //2.indexe kadar kes.
        System.out.println(message.substring(2,5)); //2 ile 5 arasındaki indexe kadar kes.
        System.out.println("-------------");

        for(String words:message.split(" ")){ //boşluktan sonraki elemanları teker teker yazdırdım.
            System.out.println(words);
            System.out.println("-------------");

            System.out.println(message.toLowerCase()); //DB ile ilgili sıkıntı olabilir büyük küçük harf için büyük harfleri küçük harflere çevirdik.
        }
        System.out.println(message.toUpperCase());

        System.out.println("-------------");
        System.out.println(message.trim()); //başındaki ve sonundaki istediğim şeyleri kaldırır.
*/


    }
}
