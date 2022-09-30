package Question_5;
/*5) Implement multiple inheritance with default method inside interface. */
public interface Multipleinheri_ {
    default void click() {
        System.out.println("click");
    }
}

interface Accessible {
    default void access() {
        System.out.println("access");
    }
}

