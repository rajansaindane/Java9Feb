package string;

public class StringDemo {

    public static void main(String[] args) {


        String s="codekul";
        //s=s.concat(" Institute");
        System.out.println(s);
        String s1="codekul";
        String s2=new String("codekul");


        if (s==s1)
        {
            System.out.println(s.hashCode());
            System.out.println(s1.hashCode());
            System.out.println("true");
        }
        else
        {
            System.out.println(s.hashCode());
            System.out.println(s2.hashCode());
            System.out.println("false");
        }

    }

}
