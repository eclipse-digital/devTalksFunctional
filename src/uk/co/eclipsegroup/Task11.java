package uk.co.eclipsegroup;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        Set<String> allHops = new HashSet<>();
        for (Beer beer : Bar.beers) {
            allHops.addAll(beer.getHops());
        }
        System.out.println(allHops);

        System.out.println(Bar.beers.stream().map(Beer::getHops).flatMap(List::stream).collect(Collectors.toSet()));
        System.out.println(Bar.beers.stream().flatMap(b -> b.getHops().stream()).collect(Collectors.toSet()));
    }
}
