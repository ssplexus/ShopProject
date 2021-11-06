package Goods.Household;

import Goods.Product;

/**
 * Абстрактный класс хозяйственного товара
 */
public abstract class Household extends Product
{
    /**
     * Конструктор хозяйственного товара
     * @param name - наименование
     * @param price - цена
     * @param serialNumber - серийный номер
     */
    public Household(String name, int price, int serialNumber)
    {
        super(name, price, serialNumber, null); // считаем, что нет даты изготовления
    }

    @Override
    public String toString() {
        return "[" + this.name + " | " + serialNumber + "]";
    }
}
