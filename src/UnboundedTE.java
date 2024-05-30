/*
Type erasure ->Support Generic & backward Compatibility(Raw Type)
             -> Compilation=> Change all generics to OBJECT
             -> Ensure type compatibility.
             -> This means that the generic type information is not available at runtime,
             and all instances of generic types are treated as raw types (e.g., List rather than List<String>).
             This process ensures type safety during compilation while allowing the JVM to operate
             without needing to know about generics.
 */
//Unbounded -> Object
public class UnboundedTE<T> { //public class UnboundedTE
    private T value;//    private Object value;

    public UnboundedTE(T value) {   // public UnboundedTE(Object value)
        this.value = value;
    }

    public T getValue() { //public Object getValue()
        return value;
    }

    public void setValue(T value) {//    public void setValue(Object value) {
        this.value = value;
    }
}
