package uk.co.eclipsegroup.live;

import uk.co.eclipsegroup.Bar;
import uk.co.eclipsegroup.Beer;

public class Task3 {
    public static void main(String[] args) {
        for(Beer beer : Bar.beers){
            //System.out.println(beer.getPrice());
        }

        Bar.beers.stream().map(Beer::getPrice).forEach(System.out::println);
    }
}
