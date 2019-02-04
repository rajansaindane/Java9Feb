package abstraction;

public class CheckAbstraction extends AbstractDemo implements InterfaceDemo,CheckMultipleInheritance{

    @Override
    public void getDetails() {

    }

    InterfaceDemo demo;


    void checkInterface()
    {
    }

    public static void main(String[] args) {


        AbstractDemo demo=new AbstractDemo() {
            @Override
            public void getDetails() {

            }
        };
       InterfaceDemo demo1=new InterfaceDemo() {
           @Override
           public void calculations(int a, int b) {

           }
       };
        System.out.println("cal in Interface demo====>"+demo1.calculations(1,2,3));

        CheckAbstraction checkAbstraction=new CheckAbstraction();
        System.out.println("override by check interface =====>"+checkAbstraction.calculations(10,20,30));

    }

    @Override
    public void calculations(int a, int b) {

    }

    @Override
    public int calculations(int a, int b, int c) {
        return a+b+c;
    }

}
