public class Calculator {
    private double doubleOne;
    private double doubleTwo;

    public Calculator(double doubleOne, double doubleTwo){
        this.doubleOne = doubleOne;
        this.doubleTwo = doubleTwo;
    }

    public double add(){
        return this.doubleOne + this.doubleTwo;
    }

    public double subtract(){
        return this.doubleOne - this.doubleTwo;
    }

    public double multiply(){
        return this.doubleOne * this.doubleTwo;
    }

    public double divide(){
        return this.doubleOne / this.doubleTwo;
    }

}
