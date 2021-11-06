package Goods.Grocery;

import Goods.Product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Абстрактный класс продуктового товара наследуется от класса товара
 * и имплементирует интерфейс Comparable для использования в структуре TreeSet
 */
public abstract class Grocery extends Product implements Comparable<Grocery>
{
    /**
     * Конструктор продуктового товара
     * @param name - наименование товара
     * @param price - цена
     * @param creationDateTime - дата изготовления
     */
    public Grocery(String name, int price, LocalDateTime creationDateTime)
    {
        this(name, price, 0, creationDateTime); // у продуктового товара нет серийного номера
    }

    private Grocery(String name, int price, int serialNumber, LocalDateTime creationDateTime)
    {
        super(name, price, serialNumber, creationDateTime);
    }

    /**
     * Переопределение метода сравнения для сравнения по дате изготовления
     * @param o - продуктовый товар
     * @return - результат сравнения
     */
    @Override
    public int compareTo(Grocery o)
    {
        return this.creationDateTime.compareTo(o.getCreationDateTime());
    }

    @Override
    public String toString()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return "[" + name + " | " + creationDateTime.format(formatter) + "]";
    }
}
