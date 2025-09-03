public class RandomNumbers {
    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        
        System.out.print("Generated numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        double[] stats = findAverageMinMax(numbers);
        System.out.println("Average: " + stats[0]);
        System.out.println("Min: " + stats[1]);
        System.out.println("Max: " + stats[2]);
    }
    
    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 9000) + 1000; // 1000 to 9999
        }
        return array;
    }
    
    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) {
            return new double[]{0, 0, 0};
        }
        
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }
}
