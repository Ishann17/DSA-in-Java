class Parent{
    int a, b;
    Parent(){
        a = 10;
        b = 20;
        System.out.println("Parent Constructor Called");
    }
    Parent(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Parent Parameterized Constructor Called");
    }
}
class  Child extends Parent{
    int x, y;
    Child(){
        super(33, 44);
        x = 111;
        y = 222;
        System.out.println("Child Constructor Called");
    }
    Child(int x, int y){
        super(x,y);
        this.x = x;
        this.y = y;
        System.out.println("Child Parameterized Constructor is Called");
    }
    void display(){
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
        System.out.println("Value of x is " + x);
        System.out.println("Value of y is " + y);
    }
}
public class ConstructorExecutionInheritance {
    public static void main(String[] args) {
        Child ch = new Child(77, 99);
        ch.display();
    }
}
