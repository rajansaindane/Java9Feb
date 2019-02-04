package innerclasses;

import abstraction.InterfaceDemo;

public class InnerClassDemo {

    private int showData()
    {
         class MethodInnerDemo
        {
             void methodInnerDemo()
            {
                System.out.println("inside method inner");
            }

        }

        MethodInnerDemo demo=new MethodInnerDemo();
        demo.methodInnerDemo();

        return 10;
    }

    class MemeberInnerDemo
    {
        void memberInnerDemo()
        {
            System.out.println("Member inner "+showData());
        }
    }



    public static void main(String[] args) {

        InnerClassDemo demo=new InnerClassDemo();
        InnerClassDemo.MemeberInnerDemo memeberInnerDemo=demo.new MemeberInnerDemo();
        //memeberInnerDemo.memberInnerDemo();
        demo.showData();

        InterfaceDemo.Demo abstractDemo= new InterfaceDemo.Demo() {
            @Override
            public void check() {

            }
        };

    }

}
