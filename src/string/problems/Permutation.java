package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        printPermutation("ABC", "");

    }

    public static void printPermutation(String str, String permChar)
    {
        if (str.length() == 0) {
            System.out.print(permChar + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            printPermutation(ros, permChar + ch);
        }
    }
}
