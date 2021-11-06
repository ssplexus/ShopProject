package Shop;

import Goods.Household.Household;

import java.util.HashSet;
import java.util.NoSuchElementException;

/**
 * Класс полки хозяйственных товаров
 */
public class HouseholdShelf extends Shelf<Household>
{
    /**
     * Конструктор полки хозтоваров
     * @param name - наименование
     */
    public HouseholdShelf(String name)
    {
        // Передаём в конструктор супер класса наименование и структуру HashSet
        // порядок размещения на полке нам не важен
        super(name, new HashSet<>());
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(": ");
        int i = 0;
        for(Household goods: this.goods)
        {
            sb.append(i++).append("-").append(goods.toString()).append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * Метод взять с полки
     * @param productClass - класс продукта который мы хотим взять
     * @param <T> - ожидаем класс хозяйственного товара
     * @return - выбранный хоз товар
     */
    public <T extends Household> Household take(Class<T> productClass)
    {
        if(this.goods.isEmpty()) // если полка пуста, то выбрасываем исключение
            throw new NoSuchElementException();

        for(Household product : this.goods)
        {
            if(productClass.isInstance(product))
                return super.take(product); // возвращаем первый найденный товар нужного класса
        }
        throw new NoSuchElementException(); // если не нашли выбрасываем исключение
    }
}

