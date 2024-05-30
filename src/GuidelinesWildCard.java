import java.util.ArrayList;
import java.util.List;

class NaturalNumber {

    private int i;

    public NaturalNumber(int i) { this.i = i; }
    // ...
}

class EvenNumber extends NaturalNumber {

    public EvenNumber(int i) { super(i); }
    // ...
}
public class GuidelinesWildCard {
    public static void main(String[] args) {
        List<NaturalNumber> le = new ArrayList<>();
        List<? super EvenNumber> ln = le;

//        ln.add(new NaturalNumber(1));
//        ln.add(new EvenNumber(1));


        //Suppose
//        EvenNumber en = (EvenNumber) ln.get(0); // This cast would fail at runtime
    }
}

