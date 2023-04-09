package shape;

abstract class shapes{
    
    shapes(){

    }
    void area(){
        System.out.println("Calculate the area of shape");
    }
    void parameter(){
        System.out.println("Calculate the parameter of shape");
    }
}
class Rectangle extends shapes{
   Rectangle(){
    System.out.println("Rectangle");
   }
   void area(){
    int l = 10;
    int b = 12;
    System.out.println("Area of ractangle :"+ l*b);
   }
   void parameter(){
    int l = 10;
    int b = 12;
    System.out.println("Perimeter of ractangle :"+ 2*(l+b));
   }
}
class Square extends shapes{
    Square(){
        System.out.println("Square");
   }
   void area(){
    int a =2;
    System.out.println("Area of square :"+ a*a);
   }
   void parameter(){
    int a =2;
    System.out.println("perimeter of square :"+ 2*a);
   }
}
 class Circle extends shapes{
    Circle(){
        System.out.println("CIrcle");
    }
    void area(){
        int r = 6;
        System.out.println("Area of circle :"+Math.round(3.14 *r*r));
    }
    void circumference(){
        int r = 6;
        System.out.println("Circumference of circle: "+Math.round(2*3.14*r));
    }
 }

public class shapemain {
    static void call (shapes shapes){
        shapes.area();
        shapes.parameter();
        if(shapes instanceof Circle){
            ((Circle)shapes).circumference();//Downcasting
        }
    }
    public static void main(String[] args) {
        System.out.println("________________________Downcasting__________________");
        call(new Rectangle());
        call(new Square());
        call(new Circle());
        System.out.println("________________________Upcasting__________________");
        shapes sh = new Rectangle();
        sh.area();
        sh.parameter();
        shapes sha = new Circle();
        sha.area();
        // sha.circumference();
    }
}
