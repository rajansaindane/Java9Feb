package string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckString {

    void checkString()
    {
        String s="codekul";

        for (int i=0;i<10;i++)
        {
            s=s.concat("institute");
        }

    }

    void checkStringBuffer()
    {
        StringBuffer s=new StringBuffer("codekul");

        for (int i=0;i<10;i++)
        {
            s.append("institute");
        }

    }

    void checkStringBuilder()
    {
        StringBuilder s=new StringBuilder("codekul");

        for (int i=0;i<10;i++)
        {
            s.append("institute");
        }

    }

    public static void main(String[] args) {
        CheckString checkString=new CheckString();
        Long currentTimeString=System.currentTimeMillis();
        checkString.checkString();
        Long timeForString=System.currentTimeMillis()-currentTimeString;
        System.out.println("Time Required for string : "+timeForString);

        Long currentTimeStringBuff=System.currentTimeMillis();
        checkString.checkStringBuffer();
        Long timeForStringBuf=System.currentTimeMillis()-currentTimeStringBuff;
        System.out.println("Time Required for string buffer : "+timeForStringBuf);

        Long currentTimeStringBuild=System.currentTimeMillis();
        checkString.checkStringBuilder();
        Long timeForStringBuild=System.currentTimeMillis()-currentTimeStringBuild;
        System.out.println("Time Required for string builder : "+timeForStringBuild);


        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy HH:MM:SSSS");
        Date d1 = new Date(System.currentTimeMillis());
        System.out.println(format.format(d1));
    }


}
