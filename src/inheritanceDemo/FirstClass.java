package inheritanceDemo;

public class FirstClass extends Thread {


    public FirstClass() {
        System.out.println("inside First Class");
    }

    int add(int a,int b)
    {
        System.out.println(" Addition in first Class : ");
        return a+b;
    }
    int add()
    {
        System.out.println(" Addition in first Class : ");
        return 10+20;
    }

    public static void main(String[] args) {

    }

}
