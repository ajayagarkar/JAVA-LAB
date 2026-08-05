class Circle{
    final double PI = 3.14;
    void area(double radius){
        double result = PI * radius * radius;
        System.out.println("Area = " + result);
    }
    public static void main(String[] args){
        Circle c = new Circle();
        c.area(5);
    }
}