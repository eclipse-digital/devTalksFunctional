package uk.co.eclipsegroup;

public class Task15 {
    public static void main(String[] args) {
        Beer cheapBeer = Bar.defaultBeer;
        for (Beer beer : Bar.beers) {
            if (beer.getPrice() <= 2) {
                cheapBeer = beer;
                break;
            }
        }
        System.out.println(cheapBeer);

        Beer cheapBeerFunctional = Bar.beers.stream().filter(b -> b.getPrice() <= 2).findAny().orElse(Bar.defaultBeer);
        Beer cheapBeerFunctionalLazy = Bar.beers.stream().filter(b -> b.getPrice() <= 2).findAny().orElseGet(() -> Bar.defaultBeer);
        System.out.println(cheapBeerFunctional);
        System.out.println(cheapBeerFunctionalLazy);
    }
}
