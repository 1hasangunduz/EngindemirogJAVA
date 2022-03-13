package inheritance2;
//bir birlerinin alternatifi olan kodlar if ile yönetilmez.
public class LogManager {
    public void log(int logType) {
        if (logType == 1) {
            System.out.println("Veritabanına loglandı.");
        } else if (logType == 2) {
            System.out.println("Dosyaya loglandı.");
        } else
            System.out.println("email gönderildi.");
    }

}
// 1- Database
//2 - File
//3 - EMail