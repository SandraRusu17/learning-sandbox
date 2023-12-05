import java.util.ArrayList;
import java.util.List;

/**
 * We have a stream of data (in our case, a List of String) where each string is a combination of the country name and place of the country.
 * Now, we can process this stream of data and retrieve only the places from Nepal.
 */

public class StreamExample {

    // create an object of List using ArrayList
    static List<String> places = new ArrayList<>();

    public static List getPlaces() {
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");

        return places;
    }


    public static void main(String[] args) {

        List<String> allPlaces = getPlaces();
        allPlaces.stream().filter((p) -> p.contains("Nepal"))
                .map(String::toUpperCase)
                .sorted()
                .forEach((p) -> System.out.println(p));

    }
}
