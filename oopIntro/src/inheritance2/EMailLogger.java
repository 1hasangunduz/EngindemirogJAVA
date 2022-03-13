package inheritance2;

public class EMailLogger extends Logger { //email sende bir loggersın dedik.
    @Override //loggerdakini ezdi.
    public void log() {
        System.out.println("Email Loglandı..");
    }
}
