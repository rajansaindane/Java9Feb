package controlstatement;

import java.util.Scanner;

public class IfStatement {
   static int number;

   void   showData()
   {
       int a=10;
       int c=a++;//c=10 a=11
       int b=(++a)+(c++)-(a--);//b=10,a=11,c=11
       int d=(a++)+(++c)+(b++);//d=33,a=12,c=12,b=11
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);

   }
    void ifConditions()
    {
        if (number%2==0)
        {
            System.out.println("given number is even");
        }

        else
        {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the Number : ");
        number=scanner.nextInt();
        new IfStatement().ifConditions();
        new IfStatement().showData();

    }


}
