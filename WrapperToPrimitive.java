public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double wrapper = 45.67;

        // Auto-unboxing to double
        double d = wrapper;
        // Explicit casting to int
        int i = wrapper.intValue();

        System.out.println("Double object: " + wrapper);
        System.out.println("double primitive: " + d);
        System.out.println("int (casted): " + i);
    }
}
