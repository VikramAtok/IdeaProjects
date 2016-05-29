/**
 * Created by Vikram on 5/29/2016.
 */
public class Prime_no {
    public static void main(String[] args) {
        int num=100;
        for (int i=1;i<num;i++)
        {
            int j;
            for( j=2;j<i;j++)
            {
                int n=i%j;
                if(n==0)
                    break;
            }
            if(i==j)
            {
                System.out.print(" "+i);

            }


        }
    }

}

