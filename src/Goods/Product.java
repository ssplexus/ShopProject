package Goods;

import java.time.LocalDateTime;
import java.util.Objects;

abstract public class Product
{
    protected final String name;
    protected int price;
    protected final int serialNumber;
    protected final LocalDateTime creationDateTime;

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

    public void setPrice(int price) {
        this.price = price;
    }

    public long getSerialNumber()
    {
        return serialNumber;
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

    @Override
    public int hashCode()
    {
        return creationDateTime == null ? Objects.hash(name, serialNumber) : Objects.hash(name, serialNumber, creationDateTime);
    }
}
