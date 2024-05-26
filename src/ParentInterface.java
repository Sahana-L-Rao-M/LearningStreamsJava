@FunctionalInterface
public interface ParentInterface {
    void abstractMethod();
    default void method1(){
        System.out.println("method1");
    }
}
