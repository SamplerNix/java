import java.util.Scanner;
import mypacakage.Greeting;
import shapes.Circle;
interface shape{
    static Scanner tb = new Scanner(System.in);
    public static void getArea(int a,double b){
        System.out.println("Area of Rectangle:"+a*b);
    }
    public static void getArea(double radius){
        System.out.println("Area of circle:"+3.14*radius*radius);
    }
    public static void getArea(int a, int b){
        System.out.println("Area of circle:"+0.5*a*b);
    }
}
class rectangle implements shape {
    public static void area() {
        System.out.println("Enter the length:");
        int n = tb.nextInt();
        System.out.println("Enter the Breadth:");
        double k=tb.nextDouble();
      shape.getArea(n,k);
    }
}
class circle implements shape{
    circle(){
        System.out.println("Enter the Radius of the circle");
        double radius=tb.nextDouble();
        shape.getArea(radius);
    }
}
class triangle implements shape{
    triangle(){
        System.out.println("Enter the height of the triangle:");
        int a=tb.nextInt();
        System.out.println("Enter the base of the triangle:");
        int b=tb.nextInt();
        shape.getArea(a,b);

    }
}
public class Assignment2 {
    public static void main(String[] args){
        Greeting.sayHello();
        Circle.area(2.3);
    }
}
