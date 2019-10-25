package uk.co.eclipsegroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        Map<Type, List<Beer>> byType = new HashMap<>();
        for (Beer beer : Bar.beers) {
            List<Beer> currentTypes;
            if (!byType.containsKey(beer.getType())) {
                currentTypes = new ArrayList<>();
                byType.put(beer.getType(), currentTypes);
            } else {
                currentTypes = byType.get(beer.getType());
            }
            currentTypes.add(beer);
        }
        System.out.println(byType);

        Map<Type, List<Beer>> byTypeFunctional = Bar.beers.stream().collect(Collectors.groupingBy(Beer::getType));
        System.out.println(byTypeFunctional);
    }
}
