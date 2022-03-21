package homeTask2;

public class Instructor extends User {
    /* super() metodunun kullanılışı:

          alt-sınıf, super() metodunu kullanarak

          üst-sınıfın bir nesnesini yaratabilir ve

          onun değişkenlerine değer atayabilir.

       */
    private String branch;

    public Instructor(int id, String firstName, String lastName, String password, String branch) {
        super(id, firstName, lastName, password);
        this.branch = branch;
    }
}
