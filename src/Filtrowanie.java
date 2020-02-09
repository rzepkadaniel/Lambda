import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filtrowanie {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("jan1", "Kowalski1"),
                new Person("jan4", "owalski4"),
                new Person("jan2", "Kowalski1"),
                new Person("jan3", "Kowalski3"),
                new Person("jan5", "Kowalski5")

        );
        // Strumien z kolekcji

        final Predicate<String> zaczynaSieNaKPredicate = s -> s.startsWith("K");
        people
                .stream()
                .map(person -> person.lastName)
                .filter(zaczynaSieNaKPredicate)
                .forEach(s -> System.out.println(s));

//        people.forEach(person -> System.out.println(person.name));
//        people.forEach(person -> System.out.println(person.lastName));
//
//        for (Person p: people) {
//            System.out.println(p.name);
//
//        }

    }
}
    class Person {
        String name;
        String lastName;

        public Person(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }
    }
