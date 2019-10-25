package uk.co.eclipsegroup.live;

import uk.co.eclipsegroup.Bar;
import uk.co.eclipsegroup.Beer;

import java.util.function.Predicate;

public class Task7 {
    public static void main(String[] args) {
        for (Beer beer : Bar.beers) {
            System.out.println("przed filtrem: " +beer);
            if(beer.getPrice()<2){
                System.out.println(beer);
            }
        }
        Bar.beers.stream().peek(beer -> System.out.println("Przed iltrowaniem" +beer))
                .filter(janekSieTrocheCzepia())
                .map(Beer::getPrice)
                .forEach(System.out::println);
    }

    private static Predicate<Beer> janekSieTrocheCzepia() {
        return beer -> beer.getPrice() <2;
    }
}
