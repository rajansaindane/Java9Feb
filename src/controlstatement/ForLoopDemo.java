package controlstatement;

public class ForLoopDemo {

    void callAgain(int i)
    {
        if (i<3) {
            i++;
            System.out.println("recursive call : "+i);
            callAgain(i);

        }

        }



    public static void main(String[] args) {
        new ForLoopDemo().callAgain(0);
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.println("i : "+i+" j : "+j);
            }

        }

        int[]  str={1,2,3};
        for (int s:str) {
            System.out.println("array : "+s);
        }


        int k=0;
        while (k<3)
        {
            System.out.println("k in whhile : "+k);
            k++;
        }

        do {
            System.out.println("k in do while : "+k);
            k++;
        }while (k<3);

    }
}
