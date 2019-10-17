package uk.co.eclipsegroup;

import java.util.Arrays;
import java.util.List;


public class Bar {
    static List<Beer> beers = Arrays.asList(
            new Beer("Przeniczne jasne", 5d),
            new Beer("Miodowe ciemne", 6d),
            new Beer("Dzban Krzysztofa", 0.1),
            new Beer("Angielskie Ale", 4d),
            new Beer("Eclipsowe Mocne", 9d),
            new Beer("Manka extra strong", 0.1d));
}
