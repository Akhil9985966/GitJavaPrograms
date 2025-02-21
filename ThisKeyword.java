class Student{
    int a,b;
    Student(){
        System.out.println("default constructor");
    }
    Student(int a){
        this();
        this.a=a;
        System.out.println("single param constructor");
    }
    Student(int a ,int b){//a=10,b=20
       this(a);
        this.a=a;
        this.b=b;
        System.out.println("double parameterized constructor");

    }
    void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
   public class ThisKeyword{
    public static void main(String args[]){
         Student s1=new Student(30,20);
         s1.display();
    }
   }