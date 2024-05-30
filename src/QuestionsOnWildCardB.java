import java.util.ArrayList;
import java.util.List;

public class QuestionsOnWildCardB {
    List<? extends Integer> intList = new ArrayList<>();
    List<? extends Number>  numList = intList;

}



//class WildcardError {
//
//    void foo(List<?> i) {
//        i.set(0, i.get(0));
//    }
//}




//class WildcardFixed {
//
//    void foo(List<?> i) {
//        fooHelper(i);
//    }
//
//
//    // Helper method created so that the wildcard can be captured
//    // through type inference-thereby ensuring Type-safety
//    private <T> void fooHelper(List<T> l) {
//        l.set(0, l.get(0));
//    }
//
//}

