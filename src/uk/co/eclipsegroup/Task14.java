package uk.co.eclipsegroup;

import java.util.Optional;

public class Task14 {
    public static void main(String[] args) {
        Beer cheapBeer = null;
        for (Beer beer : Bar.beers) {
            if (beer.getPrice() <= 2) {
                cheapBeer = beer;
                break;
            }
        }
        System.out.println(cheapBeer);

        Optional<Beer> cheapBeerFunctional = Bar.beers.stream().filter(b -> b.getPrice() <= 2).findAny();
        System.out.println(cheapBeerFunctional);
    }
}
