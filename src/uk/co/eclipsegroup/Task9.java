package uk.co.eclipsegroup;

public class Task9 {
    public static void main(String[] args) {
        StringBuilder menu = new StringBuilder();
        for (Beer beer : Bar.beers) {
            menu.append(beer).append(",\n");
        }
        menu.setLength(menu.length() - 2);
        System.out.println(menu.toString());
    }
}
