package Goods.Grocery;

import java.time.LocalDateTime;
import java.util.Date;

public class Milk extends Grocery
{
    public Milk(int price, LocalDateTime creationDateTime)
    {
        super("Milk", price, creationDateTime);
    }
}
