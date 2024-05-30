import java.io.File;
import java.io.FileFilter;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
    Stream->interface -> Sequence of elements that supports sequential and parallel aggregation
    Difference from Collections - store and manage and manipulate by providing direct access to the base element but Streams manage processsing

    + Describe the operations to be performed on the sequence of elements before executing them

    Features:
    +Lazy: Intermediate operations are not performed until terminal operations are called: and avoiding unnecessary computation, decreased resource utilisation for large/infinite streams
    +Short Circuiting: process elements until condition met
    +Immutability: Underlying data source is unaltered. Every operation results in new stream
    +Declarative way of programming - What and not how
    +Stream computations are optimised - Tells how to fetch and process elements
 */
class Dog{
    private String name;
}
public class StreamsIntro {
    public static void main(String[] args) {
        //Stream
        //Collections
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("List of numbers: "+numbers);

        Stream<Integer> streamElements= numbers.stream();
        System.out.println("Stream:" +streamElements);
//        System.out.println("Map on stream:" +streamElements.map(input->input+2));


        Stream<Integer> filteredStream=streamElements.filter(input->input>5);
        System.out.println(filteredStream);

        filteredStream.forEach(System.out::println);


//        Stream<Integer> streamCopy=streamElements;
////        System.out.println(streamCopy);
//        System.out.println(streamCopy.anyMatch(input->input==15));


        //Task: To find sum of Squared even numbers
        int sum=0;
        for(int i: numbers){
            if(i%2==0){
                int squaredNumber= i*i;
                sum+=squaredNumber;
            }
        }
        System.out.println("Imperative approach: "+sum);
        System.out.println("Declarative approach: "+numbers.stream()
                .filter(element->element%2==0)
                .map(element->element*element)
                .reduce(0, Integer::sum));


        //For Arrays
        String[] number={"one","two","three"};
        Arrays.stream(number).map(String::toUpperCase).forEach(System.out::println);

        //Build a stream : .of->static method
        Stream.of("APPLE","CHICKOO","POMEGRANATE").map(String::toLowerCase).forEach(System.out::println);

        //Concatenate streams
        Stream<String> fruitsFirst=Stream.of("APPLE","CHICKOO","POMEGRANATE").map(String::toLowerCase);
        Stream<String> fruitsSecond= List.of("jackfruit","coconut").stream();
        System.out.println("Combine set of fruits count: "+Stream.concat(fruitsFirst,fruitsSecond).count());

    }

}
