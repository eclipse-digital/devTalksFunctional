package uk.co.eclipsegroup.live;

import uk.co.eclipsegroup.Bar;
import uk.co.eclipsegroup.Beer;

public class Task6 {
    public static void main(String[] args) {
        double sum = 0d;
        for (Beer beer : Bar.beers) {
            sum += beer.getPrice();
        }
        System.out.println(sum < 10);

        Double functionalSum = Bar.beers.stream().mapToDouble(Beer::getPrice).sum();
        System.out.println(functionalSum < 10);

        System.out.println(Bar.beers.stream().mapToDouble(Beer::getPrice).summaryStatistics());
    }
}
