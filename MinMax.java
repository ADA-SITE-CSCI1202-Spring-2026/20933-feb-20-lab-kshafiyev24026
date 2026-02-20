import java.util.*;

public class MinMax {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        // 🔹 i. Array from command line
        if (args.length > 0) {
            int[] cmdArray = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                cmdArray[i] = Integer.parseInt(args[i]);
            }

            System.out.println("Command line array:");
            System.out.println("Min: " + findMin(cmdArray));
            System.out.println("Max: " + findMax(cmdArray));

            int[] both = findMinMax(cmdArray);
            System.out.println("Min & Max together: " + both[0] + " " + both[1]);
        }

        // 🔹 ii. Array using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] userArray = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            userArray[i] = sc.nextInt();
        }

        System.out.println("Scanner array:");
        System.out.println("Min: " + findMin(userArray));
        System.out.println("Max: " + findMax(userArray));

        int[] both2 = findMinMax(userArray);
        System.out.println("Min & Max together: " + both2[0] + " " + both2[1]);
    }
}