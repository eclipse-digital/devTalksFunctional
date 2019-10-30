package uk.co.eclipsegroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        Map<Type, List<Beer>> beersByType= Bar.beers.stream().collect(Collectors.groupingBy(Beer::getType));
        Map<Type, List<Beer>> beersByTypeImperative = new HashMap<>();
        for (Beer beer : Bar.beers) {
            if (!beersByTypeImperative.containsKey(beer.getType())) {
                ArrayList<Beer> beers = new ArrayList<>();
                beersByTypeImperative.put(beer.getType(), beers);
                beers.add(beer);
            } else {
                beersByTypeImperative.get(beer.getType()).add(beer);
            }
        }
        System.out.println(beersByTypeImperative);
        System.out.println(beersByType);
    }
}
