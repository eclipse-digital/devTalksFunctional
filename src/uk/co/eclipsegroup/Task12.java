package uk.co.eclipsegroup;

public class Task12 {
    public static void main(String[] args) {
        boolean containsHop = false;
        for (Beer beer : Bar.beers) {
            if (beer.getHops().contains("Cascade")) {
                containsHop = true;
                break;
            }
        }
        System.out.println(containsHop);

        boolean containsHopFunctional = Bar.beers.stream()
                .anyMatch(b -> b.getHops().contains("Cascade"));
        System.out.println(containsHopFunctional);
    }
}
