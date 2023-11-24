class Shape{
    public void ap(){};
}
class Rectangle extends Shape{
    int length;
    int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    @Override
    public void ap(){
        System.out.println("The area of the Rectangle is: "+length*width+"\nIts perimeter is: "+2*(length+width));
    };
}
class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    @Override
    public void ap(){
        System.out.println("The area of the Circle is: "+radius*radius*3.14+"\nIts perimeter is: "+2*3.14*radius);
    };
}
public class q2 {
    public static void main(String []args)
    {
        Shape shape=new Circle(7);
        shape.ap();
        Shape shape1=new Rectangle(10,3);
        shape1.ap();
    }
}
