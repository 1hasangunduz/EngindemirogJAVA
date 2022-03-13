package oopintro;

public class Category {

    public  int id;
    public String name;


    public Category() {

    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //void() ben bir şey döndürmeyeceğim bir şey yapacağım demek.
    public int getId() {  //Dışarıdan bir şey alacaksak.
        return id; //burada bana döndür diyoruz.
    }

    public void setId( int id) {
        this.id = id; //class'taki idyi , thisdeki id yaptık.
    }

    public String getName() {
        return name + "!";
    }

    public void setName(String name) {
        this.name = name;
    }

}
