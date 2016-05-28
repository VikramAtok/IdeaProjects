import java.util.Scanner;
/**
 * Created by Vikram on 5/27/2016.
 */
public class PasswordVerification {
    // Password should be more than 8 characters with atleast one special character, one number and one capital letter
    int countAlpha;
    int countNumb;
    int countSpl;
    boolean isValid(String psd)
    {
        char[]pswd=psd.toCharArray();
        countNumb=0;
        countAlpha=0;
        countSpl=0;
        if(pswd.length<8)
        {
            return false;
        }
        else if(pswd.length>=8)
        {
            for(int i=0;i<pswd.length;i++)
            {
                char p=psd.charAt(i);
                if(p>=33 && p<=47 )
                {
                    countSpl++;
                    continue;
                }
                else if(p>=58 && p<=64)
                {
                    countSpl++;
                    continue;
                }
                else if(p>=48 && p<=57)
                {
                    countNumb++;
                    continue;
                }
                else if(p>=65 && p<=91)
                {
                    countAlpha++;
                    continue;
                }
                else if(p>=97 && p<=122)
                {

                    continue;
                }
                else

                    return false;
            }
            if(countAlpha>=1 && countNumb>=1 && countSpl>=1)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        PasswordVerification pd= new PasswordVerification();
        System.out.println("enter the password");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        if(pd.isValid(input))
        {
            System.out.println("Success!!! Password is accepted");
        }
        else
        {
            System.out.println("Try again");
        }
        }
       // System.out.println(pd.countAlpha);
       // System.out.println(pd.countNumb);
       // System.out.println(pd.countSpl);
    }





