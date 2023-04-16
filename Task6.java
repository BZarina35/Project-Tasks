package Project;

public class Task6 {

    public static void main(String[] args) {

        // Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        // Then print all values from that array using 2 different loops and calculate how many total countries been stored.



        String[][] countries = {
                {"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Chile"},
                {"France", "Germany", "Italy"},
                {"China", "Japan", "India"},
                {"Nigeria", "South Africa", "Egypt"}
        };

        // Print all values using a nested for loop

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+ " ");
            }
        }
        System.out.println();

        // Print all values using an enhanced for loop

        for (String[] countryArray : countries) {
            for (String country : countryArray) {
                System.out.print(country + " ");
            }
        }
        System.out.println();

        // Calculate and print the total number of countries
        int totalCountries = 0;
        for (String[] countryArray : countries) {
            totalCountries += countryArray.length;
        }
        System.out.println("Total number of countries: " + totalCountries);
    }
}



