package string;

public class StringBufferAndBuilder {

    public static void main(String[] args) {
        String s="codekul";
        StringBuffer buffer=new StringBuffer("Java");
        buffer.append(" Training");
        s.concat("Training");
        System.out.println("buffer : "+buffer);
        System.out.println("string : "+s);
    }

}
