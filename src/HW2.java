import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a Int or Q to quit ");
        String userTyped;
        int number = 0;
        Boolean done = false;
        int counter = 0;
        if (number > 10 && number < 15){
            counter++;
            System.out.println();

            userTyped = input.next();
            if (userTyped.equals("Q")) done = true; // NOTICE the .equals()
            else
            {
                number += userTyped.length();
            }
        }
        while (!done);

        System.out.println("sum = " + number + " count = ");
        }

    }
