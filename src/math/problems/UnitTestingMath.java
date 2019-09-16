package math.problems;

public class UnitTestingMath {

    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        System.out.println(Factorial.getFactorial(7));//returns 5040

        int[] array = new int[] {5, 2, 1, 4};
        System.out.println(FindMissingNumber.missingNumber(array));//returns 3
    }
}
