package multithreadingdemo;

public class MultithreadingUsingRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            try {
                Thread.sleep(500);
                System.out.println(i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MultithreadingUsingRunnable runnable=new MultithreadingUsingRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
