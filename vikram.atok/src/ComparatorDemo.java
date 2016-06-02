import org.jetbrains.dekaf.core.SybaseTestHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Vikram on 6/2/2016.
 */

class WaterBottle
{
    int wt,ht;
    public WaterBottle(int wt, int ht)
    {
        this.wt=wt;
        this.ht=ht;
    }
    public String toString()
    {
        return "wt= "+ wt+" ht= "+ht;
    }
}
class Sortbywt implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        return((WaterBottle)obj1).wt- ((WaterBottle)obj2).wt;
    }
}
class Sortbyht implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        return((WaterBottle)obj1).ht- ((WaterBottle)obj2).ht;
    }
}
public class ComparatorDemo {
    public static void main(String[] args)
    {
        ArrayList items=new ArrayList();
        items.add(new WaterBottle(15,30));
        items.add(new WaterBottle(19,32));
        items.add(new WaterBottle(25,38));
        items.add(new WaterBottle(16,28));
        items.add(new WaterBottle(18,26));
        items.add(new WaterBottle(21,29));

        System.out.println("Printing elements");
        System.out.println(items);

        Collections.sort(items,new Sortbywt());
        System.out.println("Printing elements by weight");
        System.out.println(items);

        Collections.sort(items,new Sortbyht());
        System.out.println("Printing elements by height");
        System.out.println(items);
    }
}
