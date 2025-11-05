import java.util.*;

public class CopyListDemo {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        dest.addAll(src);
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> src = Arrays.asList(10, 20, 30);
        copyList(dest, src);
        System.out.println("After Copy: " + dest);
    }
}
