import java.util.ArrayList;

public class WrapperPerformance {
    public static void main(String[] args) {
        int size = 1_000_000;

        // Primitive array
        long start = System.nanoTime();
        int[] prim = new int[size];
        for (int i = 0; i < size; i++) prim[i] = i;
        long sum1 = 0;
        for (int n : prim) sum1 += n;
        long primTime = System.nanoTime() - start;

        // Wrapper ArrayList
        start = System.nanoTime();
        ArrayList<Integer> wrap = new ArrayList<>();
        for (int i = 0; i < size; i++) wrap.add(i);
        long sum2 = 0;
        for (Integer n : wrap) sum2 += n;
        long wrapTime = System.nanoTime() - start;

        System.out.println("Primitive time: " + primTime / 1_000_000 + " ms");
        System.out.println("Wrapper time: " + wrapTime / 1_000_000 + " ms");
        System.out.println("Wrapper is ~" + (wrapTime / primTime) + "x slower");
    }
}
