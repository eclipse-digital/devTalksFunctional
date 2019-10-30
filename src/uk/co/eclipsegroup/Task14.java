package uk.co.eclipsegroup;

public class Task14 {
    public static void main(String[] args) {
        for (Beer beer : Bar.beers) {
            if(beer.getPrice()<2){
                System.out.println(beer);
                break;
            }
        }
        System.out.println(Bar.beers.stream().filter(b->b.getPrice()<2).findAny());
    }
}
