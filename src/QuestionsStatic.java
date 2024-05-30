import java.util.Set;

class MobileDevice<T> {
//    private static T os;
    private T color;

    // ...
}
class Smartphone {
    public String Battery;
}
class TabletPC {
    public String company;
}
public class QuestionsStatic {
    public static void main(String[] args) {
        MobileDevice<Smartphone> phone = new MobileDevice<>();
        MobileDevice<TabletPC> pc = new MobileDevice<>();
    }

}


