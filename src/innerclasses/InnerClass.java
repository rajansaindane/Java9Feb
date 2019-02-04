package innerclasses;

import abstraction.AbstractDemo;

public class InnerClass {

   private static void innerClassMethod()
    {
        System.out.println("Inner Class method");
    }

    static class MemberInner{

        static void MemberInnerClassMethod()
        {
            System.out.println("Member Inner Class method");
            innerClassMethod();
        }

        static class InnerMemberInner{
            static void innerMemberInner()
            {

            }
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass=new InnerClass();
        InnerClass.MemberInner.InnerMemberInner.innerMemberInner();
        AbstractDemo demo=new AbstractDemo() {
            @Override
            public void getDetails() {

            }
        };
        demo.getDetails();
    }

}
