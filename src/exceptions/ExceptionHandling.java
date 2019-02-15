package exceptions;

public class ExceptionHandling {

    void checkThrow() throws Throwable
    {
        finalize();
        throw new ArithmeticException("Arithmatic exceptions occurs");
    }

    void getData()
    {
        System.out.println("check finalize");
    }

    public static void main(String[] args) {
            ExceptionHandling handling=new ExceptionHandling();
          //  handling.checkThrow();
        try
        {
         handling.checkThrow();
        }
        catch (Throwable e)
        {
            System.out.println("rest of code");

        }
        handling.getData();
        }
}
