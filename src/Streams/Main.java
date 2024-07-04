package Streams;
/*
* Optional-> container to hold null/not null objects
* Avoid NullPointerException
*
Optional.of(T value): Returns an Optional with the specified non-null value.
Optional.ofNullable(T value): Returns an Optional describing the specified value, or an empty Optional if the value is null.
Optional.empty(): Returns an empty Optional instance.
*
boolean isPresent(): Returns true if the value is present, otherwise false.
boolean isEmpty(): Returns true if the value is absent, otherwise false (available from Java
*
T get(): Returns the value if present; otherwise, throws NoSuchElementException.
T orElse(T other): Returns the value if present; otherwise, returns other.
T orElseGet(Supplier<? extends T> other): Returns the value if present; otherwise, returns the result produced by the supplying function.
T orElseThrow(): Returns the value if present; otherwise, throws NoSuchElementException.
T orElseThrow(Supplier<? extends X> exceptionSupplier): Returns the value if present; otherwise, throws an exception produced by the exception-supplying function.
*
*
* */

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        User user = new User();
//
//        String city = user.getAddress().getCity();
//        System.out.println("City: " + city);


        //empty Address
        UserHandled userHandled = new UserHandled();

        String city = userHandled.getAddress()
                .map(Address::getCity)
                .orElse("City not available");
        System.out.println("empty address: " + city);


        //initialised address
        userHandled.setAddress(Optional.of(new Address("New York")));

        city = userHandled.getAddress()
                .map(Address::getCity)
                .orElse("City not available");
        System.out.println("initialised address: City: " + city); // Outputs: New York


        //other address
        city = userHandled.getAddressNotInitialised()
                .map(Address::getCity)
                .orElse("City not available");
        System.out.println("address not initialised in class:  " + city);


        //is present
        System.out.println("IS present:: "+userHandled
                .getAddressNotInitialised()
                .isPresent());


        //empty
        System.out.println("IS empty:: "+userHandled
                .getAddressNotInitialised()
                .isEmpty());

        // Example of orElseGet
        String cityOrElseGet = userHandled.getAddress()
                .map(Address::getCity)
                .orElseGet(() -> "City not available (using orElseGet)");
        System.out.println("City: " + cityOrElseGet);

        // Demonstrating orElseThrow()
        userHandled.setAddress(Optional.ofNullable(null));
//        userHandled.setAddress(Optional.empty());
        try {
            String cityOrElseThrow = userHandled.getAddress()
                    .map(Address::getCity)
                    .orElseThrow();
            System.out.println("City: " + cityOrElseThrow);
        } catch (NoSuchElementException e) {
            System.out.println("City not available (using orElseThrow)");
        }


        //filter
        UserHandled userFilter = new UserHandled();
        userFilter.setAddress(Optional.of(new Address("Bangalore","JPMC")));
        Optional<Address> filteredCity = userFilter.getAddress()
                .filter(address -> "BAngalore".equals(address.getCity()));

        Address addressFiltered = filteredCity.orElse(null);
        System.out.println("Filtered City: " + addressFiltered);


    }
}
