public class Shapes {


    private double pi=3.14; // encapsulation

    //constructor
    public Shapes(){

    }

    public double getPi() {
        return pi;
    }


    //this method uses integers as the parameter and adds the 2 numbers
    int CalcArea(int x, int y){
        int z = x+y;

        return z;
    }


    // method calculates the area of a circle
    double CalcArea(int x){

        return pi*x*x;
    }



    double CalcArea(double r, double e){
        double z = r+e;

        return z;
    }



}
