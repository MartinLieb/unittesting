import static org.junit.Assert.*;

public class SquareTest {

    @org.junit.Test
    public void getAreaTest() {
        Square firkant = new Square(1,1);
        int result = firkant.getArea();
        assertEquals(1,result);
        firkant.a = 5;
        firkant.b = 10;
        assertEquals(50,firkant.getArea());
        firkant.a = 10000;
        firkant.b = 0;
        assertEquals(0,firkant.getArea());
        firkant.a = 6;
        firkant.b = -4;
        assertEquals(-24,firkant.getArea());

    }

    @org.junit.Test
    public void gerPerimeterTest() {
        Square firkant = new Square(1,1);
        int result = firkant.gerPerimeter();
        assertEquals(4,result);
        firkant.a = 5;
        firkant.b = 10;
        assertEquals(30,firkant.gerPerimeter());
        firkant.a = 10000;
        firkant.b = 0;
        assertEquals(20000,firkant.gerPerimeter());
        firkant.a = 6;
        firkant.b = -4;
        assertEquals(4,firkant.gerPerimeter());
    }
}