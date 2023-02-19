package Person;

public class Programmer extends Person {

    public Programmer(String name) {
        super(name);
    }


   @Override
    public void working() {
        System.out.println("Programmer working in computer");
    }
}