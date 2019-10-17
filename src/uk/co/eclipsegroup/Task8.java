package uk.co.eclipsegroup;

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
        List<Beer> streamBasket = Bar.beers.stream().filter(b -> b.getPrice() < 2).collect(Collectors.toList());
    }
}
