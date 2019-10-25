package uk.co.eclipsegroup;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        Set<String> hops = new HashSet<>();
        for (Beer beer : Bar.beers) {
            hops.addAll(beer.getHops());
        }
        System.out.println(hops);

        Set<String> hopsFunctional = Bar.beers.stream()
                .map(Beer::getHops)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
        System.out.println(hopsFunctional);
    }
}
