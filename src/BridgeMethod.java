import java.util.ArrayList;
import java.util.List;

class Animal<T> {
    public void feature(T t) {
        System.out.println("Some sound");
    }
}

class Cat extends Animal<String> {
    @Override
    public void feature(String s) {
        System.out.println("Bark: " + s);
    }

//    // Bridge method generated by the compiler
//    @Override
//    public void sound(Object t) {
//        sound((String) t); // Calls the original overridden method
//    }
}


public class BridgeMethod {
    public static void main(String[] args) {
        Animal<String> myCat = new Cat();
        List list1=new ArrayList<String>();
        myCat.feature("Meow");
    }
}
