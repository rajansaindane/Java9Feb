package constructor;

public class ConstructorDemo {
    String name;
    int id;



    ConstructorDemo(String name,int id)
    {
        this.name=name;
        this.id=id;
    }


    void showData()
    {
        System.out.println("name  : "+name);
        System.out.println("id  : "+id);
    }


    public static void main(String[] args) {
        ConstructorDemo demo=new ConstructorDemo("Codekul",1);
        demo.showData();
    }

}
