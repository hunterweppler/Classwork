import java.util.Arrays;
import java.util.Random;

public class HW1 {
    public static int[] createArray(int size) {
        int[] numbers = new int[size];
        Random randomGenerator = new Random();
        int top = 20, bottom = 10;

        for (int index = 0; index < size; index++) {
            numbers[index] = randomGenerator.nextInt(top - bottom) + bottom;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] myArray = createArray(5);
        System.out.println(Arrays.toString(myArray));
    }
}