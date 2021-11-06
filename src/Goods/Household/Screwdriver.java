package Goods.Household;

/**
 * Класс "Отвёртка" наследуется от класса хозяйственного товара
 */
public class Screwdriver extends Household
{
    /**
     * Конструктор отвёртки
     * @param price - цена
     * @param serialNumber - серийный номер
     */
    public Screwdriver(int price, int serialNumber)
    {
        super("Screwdriver", price, serialNumber);
    }
}
