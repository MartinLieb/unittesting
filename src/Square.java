public class Square {

    int a = 0;
    int b = 0;

    public int getArea(){
        return a*b;
    }


    public int gerPerimeter(){
        return a+a+b+b;

    }

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Square() {
    }


}
