package Shop;

import Goods.Product;

import java.util.Set;

/**
 * Абстрактный параметризованный класс
 * @param <T> - любой тип наследующий класс Product
 */
public abstract class Shelf <T extends Product>
{
    protected String name; // название полки
    protected Set<T> goods; // товары на полке

    /**
     * Конструктор полки
     *
     * @param name - название полки
     * @param goods - товары
     */
    public Shelf(String name, Set<T> goods)
    {
        this.name = name;
        this.goods = goods;
    }

    /**
     * Добавление товаров на полку
     * @param product - товар
     * @return - булевый результат
     */
    public boolean add(T product)
    {
        return goods.add(product);
    }

    /**
     * Метод взять с полки
     * @param product - товар
     * @return - взятый товар или null в случае отсутствия
     */
    protected T take(T product)
    {
        if(goods.remove(product))
            return product;
        else
            return null;
    }
}
