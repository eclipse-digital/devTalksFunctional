package uk.co.eclipsegroup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Bar {
    public static List<Beer> beers = Arrays.asList(
            new Beer("Przeniczne jasne", 5d, Type.WHEAT, Collections.singletonList("Hersbrucker")),
            new Beer("Miodowe ciemne", 6d, Type.PILSNER, Collections.singletonList("Saaz")),
            new Beer("Dzban Krzysztofa", 1d, Type.IPA, Arrays.asList("Chinook", "Columbus", "Amarillo")),
            new Beer("Angielskie Ale", 4d, Type.EPA, Arrays.asList("Chinook", "Columbus", "Amarillo", "Simcoe")),
            new Beer("Eclipsowe Mocne", 9d, Type.STOUT, Collections.singletonList("Cascade")),
            new Beer("Manka extra strong", 0.5d, null, Collections.emptyList()));

    public static Beer defaultBeer = new Beer("Perełka Bezalkoholowa", 4.99, Type.PILSNER, Collections.emptyList());
}
