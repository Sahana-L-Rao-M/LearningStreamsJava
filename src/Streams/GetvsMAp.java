package Streams;

import java.util.NoSuchElementException;
import java.util.Optional;

public class GetvsMAp {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.of("John");
        Optional<String> emptyOptional = Optional.empty();

        // Using map
        Optional<String> upperCaseName = optionalName.map(String::toUpperCase);
        Optional<String> upperCaseEmpty = emptyOptional.map(String::toUpperCase);

        System.out.println(upperCaseName.orElse("Name not available"));
        System.out.println(upperCaseEmpty.orElse("Name not available"));

// Using get
        try {
            String name = optionalName.get();
            System.out.println(name);
        } catch (NoSuchElementException e) {
            System.out.println("No value present");
        }

        try {
            String name = emptyOptional.get();
            System.out.println(name);
        } catch (NoSuchElementException e) {
            System.out.println("No value present");
        }

    }
}
