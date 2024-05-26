@FunctionalInterface
public interface ChildInterface extends ParentInterface{
    default void method1(){};


//    @Override
//    default void method1() {
//        System.out.println("hello 123");
//    }
}
