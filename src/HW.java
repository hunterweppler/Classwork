import java.util.Arrays;
import java.util.Scanner;

public class HW{
    public static int[] rotate(int[] numbers) {
        int lstIndex = numbers[numbers.length - 1];
    for (int index = numbers.length-2; index >= 0; index --) {
            numbers[index + 1] = numbers[index];
        }
    numbers[0] = lstIndex;
    return numbers;
}

    public static void main(String[] args){
        int[] test = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(rotate(test)));
    }
}
