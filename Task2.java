package Project;

public class Task2 {

    public static void main(String[] args) {

        /* Create 2D array of cars : american, german, korean, italian.
         Then retrieve all values from that array using 2 different loops */

        String[][] cars = {{"American", "German", "Korean", "Italian"}};

        // Retrieve values using a Nested for loop

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {

                System.out.print(cars[i][j]+ " ");

            }

        }
        System.out.println();

        // Retrieve values using an enhanced for loop

        for (String[] carArr : cars) {
            for (String car : carArr) {
                System.out.print(car + " ");
            }
        }

    }
}
