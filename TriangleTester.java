public class TriangleTester {
  public static void main(String[] args) {
    Triangle triangle1 = new Triangle(0,0,3,0,3,3);
    System.out.println(triangle1.getPerimeter());
    System.out.println(triangle1.getArea());
    System.out.println(triangle1.classify());
    System.out.println(triangle1);
    Point a = new Point (0,0);
    Point b = new Point (5,0);
    Point c = new Point (3,3);
    Triangle triangle2 = new Triangle(a,b,c);
    System.out.println(triangle2.classify());
    System.out.println(triangle2);
    Triangle triangle3 = new Triangle(0.0,(2.0*(Math.sqrt(3))),-2.0,0.0,2.0,0.0);
    System.out.println(triangle3.classify());
    System.out.println();
    Point p1 = new Point (25.2,10.0);
    triangle1.setVertex(1,p1);
    System.out.println(triangle1);
  }
}
