package uk.co.eclipsegroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Bartender {
    private List<Beer> hiddenBeers = new ArrayList<>();
    public List<Beer> getAllBeerForBudget(double budget) {
        return Bar.beers.stream()
                .filter(b -> b.getPrice() <= budget)
                .collect(Collectors.toList());
    }
    public Beer getFirstBeerForBudget(double budget){
        for (Beer beer : Bar.beers) {
            if(beer.getPrice()<=budget){
                return beer;
            }
        }
        return null;
    }

    public Optional<Beer> getFirstBeerOptionalForBudget(double budget){
//        for (Beer beer : Bar.beers) {
//            if(beer.getPrice()<=budget){
//                return Optional.of(beer);
//            }
//        }
//        return Optional.empty();
        return Bar.beers.stream().filter(b->b.getPrice()<=budget).findFirst();
    }

    public Beer findBeerByName(String name){
        return findBeerWithName(name)
                //.get() -> pokazać że to nie jest dobre
                .orElseThrow(()->new RuntimeException("Sorry we dont have beer with that name"));
    }

    public String findBeerTypeByName(String name){
        return findBeerWithName(name)
                .map(Beer::getType)
                .map(Enum::toString)
                .orElse("No such beer"); //vs orElseGet()
    }


    public void hideOneBeerInBudget(double budget){
        getFirstBeerOptionalForBudget(budget).ifPresent(b->hiddenBeers.add(b));
        //-----------------------------------------------------
        Optional<Beer> beer = getFirstBeerOptionalForBudget(budget);
        if(beer.isPresent()){
            hiddenBeers.add(beer.get());
        }else {
            System.out.println("There is no beer to hide");
        }
        //---------------------------------------------------- JAVA 9 !
        getFirstBeerOptionalForBudget(budget).ifPresentOrElse(b->hiddenBeers.add(b),()-> System.out.println("There is no beer to hide"));
    }

    public Beer findBeerByNameIfNotHidden(String name){
        return findBeerWithName(name)
                .filter(b->!hiddenBeers.contains(b))
                .orElseThrow(()->new RuntimeException("Sorry we dont have beer with that name"));
    }

    private Optional<Beer> findBeerWithName(String name) {
        return Bar.beers.stream()
                .filter(b -> b.getName().equals(name))
                .findFirst();
    }
}
