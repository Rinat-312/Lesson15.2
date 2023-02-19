package Person;

public class Builder extends Person {
    public Builder(String name) {
        super(name);
    }

    @Override
    public void working() {
        System.out.println("Builder working on construction site ");
    }
}
