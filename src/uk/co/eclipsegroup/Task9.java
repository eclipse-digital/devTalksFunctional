package uk.co.eclipsegroup;

import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        StringBuilder menu = new StringBuilder();
        for (Beer beer : Bar.beers) {
            menu.append(beer).append(",\n");
        }
        menu.setLength(menu.length() - 2);
        System.out.println(menu.toString());

        String collect = Bar.beers.stream()
                .map(Beer::toString)
                .collect(Collectors.joining(",\n"));

        System.out.println(collect);
    }
}
