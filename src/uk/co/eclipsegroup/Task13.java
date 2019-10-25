package uk.co.eclipsegroup;

public class Task13 {
    public static void main(String[] args) {
        boolean allNonPriceFree = true;
        for (Beer beer : Bar.beers) {
            if (!(beer.getPrice() > 0)) {
                allNonPriceFree = false;
                break;
            }
        }
        System.out.println(allNonPriceFree);

        boolean allNonPriceFreeFunctional = Bar.beers.stream()
                .allMatch(b -> b.getPrice() > 0);
        System.out.println(allNonPriceFreeFunctional);
    }
}
