package keywords;

public class StaticKeyDemo

{

    static int count;


    static void getData()
    {

    }
    void showData()
    {
        getData();
    }

    public static void main(String[] args) {
        getData();
        new  StaticKeyDemo().showData();
    }


}
