package uk.co.eclipsegroup;

import java.util.Optional;

public class Task18 {
    public static void main(String[] args) {
        Beer freeBeer = freeBeer();
        if (freeBeer != null) {
            System.out.println(freeBeer.getHops());
        }

        Optional.ofNullable(freeBeer).map(Beer::getHops).ifPresent(System.out::println);
    }

    private static Beer freeBeer() {
        return null;
    }
}
