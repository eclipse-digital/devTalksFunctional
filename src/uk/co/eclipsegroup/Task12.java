package uk.co.eclipsegroup;

public class Task12 {
    public static void main(String[] args) {
        boolean doWeHaveColumbus = false;
        for (Beer beer : Bar.beers) {
            if (beer.getHops().contains("Columbus")) {
                doWeHaveColumbus = true;
                break;
            }
        }
        System.out.println(doWeHaveColumbus);
        boolean columbus = Bar.beers.stream().anyMatch(b -> b.getHops().contains("Columbdadadabus"));
        System.out.println(columbus);
    }
}
