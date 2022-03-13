package inheritance2;

public class CustormerManager {
    public void add(Logger logger){
        //müşteri ekleme kodları.
        System.out.println("Müşteri eklendi.");

        logger.log();

    }
}
//NOTE: iş yapan classlara somut sınıf denir ve ASLA new 'lenmez o koddan hayır gelmez.(databaselogger, filelogger gibi)