import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class Question2Test {
    Question2 question2;
    @BeforeEach
    public void init(){
        question2=new Question2();
    }
    @AfterEach
    public void cleanUp(){
        question2=null;
    }


    @Test
    public void test0()
    {
        assertEquals(1,question2.findMin(new int[]{1, 2, 3, 4},4));
    }
    @Test
    public void test1()
    {
        assertEquals(1,question2.findMin(new int[]{1, 2, 3, 4},4));
    }
    @Test
    public void test2()
    {
        assertEquals(10,question2.findMin(new int[]{10, 20, 30, 40},4));
    }
    @Test
    public void test3()
    {
        assertEquals(-33,question2.findMin(new int[]{-10, 5, -33, -1},4));
    }
    @Test
    public void test4()
    {
        assertEquals(0,question2.findMin(new int[]{0, 99, 55, 3},4));
    }
    @Test
    public void test5()
    {
        assertEquals(2,question2.findMin(new int[]{7, 909, 101, 2},4));
    }
    @Test
    public void test6()
    {
        assertEquals(999,question2.findMax(new int[]{67, 990, 102, 999},4));
    }
    @Test
    public void test7()
    {
        assertEquals(77,question2.findMax(new int[]{-50, 77, 4, 23},4));
    }
    @Test
    public void test8()
    {
        assertEquals(-4,question2.findMax(new int[]{-30, -77, -23, -4},4));
    }
    @Test
    public void test9()
    {
        assertEquals(88,question2.findMax(new int[]{-88, 80, 88, -7},4));
    }
    @Test
    public void test10()
    {
        assertEquals(400,question2.findMax(new int[]{100, 200, 300, 400},4));
    }

}