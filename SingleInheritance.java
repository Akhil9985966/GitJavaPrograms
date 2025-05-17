class Base{
    int a,b;
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
}
class Child extends Base{
}
public class SingleInheritance{
    public static void main(String args[]){
    Child c=new Child();
    c.display();
    }
}
