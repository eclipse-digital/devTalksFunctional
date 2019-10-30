package uk.co.eclipsegroup;

public class Task13 {
    public static void main(String[] args) {
        boolean noFreeBeersAvailable = Bar.beers.stream().filter(b -> b.getPrice() == 0).count() == 0;
        boolean b2 = Bar.beers.stream().allMatch(b -> b.getPrice() > 0);
        System.out.println(noFreeBeersAvailable);
        System.out.println(b2);

        boolean noFreeBeersAvailableImperative = false;
        for (Beer beer : Bar.beers) {
            if (beer.getPrice() > 0) {
                noFreeBeersAvailableImperative = true;
                break;
            }
        }
        System.out.println(noFreeBeersAvailableImperative);
    }
}
