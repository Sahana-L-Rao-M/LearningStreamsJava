import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

//Part
/*
E: Element, used in collections like List<E>, Set<E>.
K: Key, used in maps like Map<K, V>.
V: Value, used in maps like Map<K, V>.
N: Number, used for numeric types.
T: Type, a general placeholder for any type.
S, U, V: Additional type parameters, used when more than one type is involved.
*/
public class TypeParameter {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        Map<String,Integer> players=new HashMap<>();

        TypeNumber<Double> typeNumber=new TypeNumber<>(12.5);
        TypeNumber<Integer> integerTypeNumber = new TypeNumber<>(10);
        BiFunction<String,String,Boolean> biFunction=(input1,input2)->input1.equals(input2);
        System.out.println(biFunction.apply("hello","HELLO"));
    }
}
class TypeNumber<N extends Number>{
    public N number;

    public TypeNumber(N number) {
        this.number = number;
    }
}
