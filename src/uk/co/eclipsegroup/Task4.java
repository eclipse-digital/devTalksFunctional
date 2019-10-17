package uk.co.eclipsegroup;

import java.util.OptionalDouble;


public class Task4 {
    public static void main(String[] args) {
        Double sum = 0d;
        for (Beer beer : Bar.beers) {
            sum += beer.getPrice();
        }
        Double average = sum / Bar.beers.size();
        System.out.println(average);
        OptionalDouble streamsAverage = Bar.beers.stream().mapToDouble(Beer::getPrice).average();
        System.out.println(streamsAverage);
    }
}
