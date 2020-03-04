public class Rectangle extends Shapes{ // example of inheritance.

    private int length, breadth;
    private  int area;

    public Rectangle(int x, int y){
        setLength(x);
        setBreadth(y);
    }

    public void setLength(int l) {
        this.length = l;
    }

    public int getLength() {
        return length;
    }

    public void setBreadth(int b) {
        this.breadth = b;
    }

    public int getBreadth() {
        return breadth;
    }


    @Override
    int CalcArea(int x, int y){  // Polymorphism
        area = x*y;

        return area;

    }


    public double getArea() {
        CalcArea(getLength(),getBreadth());
        return area;
    }

    public double myMethod (double s, double y){
        return super.CalcArea(s, y); // calling a method in the super class even though it has been overridden in this class
    }

    public static void main(String[] args) {
        Rectangle r =new Rectangle(3,2);

        System.out.println(r.CalcArea(5, 2)); // overridden
        System.out.println(r.CalcArea(2));// inherited
        System.out.println(r.myMethod(1.5, 2.5)); // refers to the myMethod above
        Shapes s= new Shapes();
        System.out.println(s.CalcArea(23.0, 25.0)); // calling the method in the super class
    }


}
