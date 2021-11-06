package Goods.Grocery;

import java.time.LocalDateTime;

/**
 * Класс "Масло" наследуется от класса продуктового товара
 */
public class Butter extends Grocery
{
    /**
     * Конструктор масла
     * @param price - цена
     * @param creationDateTime - дата изготовления
     */
    public Butter(int price, LocalDateTime creationDateTime)
    {
        super("Butter", price, creationDateTime);
    }
}
