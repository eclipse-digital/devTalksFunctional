package uk.co.eclipsegroup.live;

import uk.co.eclipsegroup.Bar;
import uk.co.eclipsegroup.Beer;

import java.util.function.Consumer;

public class Task1 {
    public static void main(String[] args) {
        for (Beer beer : Bar.beers) { System.out.println(beer); }

        Bar.beers.forEach(System.out::println);
    }
}
