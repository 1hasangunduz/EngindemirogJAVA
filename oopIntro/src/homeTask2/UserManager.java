package homeTask2;

import java.sql.SQLOutput;

public class UserManager {


    public void Add(User user) {

        System.out.println("Add User " + user.getFirstName() + " " + user.getLastName());

    }

    public void Delete(User user) {
        System.out.println("Delete User: " + user.getFirstName() + " " + user.getLastName());
    }

    public void Update(User user) {
        System.out.println("User güncelleme" + user.getFirstName() + " " + user.getLastName());
    }
}
