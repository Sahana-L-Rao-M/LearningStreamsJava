import java.util.*;
import java.util.function.Function;

public class WildCard {

    public static void main(String[] args)
    {
        PrintList printList=new PrintList();
        List<String> stringList = new ArrayList<>(List.of("Hello", "World","people"));
        printList.printListUnbounded(stringList);
        List<Integer> intList = new ArrayList<>(List.of(1, 2, 3));
        printList.printListUnbounded(intList);
        List<Double> doubleList = new ArrayList<>(List.of(1.1, 2.2, 3.3));
        printList.printListUnbounded(doubleList);
        List<Number> numberList = new ArrayList<>(List.of(1.1, 2, 3.3));
        printList.printListUnbounded(numberList);

//        printList.printListUpperBound(stringList);
        printList.printListUpperBound(intList);
        printList.printListUpperBound(doubleList);
        printList.printListUpperBound(numberList);

//        printList.printListLowerBound(stringList);
        printList.printListLowerBound(intList);
//        printList.printListLowerBound(doubleList);
        printList.printListLowerBound(numberList);
        printList.printListLowerBound(numberList);

//        Collections
//        System.out.println(stringList.containsAll(List.of("Hello","World")));

    }
}
class PrintList{
 public void printListUnbounded(List<?> list){
     for(Object elt:list){
         System.out.println(elt);
     }
//     list.add(123);
 }
 public void printListUpperBound(List<? extends Number> list){
     for(Object elt:list){
         System.out.println(elt);
     }
//     list.add(10);
 }
    public void printListLowerBound(List<? super Integer> list){
        for(Object elt:list){
            System.out.println(elt);
        }
//     list.add(10);
    }
}


