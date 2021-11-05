package Shop;

import Goods.Household.Household;

import java.util.HashSet;
import java.util.NoSuchElementException;

public class HouseholdShelf extends Shelf<Household>
{
    public HouseholdShelf(String name)
    {
        super(name, new HashSet<>());
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name + ": ");
        int i = 0;
        for(Household goods: this.goods)
        {
            sb.append(i++ +"-" + goods.toString() + " ");
        }
        return sb.toString().trim();
    }

    public <T extends Household> Household take(Class<T> productClass)
    {
        if(this.goods.isEmpty())
            throw new NoSuchElementException();
        for(Household product : this.goods)
        {
            if(productClass.isInstance(product))
                return super.take(product);
        }
        throw new NoSuchElementException();
    }
}

