public class PointTester {
  public static void main(String[] args) {
    Point p1 = new Point(3.2, 6.5);
    System.out.println(p1);
    System.out.println(p1.getX()); // 3.2
    System.out.println(p1.getY()); // 6.5
    Point p2 = new Point (0,0);
    System.out.println(p2);
    System.out.println(p2.getX()); // 0
    System.out.println(p2.getY()); // 0
    System.out.println(p2.distanceTo(p1)); // 7.2
    System.out.println(p2.equals(p1)); // false
  }
}
