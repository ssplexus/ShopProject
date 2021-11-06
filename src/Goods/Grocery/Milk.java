package Goods.Grocery;

import java.time.LocalDateTime;

/**
 * Класс "Молоко" наследуется от класса продуктового товара
 */
public class Milk extends Grocery
{
    /**
     * Конструктор молока
     * @param price - цена
     * @param creationDateTime - дата изготовления
     */
    public Milk(int price, LocalDateTime creationDateTime)
    {
        super("Milk", price, creationDateTime);
    }
}
