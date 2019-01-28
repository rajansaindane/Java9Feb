package controlstatement;

import java.util.Scanner;

public class SwitchCaseDemo {

    Student student=new Student();

    Student getAllStudent()
    {
        student.setName("Codekul");
        student.setCity("Pune");
        student.setId(1);
        return student;
    }


    static int add(int a,int b)
    {
        int result=a+b;
        if (result%2==0)
        {
            return result;
        }
        else {
            return result;
        }
        }
   static int sub(int a,int b)
    {
        return a-b;
    }
    static int mul(int a,int b)
    {
        return a*b;
    }

    public static void main(String[] args) {
        SwitchCaseDemo demo=new SwitchCaseDemo();
        int a=0,b=0,choice;
        System.out.println("1.  Add\n" +
                "2. Sub\n" +
                "3. Mul");
        System.out.println("Enter your choice : ");
        Scanner scanner=new Scanner(System.in);
        choice=scanner.nextInt();
        if (choice<=3) {
            System.out.println("enter the values : ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        switch (choice)
        {
            case 1:
                System.out.println("result : "+add(a,b));
                break;
            case 2:
                System.out.println("result : "+sub(a,b));
                break;
            case 3:
                System.out.println("result : "+mul(a,b));
                break;

                default:
                    System.out.println("Invalid choice");
        }

        System.out.println(demo.getAllStudent().getName());
        System.out.println(demo.getAllStudent().getCity());
        System.out.println(demo.getAllStudent().getId());

    }

}
