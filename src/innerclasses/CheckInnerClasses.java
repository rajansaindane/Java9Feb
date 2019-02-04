package innerclasses;

public class CheckInnerClasses {

    public static void main(String[] args) {
        InnerClassDemo demo=new InnerClassDemo();
        InnerClassDemo.MemeberInnerDemo demo1=demo.new MemeberInnerDemo();
        demo1.memberInnerDemo();
    }

}
