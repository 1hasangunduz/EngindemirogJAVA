package homeTask2;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(1, "Hasan", "Gunduz", "123123", "111111111111");
        StudentManager studentManager = new StudentManager();
        studentManager.Add(student);
        studentManager.Delete(student);
        studentManager.Update(student);
        studentManager.JoinCourse(student);

        Instructor instructor = new Instructor(2, "Mualla", "Kedi", "452313", "Java and React.js");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.Add(instructor);
        instructorManager.Delete(instructor);
        instructorManager.Update(instructor);
        instructorManager.Update(instructor);
    }

}
