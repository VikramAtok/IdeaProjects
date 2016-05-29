/**
 * Created by Vikram on 5/29/2016.
 */
public class Fibonacci {
    static int fibo(int num)
    {
        if (num==0)
        {
            return 0;

        }
        else if(num<2)
            return 1;

        return fibo(num-1)+fibo(num-2);
    }
    public static void main(String[] args) {
        //System.out.println(Finbonacci.fibo(10));
        System.out.println("******Recursive method*******");
        for (int j=0;j<10;j++)
        {
            System.out.print(Fibonacci.fibo(j)+" ");
        }
        System.out.println();
        System.out.println("******Using loop*******");
        int prev=0,next=1,sum,n;
        for(n=1;n<=10;n++)
        {
            System.out.print(prev+" ");
            sum=prev+next;
            prev=next;
            next=sum;

        }
        System.out.println();


        System.out.println("******simplest way******");
        int a=0,b=1;
        for(int i=10;i>0;i--)
        {
            System.out.print(a+" ");
            a=a+b;
            b=a-b;
            //System.out.println();
            //System.out.print(a+" ");
        }



    }

}

