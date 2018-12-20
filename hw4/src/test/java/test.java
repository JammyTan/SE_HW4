import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void testGradeEquivalence(){
        assertEquals('X' ,main.letterGrade(110));
        assertEquals('A' ,main.letterGrade(95));
        assertEquals('B' ,main.letterGrade(85));
        assertEquals('C' ,main.letterGrade(75));
        assertEquals('D' ,main.letterGrade(65));
        assertEquals('F' ,main.letterGrade(50));
        assertEquals('X' ,main.letterGrade(-10));
    }

    @Test
    public void testGradeBoundary100(){
        assertEquals('X' ,main.letterGrade(101));
        assertEquals('A' ,main.letterGrade(100));
        assertEquals('A' ,main.letterGrade(99));
    }

    @Test
    public void testGradeBoundary90(){
        assertEquals('A' ,main.letterGrade(91));
        assertEquals('A' ,main.letterGrade(90));
        assertEquals('B' ,main.letterGrade(89));
    }

    @Test
    public void testGradeBoundary80(){
        assertEquals('B' ,main.letterGrade(81));
        assertEquals('B' ,main.letterGrade(80));
        assertEquals('C' ,main.letterGrade(79));
    }

    @Test
    public void testGradeBoundary70(){
        assertEquals('C' ,main.letterGrade(71));
        assertEquals('C' ,main.letterGrade(70));
        assertEquals('D' ,main.letterGrade(69));
    }

    @Test
    public void testGradeBoundary60(){
        assertEquals('D' ,main.letterGrade(61));
        assertEquals('D' ,main.letterGrade(60));
        assertEquals('F' ,main.letterGrade(59));
    }

    @Test
    public void testGradeBoundary0(){
        assertEquals('F' ,main.letterGrade(1));
        assertEquals('F' ,main.letterGrade(0));
        assertEquals('X' ,main.letterGrade(-1));
    }
}
