package uk.co.eclipsegroup;

import java.util.List;

public class Beer {
    private final String name;
    private final Double price;
    private final Type type;
    private final List<String> hops;

    public Beer(String name, Double price, Type type, List<String> hops) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.hops = hops;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    public List<String> getHops() {
        return hops;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", hops=" + hops +
                '}';
    }
}
