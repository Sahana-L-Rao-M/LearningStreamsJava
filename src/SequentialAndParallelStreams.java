import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialAndParallelStreams {
    //Parallel and Sequential Stream
    public static void main(String[] args) {
//        List<Integer> listOFNumbers=List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> listOFNumbers= IntStream.rangeClosed(1, 100000000)
                .boxed()
                .toList();
        //Sequential
        System.out.println("Sequential Execution");
        long start=System.currentTimeMillis();
        listOFNumbers.stream().filter(input->input%2==0).map(input->input*2).forEach(output->{});
        long end=System.currentTimeMillis();
        System.out.println(start+" "+end+" "+ (end-start));

        //ParallelStream
        System.out.println("ParallelStream Execution");
        start=System.currentTimeMillis();
        listOFNumbers.parallelStream().filter(input->input%2==0).map(input->input*2).forEach(output->{});
        end=System.currentTimeMillis();
        System.out.println(start+" "+end+" "+ (end-start));

        //ParallelStream with forEachOrdered
        System.out.println("ParallelStream with forEachOrdered");
        start=System.currentTimeMillis();
        listOFNumbers.parallelStream().filter(input->input%2==0).map(input->input*2).forEachOrdered(output->{});
        end=System.currentTimeMillis();
        System.out.println(start+" "+end+" "+ (end-start));

        //Parallel method for sequential stream
        System.out.println("Parallel method for sequential stream");
        start=System.currentTimeMillis();
        listOFNumbers.stream().parallel().filter(input->input%2==0).map(input->input*2).forEach(output->{});
        end=System.currentTimeMillis();
        System.out.println(start+" "+end+" "+ (end-start));


        //ForEachOrdered
        System.out.println("parallelising sequential stream with parallel intermediate method");
        start=System.currentTimeMillis();
        listOFNumbers.stream() // Sequential stream
                .parallel() // Convert to parallel stream, parallelizing the output operation
                .filter(x -> x % 2 == 0) // Filter even numbers
                .map(x -> x * 2) // Square each number
                .forEachOrdered(output->{}); // Print each square (maintain order)
        end=System.currentTimeMillis();
        System.out.println(start+" "+end+" "+ (end-start));

    }

}
