package Goods;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Абстрактный класс товара
 */
public abstract class Product
{
    protected final String name; // имя товара
    protected int price; // цена
    protected final int serialNumber; // серийный номер (для хоз товаров)
    protected final LocalDateTime creationDateTime; // дата изготовления (для продуктовых товаров)

    /**
     * Конструктор товара
     * @param name - имя
     * @param price - цена
     * @param serialNumber - серийный номер (для хоз товаров)
     * @param creationDateTime - дата изготовления (для продуктовых товаров)
     */
    public Product(String name, int price, int serialNumber, LocalDateTime creationDateTime)
    {
        if(name == null || price == 0 || serialNumber == 0 && creationDateTime == null)
            throw new IllegalArgumentException();

        this.name = name;
        this.price = price;
        this.serialNumber = serialNumber;
        this.creationDateTime = creationDateTime;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getCreationDateTime()
    {
        return creationDateTime;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && serialNumber == product.serialNumber && name.equals(product.name) && Objects.equals(creationDateTime, product.creationDateTime);
    }

    /**
     * Переопределённая функция вычисления хэш
     * не включена цена, потому что она может меняться
     */
    @Override
    public int hashCode()
    {
        return creationDateTime == null ? Objects.hash(name, serialNumber) : Objects.hash(name, serialNumber, creationDateTime);
    }
}
