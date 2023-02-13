public class Circle {

    private double radius;

    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
}
