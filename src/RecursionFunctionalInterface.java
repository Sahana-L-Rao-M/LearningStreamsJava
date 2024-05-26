import java.util.function.*;
class Factorial{
         Predicate<Integer> isOne=(number)->number==1;
         Function<Integer,Integer> factorial=(number)->{
            if(!isOne.test(number))
                return number*this.factorial.apply(number-1);
            else return 1;
        };
}

public class RecursionFunctionalInterface {
    public static void main(String[] args) {
    Factorial fact=new Factorial();
        System.out.println(fact.factorial.apply(4));
    }
}