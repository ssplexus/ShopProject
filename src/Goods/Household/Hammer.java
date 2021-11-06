package Goods.Household;

/**
 * Класс "Молоток" наследуется от класса хозяйственного товара
 */
public class Hammer extends Household
{
    /**
     * Конструктор молотка
     * @param price - цена
     * @param serialNumber - серийный номер
     */
    public Hammer(int price, int serialNumber)
    {
        super("Hammer", price, serialNumber);
    }
}
