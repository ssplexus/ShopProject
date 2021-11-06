package Shop;

import Goods.Grocery.Grocery;
import Goods.Household.Hammer;
import Goods.Household.Household;
import Goods.Household.Screwdriver;
import Goods.Household.Shovel;
import Goods.Product;

import java.util.*;

/**
 *  Класс магазина
 */
public class Shop
{
    private final GroceryShelf shelfMilk; // Полка с молоком
    private final GroceryShelf shelfButter; // Полка с маслом
    private final GroceryShelf shelfBread; // Полка с хлебом
    private final HouseholdShelf shelfHousehold; // Полка с хозтоварами

    /**
     *  Конструктор магазина
     */
    public Shop()
    {

        shelfMilk = new GroceryShelf("Milk");
        shelfButter = new GroceryShelf("Butter");
        shelfBread = new GroceryShelf("Bread");
        shelfHousehold = new HouseholdShelf("Household");
    }

    /**
     * Метод добавления продуктов в магазин
     * @param product - продукт для добавления
     */
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

    /**
     * Метод выбора товара
     *
     * @param productId - номер продукта
     * @return - выбранный продукт
     */
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
        catch (NoSuchElementException e) // если больше нет такого товара
        {
            System.out.println("Product out of stock!");
        }
        catch (IllegalArgumentException e) // если выбран продукт не из ассортимента
        {
            System.out.println("No such product!");
        }

        return product;
    }

    @Override
    public String toString()
    {
        return  "Store={ " +
                "\n" +
                shelfMilk +
                "\n" +
                shelfButter +
                "\n" +
                shelfBread +
                "\n" +
                shelfHousehold +
                "}\n";
    }
}
