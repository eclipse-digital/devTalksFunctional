package uk.co.eclipsegroup.live;

import uk.co.eclipsegroup.Bar;
import uk.co.eclipsegroup.Beer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<Beer> basket = new ArrayList<>();
        for (Beer beer : Bar.beers) {
            if (beer.getPrice() < 2) {
                basket.add(beer);
            }
        }
        System.out.println(basket);
        basket = Bar.beers.stream().filter(beer -> beer.getPrice() < 2).collect(Collectors.toList());
        System.out.println(basket);
    }
}
