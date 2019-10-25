package uk.co.eclipsegroup;

public class Task17 {
    public static void main(String[] args) {
        Double price = null;
        for (Beer beer : Bar.beers) {
            if (beer.getPrice() <= 2) {
                price = beer.getPrice();
                break;
            }
        }
        if (price == null) {
            throw new IllegalStateException("Could not find beer cheaper than " + 2);
        }
        System.out.println(price);

        Double priceFunctional = Bar.beers.stream().filter(b -> b.getPrice() <= 2).findAny().map(Beer::getPrice)
                .orElseThrow(() -> new IllegalStateException("Could not find beer cheaper than " + 2));
        System.out.println(priceFunctional);
    }
}
