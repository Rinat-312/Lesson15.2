package Domashka15;

public class Circle {
    private static double PI;
    private static int radius  ;

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }

    public static int getRadius() {
        return radius;
    }

    public static void setRadius(int radius) {
        Circle.radius = radius;
    }

    public static void area(){
        System.out.println("Radius = "+Math.PI*(radius *radius));;
    }
    public static void circumference(){
        System.out.println("Circumference = "+Math.PI*2*radius);
    }
}
