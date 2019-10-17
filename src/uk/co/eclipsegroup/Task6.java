package uk.co.eclipsegroup;

public class Task6 {
    public static void main(String[] args) {
        Double sum = 0d;
        for (Beer beer : Bar.beers) {
            sum += beer.getPrice();
        }
        Boolean testerCheck = sum == 44023d;
        System.out.println(testerCheck);
    }
}
