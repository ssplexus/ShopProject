package Shop;

import Goods.Grocery.Grocery;

import java.util.Set;
import java.util.TreeSet;

public class GroceryShelf extends Shelf<Grocery>
{
    public GroceryShelf(String name)
    {
        super(name, new TreeSet<>());
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(name + ": ");
        for(Grocery goods: this.goods)
        {
            sb.append(goods.toString());
        }
        return sb.toString();
    }

    public Grocery take()
    {
        return super.take(((TreeSet<Grocery>) this.goods).first());
    }
}
