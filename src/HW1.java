import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userTyped; 	boolean done = false;
        int sum = 0;
        do
        {
            System.out.print("Input an word (Q to quit): ");
            userTyped = input.next();
            if (userTyped.equals("Q")) done = true; // NOTICE the .equals()
            else
            {
                sum += userTyped.length();
            }
        }
        while (!done);

        System.out.println("sum = " + sum + " count = ");
    }
}
