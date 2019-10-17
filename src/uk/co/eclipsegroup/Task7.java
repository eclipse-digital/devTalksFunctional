package uk.co.eclipsegroup;

public class Task7 {
    public static void main(String[] args) {
        Double sum = 0d;
        for (Beer beer : Bar.beers) {
            System.out.println(beer);
            sum += beer.getPrice();
        }
        System.out.println(sum);
        Boolean testerCheck = sum == 44023d;
        System.out.println(testerCheck);
        Boolean testerStreamCheck = Bar.beers.stream().peek(System.out::println).mapToDouble(Beer::getPrice).sum() == 44023d;
        System.out.println(testerStreamCheck);
    }
}
