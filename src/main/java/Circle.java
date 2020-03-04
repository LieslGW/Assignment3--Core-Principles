public class Circle {

    Shapes cir = new Shapes();  //composition
    private int rad;
    private double area;

    public Circle(int radius){
        rad = radius;

    }

    public void setRad(int rad) {
        this.rad = rad;
    }


    public double getArea() {
        area = cir.CalcArea(rad);
        return area;
    }

    /*double CalcArea(int x){
        return cir.getPi()*x*x;
    }*/




}
