package workout;
import java.util.Scanner;

public class game {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        byte[] practice = getResults(5);
        System.out.println("The name of the game is Petals Around the Rose."
                         + "\nThe name is important. I will roll five dice,"
                         + "\nand I will tell you how many petals appear."
                         + "\n\nFor example:"
                         + "\n" + getFormattedDice(practice)
                         + "Will result in " + getAnswer(practice) + "."
                         + "\n\nIf you answer correctly 8 times in a row, you"
                         + "\nwill be declared a \"Potentate of the Rose\".\n");
        byte streak = 0;
        while(true) {
            if(playOnce(getResults(5))) {
                streak++;
            }
            if(streak == 8) {
                System.out.println("You are now declared a \"Potentate of the Rose\"!");
                break;
            }
        }
        System.out.println("Thank you for playing!");
        sc.close();
    }

    private static boolean playOnce(byte[] nums) {
        System.out.println("How many petals here?\n" + getFormattedDice(nums));
        byte guess = 0;
        byte answer = getAnswer(nums);
        boolean valid = false;
        while (!valid) {
            try {
                guess = sc.nextByte();
                valid = true;
            } catch (Exception e) {
                sc.next();
                System.out.print("\nOops! That is not a number. Try again: ");
            }
        }
        if (guess == answer) {
            System.out.println("\nCorrect!");
            return true;
        }
        System.out.println("\nIncorrect. The answer is " + answer + ".");
        return false;
    }

    private static byte getAnswer(byte[] nums) {
        byte answer = 0;
        for (byte b : nums) {
            if (b == 3) {
                answer += 2;
            } else if (b == 5) {
                answer += 4;
            }
        }
        return answer;
    }

    private static byte[] getResults(int amt) {
        byte[] nums = new byte[amt];
        for (int i = 0; i < amt; i++) {
            nums[i] = rollADie(6);
        }
        return nums;
    }

    private static String getFormattedDice(byte[] nums) {
        final int SIZE = 8;
        final String DOT = "\u00b7";
        final String EMPTY = "       ";
        final String SPACE_5 = "     ";
        final String SPACE_3 = "   ";
        final String SPACE = " ";
        StringBuffer[] result = new StringBuffer[] {
                new StringBuffer(SIZE * nums.length + 1),
                new StringBuffer(SIZE * nums.length + 1),
                new StringBuffer(SIZE * nums.length + 1) };
        result[0].append("|");
        result[1].append("|");
        result[2].append("|");
        for (byte num : nums) {
            switch (num) {
            case (byte) 1:
                result[0].append(EMPTY + "|");
                result[1].append(SPACE_3 + DOT + SPACE_3 + "|");
                result[2].append(EMPTY + "|");
                break;
            case (byte) 2:
                result[0].append(SPACE + DOT + SPACE_5 + "|");
                result[1].append(EMPTY + "|");
                result[2].append(SPACE_5 + DOT + SPACE + "|");
                break;
            case (byte) 3:
                result[0].append(SPACE + DOT + SPACE_5 + "|");
                result[1].append(SPACE_3 + DOT + SPACE_3 + "|");
                result[2].append(SPACE_5 + DOT + SPACE + "|");
                break;
            case (byte) 4:
                result[0].append(SPACE + DOT + SPACE_3 + DOT + SPACE + "|");
                result[1].append(EMPTY + "|");
                result[2].append(SPACE + DOT + SPACE_3 + DOT + SPACE + "|");
                break;
            case (byte) 5:
                result[0].append(SPACE + DOT + SPACE_3 + DOT + SPACE + "|");
                result[1].append(SPACE_3 + DOT + SPACE_3 + "|");
                result[2].append(SPACE + DOT + SPACE_3 + DOT + SPACE + "|");
                break;
            case (byte) 6:
                result[0].append(SPACE + DOT + SPACE_3 + DOT + SPACE + "|");
                result[1].append(SPACE + DOT + SPACE_3 + DOT + SPACE + "|");
                result[2].append(SPACE + DOT + SPACE_3 + DOT + SPACE + "|");
                break;
            default:
                throw new IllegalArgumentException(
                        "A number higher than 6 in array.");
            }
        }
        return new String(result[0]) + "\n" + new String(result[1]) + "\n"
                + new String(result[2]) + "\n";
    }

    private static byte rollADie(int i) {
        return (byte) (Math.random() * i + 1);
    }
}


/*
write a simple java program to print the count of perfect square in an array
input 
10
1 2 3 4 5 9 25 7 36 10
output 
4
in simple way

import java.util.Scanner;

public class PerfectSquareCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        // Reading array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Counting perfect squares
        for (int i = 0; i < n; i++) {
            int root = (int) Math.sqrt(arr[i]);
            if (root * root == arr[i]) {
                count++;
            }
        }

        // Printing result
        System.out.println(count);
    }
}




input
Hardship often prepare oridinary people for an extraordinarys destiny

output
smallest word : an
largest word : extraordinary



 very simple way java program
Given a sorted integer array, find the floor and ceil of a given number in it. The floor and ceil map the given number to the largest previous or the smallest following integer in the array.

More precisely, for a number x, floor(x) is the largest integer in the array less than or equal to x, and ceil(x) is the smallest integer in the array greater than or equal to x. If the floor or ceil doesn’t exist, consider it to be -1. For example,

Input:
 
nums[] = [1, 4, 6, 8, 9]
Number: 0 to 10
 
Output:
 
Number 0 —> ceil is 1, floor is -1
Number 1 —> ceil is 1, floor is 1
Number 2 —> ceil is 4, floor is 1
Number 3 —> ceil is 4, floor is 1
Number 4 —> ceil is 4, floor is 4
Number 5 —> ceil is 6, floor is 4
Number 6 —> ceil is 6, floor is 6
Number 7 —> ceil is 8, floor is 6
Number 8 —> ceil is 8, floor is 8
Number 9 —> ceil is 9, floor is 9
Number 10 —> ceil is -1, floor is 9

*/
