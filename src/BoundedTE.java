public class BoundedTE<T extends Number> { // public class BoundedTE
        private T number; //        private Number number;

        public BoundedTE(T number) {//        public BoundedTE(Number number) {
            this.number = number;
        }

        public T getNumber() {//        public Number getNumber() {
            return number;
        }

        public void setNumber(T number) {//        public void setNumber(Number number) {
            this.number = number;
        }

        public double doubleValue() {
            return number.doubleValue();
        }


}


//Generic Method
class BoundedGenericMethod {
    public static <T extends Comparable<T>> T findMax(T a, T b) {//    public static Comparable findMax(Comparable a, Comparable b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}
