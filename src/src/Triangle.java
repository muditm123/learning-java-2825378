public class Triangle {
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;
    String triangleType;

    public Triangle (double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double calculateArea(){
        return (0.5)*this.base*this.height;
    }

    //Non-static method, it means to use it we have to create an instance of the Triangle class.
    //Math.pow() is a static method which means that we don't need to have a
    public void assignTriangleType() {

    }
}
