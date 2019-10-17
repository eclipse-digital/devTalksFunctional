package uk.co.eclipsegroup;

import java.util.ArrayList;
import java.util.List;


public class Task8 {
    public static void main(String[] args) {
        List<Beer> basket= new ArrayList<>();
        for(Beer beer : Bar.beers){
            if(beer.getPrice()<2){
                basket.add(beer);
            }
        }
        System.out.println(basket);
    }
}
