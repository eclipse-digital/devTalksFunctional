package uk.co.eclipsegroup.live;

import uk.co.eclipsegroup.Bar;
import uk.co.eclipsegroup.Beer;

public class Task5 {
    public static void main(String[] args) {
        for (Beer beer : Bar.beers) {
            if (beer.getPrice() <= 2) {
                System.out.println(beer);
            }
        }
        Bar.beers.stream().filter(beer -> beer.getPrice() < 2).forEach(System.out::println);
    }
}
