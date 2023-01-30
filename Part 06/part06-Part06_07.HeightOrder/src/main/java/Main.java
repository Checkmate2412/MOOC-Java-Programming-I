
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room r = new Room();
        Person first = new Person("first", 1);
        Person second = new Person("second", 2);
        Person third = new Person("third", 3);

        r.add(first);
        r.add(second);
        r.add(third);

        Person shortestPerson = r.shortest();
        System.out.println(shortestPerson);
    }
}
