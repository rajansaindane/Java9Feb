public class Demo {
   public static void showData()
    {
        System.out.println("Inside show method");

    }

    static
    {
        System.out.println("inside static");
    }

    public static void main(String[] args) {

        Demo demo=new Demo();
        demo.showData();
        System.out.println("inside main");


    }


}
