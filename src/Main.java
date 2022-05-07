import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** DIRECTIONS:
         * For two given strings, determine which comes first if sorted lexicographically.
         * If the first string comes first, print "-1".
         * If the second string comes first, print "1".
         * If neither comes first, print "0".
         * (Uppercase letters are equivalent to their lowercase counterparts.)
         */

        Scanner s = new Scanner(System.in);
        printEvaluation(
                // To upper to ignore letter case.
                s.nextLine().toUpperCase(),
                s.nextLine().toUpperCase()
        );

    }

    public static void printEvaluation(String first, String second){

        char[] arr1 = first.toCharArray();
        char[] arr2 = second.toCharArray();

        // Iterate until a discrepancy is found.
        // If a discrepancy is found, evaluate the discrepancy, print, and stop the loop.
        // If one is not, then just print "0".
        for(int i = 0; i < arr1.length; i++)
            if(arr1[i] != arr2[i])
            {
                System.out.println(arr1[i] > arr2[i]? "1" : "-1");
                return;
            }
        System.out.println("0");

    }

}