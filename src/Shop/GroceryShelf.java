package Shop;

import Goods.Grocery.Grocery;

import java.util.TreeSet;

/**
 * Класс продуктовой полки
 * продуты быстро портятся поэтому их нужно выставлять по дате изготовления
 */
public class GroceryShelf extends Shelf<Grocery>
{
    /**
     * Конструктор полки
     * @param name - название
     */
    public GroceryShelf(String name)
    {
        // Передаём в конструктор суперкласса наименование и структуру TreeSet
        // чтобы помещаемые товары сортировались по дате изготовления
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

    /**
     * Метод взять товар с полки
     * @return - выбранный продуктовый товар
     */
    public Grocery take()
    {
        return super.take(((TreeSet<Grocery>) this.goods).first()); // покупатель берёт ближайший к нему товар
    }
}
