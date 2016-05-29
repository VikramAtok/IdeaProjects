/**
 * Created by Vikram on 5/29/2016.
 */
public class Factorial {
    static int fac(int num)
    {
        int result=1;
        for(int j=1;j<=num;j++)
        {
            result=result*j;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("******  Recursive Method ******");
        System.out.println("10! = "+ Factorial.fac(10));
        int num=10;
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("****** Iterative Method *******");
        System.out.println(num+"!"+" = "+fact);
    }

}

