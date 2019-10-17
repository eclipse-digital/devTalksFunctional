package uk.co.eclipsegroup;

public class Task1 {
    public static void main(String[] args) {
        for (Beer beer : Bar.beers) {
            System.out.println(beer);
        }
        Bar.beers.stream().forEach(b -> System.out.println(b));
        Bar.beers.forEach(b -> System.out.println(b));
        Bar.beers.forEach(System.out::println);
    }
}
