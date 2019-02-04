package innerclasses;

public class MethodInner {
    void getData()
    {
        class InnerMethod
        {
            void innerMethod()
            {
                System.out.println("Inner method");
            }
        }
        InnerMethod method=new InnerMethod();
        method.innerMethod();
    }

    public static void main(String[] args) {
        new MethodInner().getData();
    }
}
