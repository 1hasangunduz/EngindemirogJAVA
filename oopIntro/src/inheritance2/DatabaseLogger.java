package inheritance2;

public class DatabaseLogger extends Logger {
    @Override //: bu aslında logger da varda ben onu eziyorum demek.
    public void log() {
        System.out.println("Database Loglandı.");
    }
}
