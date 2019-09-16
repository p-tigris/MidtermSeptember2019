package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        //Declares a new Map with Strings as the key and a list of strings as the value
        Map<String, List<String>> citiesInNorthAmerica = new HashMap<String, List<String>>();

        //Sample lists
        List<String> citiesInCanada = Arrays.asList("Toronto", "Montreal", "Vancouver");
        List<String> citiesInUSA = Arrays.asList("New York", "Washington DC", "Los Angeles");
        List<String> citiesInMexico = Arrays.asList("Mexico City", "Tijuana", "Monterrey");

        //Add keys and values to Map
        citiesInNorthAmerica.put("Canada", citiesInCanada);//put method adds a String key and List value to Map
        citiesInNorthAmerica.put("USA", citiesInUSA);
        citiesInNorthAmerica.put("Mexico", citiesInMexico);

        //Retrieves a value from the Map
        citiesInNorthAmerica.get("USA");//Returns the value of key "USA" which is a List
        System.out.println(citiesInNorthAmerica.get("USA"));//Prints value

        System.out.println("**************************************");

        //Iterates through Map
        //for loop goes through map and retrieves key and value
        for (Map.Entry<String, List<String>> cities : citiesInNorthAmerica.entrySet()) {
            System.out.println(cities.getKey()+" "+cities.getValue());
        }

        //Using Iterator
        Iterator<Map.Entry<String, List<String>>> iterator = citiesInNorthAmerica.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> cities = iterator.next();
            System.out.println(cities.getKey()+" "+cities.getValue());
        }
    }

}
