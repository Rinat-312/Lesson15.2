package Person;

public class Person {
    private final String name;
    private static int age;

    public Person(String name) {
        this.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    public String getName() {
        return name;

    }


    public void working() {
        System.out.println("Person is working");
    }

    @Override
    public String toString() {
        return "Person name=" + name ;
    }

}


