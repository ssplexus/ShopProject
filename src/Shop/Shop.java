package Shop;

import Goods.Grocery.Grocery;
import Goods.Household.Hammer;
import Goods.Household.Household;
import Goods.Household.Screwdriver;
import Goods.Household.Shovel;
import Goods.Product;

import java.util.*;

public class Shop
{

    private GroceryShelf shelfMilk;
    private GroceryShelf shelfButter;
    private GroceryShelf shelfBread;
    private HouseholdShelf shelfHousehold;

    public Shop()
    {

        shelfMilk = new GroceryShelf("Milk");
        shelfButter = new GroceryShelf("Butter");
        shelfBread = new GroceryShelf("Bread");
        shelfHousehold = new HouseholdShelf("Household");
    }

    public void add(Product product)
    {
        switch (product.getClass().getSimpleName())
        {
            case "Milk":
                shelfMilk.add((Grocery) product);
                break;
            case "Butter":
                shelfButter.add((Grocery) product);
                break;
            case "Bread":
                shelfBread.add((Grocery) product);
                break;
            default:
                shelfHousehold.add((Household) product);
        }
    }

    public Product take( int productId)
    {
        Product product = null;
        try
        {
            switch (productId)
            {
                case 1: // "Milk"
                    product = shelfMilk.take();
                    break;
                case 2: // "Butter"
                    product = shelfButter.take();
                    break;
                case 3: // "Bread":
                    product = shelfBread.take();
                    break;
                case 4: // "Hammer":
                    product = shelfHousehold.take(Hammer.class);
                    break;
                case 5: // "Screwdriver":
                    product = shelfHousehold.take(Screwdriver.class);
                    break;
                case 6: // "Shovel"
                    product = shelfHousehold.take(Shovel.class);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Product out of stock!");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("No such product!");
        }

        return product;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Store={ ");
        sb.append("\n");
        sb.append(shelfMilk.toString());
        sb.append("\n");
        sb.append(shelfButter.toString());
        sb.append("\n");
        sb.append(shelfBread.toString());
        sb.append("\n");
        sb.append(shelfHousehold.toString());
        sb.append("}\n");
        return sb.toString();
    }
}
