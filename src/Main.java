import Person.Person;
import Person.Programmer;
import Person.Driver;
import Person.Builder;


public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Nick");
        Person.setAge(25);
        System.out.println(programmer + ",  Age=" + Person.getAge());
        programmer.working();

        System.out.println("----------------------------------------");
        Driver driver = new Driver("Tom");
        Person.setAge(30);
        System.out.println(driver + ",   Age=" + Person.getAge());
        driver.working();

        System.out.println("-------------------------------------------");
        Builder builder = new Builder("Bob");
        Person.setAge(40);
        System.out.println(builder + ",   Age="+Person.getAge());
        driver.working();


    }
}