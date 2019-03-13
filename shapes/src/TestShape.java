public class TestShape {
    public static void main(String[] args) {

       Shape [] shapes = {new Rectangle(), new Circle(), new Triangle()};

       //  Rectangle
       Shape rectangle = new Rectangle(5,7);
        System.out.println("\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter());

      //Circle
        Shape circle = new Circle(5);
        System.out.println("\nResulting Area: " + circle.area()
                + "\nResulting Perimeter: " + circle.perimeter());

        // Triangle
        Shape triangle = new Triangle(5,3,4);
        System.out.println("\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter());
    }
}