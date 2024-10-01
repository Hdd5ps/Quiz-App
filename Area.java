public class Area {
    public static int calculateRectArea(int length, int breadth) {
        int area = length * breadth;
        return area;
    }
    public static void main(String[] args) {
        int areaRect = calculateRectArea(5, 9);
        System.out.println("The area of the rectangle is: " + areaRect);
    }
}
