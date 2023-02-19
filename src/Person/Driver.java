package Person;

public class Driver extends Person {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void working() {
        System.out.println("Driver working in the car ");
    }
}



