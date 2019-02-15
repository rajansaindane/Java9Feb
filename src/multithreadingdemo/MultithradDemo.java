package multithreadingdemo;

public class MultithradDemo extends Thread {

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

        MultithradDemo demo=new MultithradDemo();
        demo.start();
        try {
            demo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        demo.run();

    }

}
