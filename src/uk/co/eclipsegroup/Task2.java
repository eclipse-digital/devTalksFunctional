package uk.co.eclipsegroup;

public class Task2 {
    public static void main(String[] args) {
        for (Beer beer : Bar.beers) {
            System.out.println(beer.getName());
        }
        Bar.beers.forEach(b -> System.out.println(b.getName()));
        Bar.beers.stream().map(Beer::getName).forEach(System.out::println);
    }
}
