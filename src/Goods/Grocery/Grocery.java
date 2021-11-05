package Goods.Grocery;

import Goods.Product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


abstract public class Grocery extends Product implements Comparable<Grocery>
{
    public Grocery(String name, int price, LocalDateTime creationDateTime)
    {
        this(name, price, 0, creationDateTime);
    }

    private Grocery(String name, int price, int serialNumber, LocalDateTime creationDateTime)
    {
        super(name, price, serialNumber, creationDateTime);
    }

    @Override
    public int compareTo(Grocery o)
    {
        return this.creationDateTime.compareTo(o.getCreationDateTime());
    }

    @Override
    public String toString()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return "[" + name + " | " + creationDateTime.format(formatter) + "]";
    }
}
