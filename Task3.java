package Project;

public class Task3 {

    public static void main(String[] args) {

        /*  Using 2D array create a grocery list.
        Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops */


        String[][] groceryList = {{"Potatoes", "Onion", "Cabbage", "Carrot"},
                {"Apple", "Orange", "Strawberry", "Banana"},
                {"Milk", "Yogurt", "Kefir", "Cheese"},
                {"Candy", "Chocolate", "Jelly", "Cake"}
        };

        // Retrieve values using a Nested for loop

        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j] + " ");
            }
            System.out.println();
        }

            // Retrieve values using an enhanced for loop

            for (String[] groceryCategory : groceryList) {
                for (String groceryItem : groceryCategory) {
                    System.out.print(groceryItem + " ");
                }
            }
        }
    }

