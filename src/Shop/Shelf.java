package Shop;

import Goods.Product;

import java.util.Set;

abstract public class Shelf <T extends Product>
{
    protected String name;
    protected Set<T> goods;

    public Shelf(String name, Set<T> goods)
    {
        this.name = name;
        this.goods = goods;
    }

    public boolean add(T product)
    {
        return goods.add(product);
    }

    protected T take(T product)
    {
        if(goods.remove(product))
            return product;
        else
            return null;
    }
}
