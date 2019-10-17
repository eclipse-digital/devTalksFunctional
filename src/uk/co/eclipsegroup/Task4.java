package uk.co.eclipsegroup;

public class Task4 {
    public static void main(String[] args) {
        Double sum = 0d;
        for (Beer beer : Bar.beers) {
            sum += beer.getPrice();
        }
        Double avg = sum / Bar.beers.size();
        System.out.println(avg);
    }
}
