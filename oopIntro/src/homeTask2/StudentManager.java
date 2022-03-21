package homeTask2;

public class StudentManager extends UserManager {

    public void Add(User user) {
        super.Add(user);
    }

    @Override
    public void Delete(User user) {
        super.Delete(user);
    }

    @Override
    public void Update(User user) {
        super.Update(user);
    }

    public void JoinCourse(User user) {
        System.out.println("Kursa katılım sağlandı..");
    }
}
