package Goods.Household;

/**
 * Класс "Лопата" наследуется от класса хозяйственного товара
 */
public class Shovel extends Household
{
    /**
     * Конструктор лопаты
     * @param price - цена
     * @param serialNumber - серийный номер
     */
    public Shovel(int price, int serialNumber)
    {
        super("Shovel", price, serialNumber);
    }
}
