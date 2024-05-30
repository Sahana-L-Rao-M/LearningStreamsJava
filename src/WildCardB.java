import java.util.*;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
class Employee extends Person {
    public Employee(String name) {
        super(name);
    }
}
public class WildCardB {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(Arrays.asList(new Person("P1"), new Person("P2")));
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(new Employee("E1"), new Employee("E2")));
        List<String> stringList =new ArrayList<>( Arrays.asList("S1", "S2"));

        UnboundedWildcardExample.printList(personList);
        UnboundedWildcardExample.printList(employeeList);
        UnboundedWildcardExample.printList(stringList);

//        UpperBoundedWildcardExample.printPeople(personList);
//        UpperBoundedWildcardExample.printPeople(employeeList);
//        UpperBoundedWildcardExample.printPeople(stringList);

//        List<Object> objectList = new ArrayList<>();
//        LowerBoundedWildcardExample.addEmployees(personList);
//        System.out.println(objectList);
//        LowerBoundedWildcardExample.addEmployees(objectList);
//        System.out.println(objectList);
    }
}
//


class UnboundedWildcardExample {
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

}

class UpperBoundedWildcardExample {
            public static void printPeople(List<? extends Person> list) {
                for (Person person : list) {
                    System.out.println(person);
                }
            }
}


class LowerBoundedWildcardExample {
    public static void addEmployees(List<? super Person> list) {
        list.add(new Person("Eve"));
        list.add(new Person("Frank"));
    }
}


