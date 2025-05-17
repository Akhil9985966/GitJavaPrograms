class Base{
    int a,b;
    Base(){
        super();
        int a=10;
        int b=20;
    }
    void display()
    {
        System.out.println("instance method of base class");
        System.out.println(a);
        System.out.println(b);
    }
}
class Child extends Base{

    int c,d;
    Child(){
        System.out.println(c);
        System.out.println(d);
    }
    void display()
    {
        System.out.println("instane method of child class");
        System.out.println(c);
        System.out.println(d);
    }
}
public class SingleInheritance{
    public static void main(String args[])
    {
        Child c1=new Child();
        c1.display();
    }
}

