package Goods.Household;

import Goods.Product;

abstract public class Household extends Product
{
    public Household(String name, int price, int serialNumber)
    {
        super(name, price, serialNumber, null);
    }

    @Override
    public String toString() {
        return "[" + this.name + " | " + serialNumber + "]";
    }

}
