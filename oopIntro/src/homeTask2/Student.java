package homeTask2;

public class Student extends User {

    private String paymentCardInformation;

    public Student(int id, String firstName, String lastName, String password, String paymentCardInformation) {
        super(id, firstName, lastName, password);
        this.paymentCardInformation = paymentCardInformation;

    }
}
