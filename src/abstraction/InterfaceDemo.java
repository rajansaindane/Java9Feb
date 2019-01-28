package abstraction;

public interface InterfaceDemo {


    void calculations(int a,int b);

    default int calculations(int a,int b,int c)
        {
            return a+b+c;
        }

}
