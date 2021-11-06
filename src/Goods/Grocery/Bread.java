package Goods.Grocery;

import java.time.LocalDateTime;

/**
 * Класс "Хлеб" наследуется от класса продуктового товара
 */
public class Bread extends Grocery
{
    /**
     * Конструктор хлеба
     * @param price - цена
     * @param creationDateTime - дата изготовления
     */
    public Bread(int price, LocalDateTime creationDateTime)
    {
        super("Bread", price, creationDateTime);
    }
}
