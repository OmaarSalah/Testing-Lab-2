import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class ADUPTest {
    Question3 ADUP;
    @BeforeEach
    public void init(){
        ADUP=new Question3();
    }
    @AfterEach
    public void cleanUp(){
        ADUP=null;
    }
    @Test
    public void test0()
    {
        ADUP.Transition('c');
        assertEquals("UPDATE,min",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("0:0",ADUP.getTime());
    }
    @Test
    public void test1()
    {
        ADUP.Transition('c');
        ADUP.Transition('b');
        assertEquals("UPDATE,min",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("0:1",ADUP.getTime());
    }
    @Test
    public void test2()
    {
        ADUP.Transition('c');
        ADUP.Transition('b');
        ADUP.Transition('b');
        assertEquals("UPDATE,min",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("0:2",ADUP.getTime());
    }
    @Test
    public void test3()
    {
        ADUP.Transition('c');
        ADUP.Transition('a');
        assertEquals("UPDATE,hour",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("0:0",ADUP.getTime());
    }
    @Test
    public void test4()
    {
        ADUP.Transition('c');
        ADUP.Transition('a');
        ADUP.Transition('b');
        assertEquals("UPDATE,hour",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("1:0",ADUP.getTime());
    }
    @Test
    public void test5()
    {
        ADUP.Transition('c');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        assertEquals("UPDATE,hour",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("1:1",ADUP.getTime());
    }
    @Test
    public void test6()
    {
        ADUP.Transition('c');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('b');
        assertEquals("UPDATE,hour",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("2:1",ADUP.getTime());
    }
    @Test
    public void test7()
    {
        ADUP.Transition('c');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('a');
        ADUP.Transition('b');
        assertEquals("UPDATE,day",ADUP.getState());
        assertEquals("2000-1-2",ADUP.getDate());
        assertEquals("0:1",ADUP.getTime());
    }
    @Test
    public void test8()
    {
        ADUP.Transition('c');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('b');
        assertEquals("UPDATE,day",ADUP.getState());
        assertEquals("2000-1-3",ADUP.getDate());
        assertEquals("0:1",ADUP.getTime());
    }
    @Test
    public void test9()
    {
        ADUP.Transition('c');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('b');
        assertEquals("UPDATE,month",ADUP.getState());
        assertEquals("2000-3-1",ADUP.getDate());
        assertEquals("1:1",ADUP.getTime());
    }
    @Test
    public void test10()
    {
        ADUP.Transition('c');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('b');
        assertEquals("UPDATE,year",ADUP.getState());
        assertEquals("2002-2-2",ADUP.getDate());
        assertEquals("1:1",ADUP.getTime());
    }
    @Test
    public void test11()
    {
        ADUP.Transition('c');
        ADUP.Transition('b');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('b');
        assertEquals("UPDATE,year",ADUP.getState());
        assertEquals("2002-2-2",ADUP.getDate());
        assertEquals("1:2",ADUP.getTime());
    }
    @Test
    public void test12()
    {
        ADUP.Transition('c');
        ADUP.Transition('b');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('b');
        assertEquals("UPDATE,year",ADUP.getState());
        assertEquals("2002-2-3",ADUP.getDate());
        assertEquals("1:2",ADUP.getTime());
    }
    @Test
    public void test13()
    {
        ADUP.Transition('c');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('a');
        ADUP.Transition('b');
        ADUP.Transition('b');
        ADUP.Transition('b');
        ADUP.Transition('b');
        ADUP.Transition('b');
        ADUP.Transition('b');
        ADUP.Transition('b');
        ADUP.Transition('b');
        ADUP.Transition('a');
        ADUP.Transition('b');
        assertEquals("UPDATE,year",ADUP.getState());
        assertEquals("2001-9-1",ADUP.getDate());
        assertEquals("1:1",ADUP.getTime());
    }


}