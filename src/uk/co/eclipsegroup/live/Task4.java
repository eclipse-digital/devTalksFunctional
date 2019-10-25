package uk.co.eclipsegroup.live;

import uk.co.eclipsegroup.Bar;
import uk.co.eclipsegroup.Beer;

import java.util.OptionalDouble;

public class Task4 {
    public static void main(String[] args) {
        double sum = 0d;
        for (Beer beer : Bar.beers) {
            sum += beer.getPrice();
        }
        double avgImperative = sum / Bar.beers.size();
        System.out.println(avgImperative);

        OptionalDouble arv = Bar.beers.stream()
                .mapToDouble(Beer::getPrice)
                .average();

        System.out.println(arv.getAsDouble());
    }
}
