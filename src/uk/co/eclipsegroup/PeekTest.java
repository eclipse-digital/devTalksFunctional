package uk.co.eclipsegroup;

public class PeekTest {
    public static void main(String[] args) {
        long count = Bar.beers.stream().filter(b->true).peek(System.out::println).count();
        System.out.println(count);
    }
}
