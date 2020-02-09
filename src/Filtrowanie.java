import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filtrowanie {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("aan1", "Kowalski1"),
                new Person("jan4", "owalski4"),
                new Person("oan2", "Kowalski1"),
                new Person("jan3", "Kowalski3"),
                new Person("jarek", "Kowalski5")

        );
        // Strumien z kolekcji

//        final Predicate<String> zaczynaSieNaKPredicate = s -> s.startsWith("K");
//        people
//                .stream()
//                .map(person -> person.lastName)
//                .filter(zaczynaSieNaKPredicate)
//                .forEach(s -> System.out.println(s));
        // utworzymy posortowana liczbe stringow (name + lastname z Person
        // odfiltrujemy zaczynajace sie na samogloske
        // stringi calosc wielka litera

        final Predicate<String> zaczynaSieSamogloska = s -> !s.startsWith("a");
        people
                .stream()
                .map(person -> person.name + " " + person.lastName)
                .filter(zaczynaSieSamogloska)
                .sorted()
                .forEach(s -> System.out.println(s.toUpperCase()));






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
