package Goods.Grocery;

import java.time.LocalDateTime;
import java.util.Date;

public class Bread extends Grocery
{
    public Bread(int price, LocalDateTime creationDateTime)
    {
        super("Bread", price, creationDateTime);
    }
}
