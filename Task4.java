package Project;

public class Task4 {

    public static void main(String[] args) {

       /* Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
         Print the sum of all numbers. */

        int[][] numbers = {{12, 15, 17},
                {23, 25, 27},
                {33, 35, 37}
        };

        int sum = 0;
        for (int[] numberArray : numbers) {
            for (int number : numberArray) {
                sum += number;
            }
        }
        System.out.println(sum);
    }

}

