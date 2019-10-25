package uk.co.eclipsegroup;

public class Task16 {
    public static void main(String[] args) {
        Beer cheapBeer = null;
        for (Beer beer : Bar.beers) {
            if (beer.getPrice() <= 2) {
                cheapBeer = beer;
                break;
            }
        }
        if (cheapBeer == null) {
            throw new IllegalStateException("Could not find beer cheaper than " + 2);
        }
        System.out.println(cheapBeer);

        Beer cheapBeerFunctional = Bar.beers.stream().filter(b -> b.getPrice() <= 2).findAny()
                .orElseThrow(() -> new IllegalStateException("Could not find beer cheaper than " + 2));
        System.out.println(cheapBeerFunctional);
    }
}
