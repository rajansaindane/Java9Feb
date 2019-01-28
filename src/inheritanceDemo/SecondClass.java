package inheritanceDemo;

public class SecondClass  extends FirstClass  {

     SecondClass() {
        System.out.println("inside Second Class");

    }


    int add(int a,int b)
    {
        System.out.println(" Addition in second Class : ");
        return a+b;
    }

    int sub(int a,int b)
    {
        return a-b;
    }

    public static void main(String[] args) {
        FirstClass secondClass=new SecondClass();
        SecondClass class1= (SecondClass) new FirstClass();
        System.out.println(secondClass.add(1,2));
        System.out.println(secondClass.add());
    }
}
