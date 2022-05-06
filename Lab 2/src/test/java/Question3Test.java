import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Question3Test {
    Question3 question3;
    @BeforeEach
    public void init(){
        question3=new Question3();
    }
    @AfterEach
    public void cleanUp(){
        question3=null;
    }


    @Test
    public void test0()
    {
                question3.Transition('a');
                assertEquals("NORMAL,DATE",question3.getState());
                assertEquals("2000-1-1",question3.getDate());
                assertEquals("0:0",question3.getTime());

    }
    @Test
    public void test1()
    {
        question3.Transition('a');
        question3.Transition('a');
        assertEquals("NORMAL,TIME",question3.getState());
        assertEquals("2000-1-1",question3.getDate());
        assertEquals("0:0",question3.getTime());

    }
    @Test
    public void test2()
    {
        question3.Transition('b');
        assertEquals("ALARM,Alarm",question3.getState());
        assertEquals("2000-1-1",question3.getDate());
        assertEquals("0:0",question3.getTime());

    }
    @Test
    public void test3()
    {
        question3.Transition('b');
        question3.Transition('a');
        assertEquals("ALARM,Chime",question3.getState());
        assertEquals("2000-1-1",question3.getDate());
        assertEquals("0:0",question3.getTime());

    }
    @Test
    public void test4()
    {
        question3.Transition('c');
        assertEquals("UPDATE,min",question3.getState());
        assertEquals("2000-1-1",question3.getDate());
        assertEquals("0:0",question3.getTime());

    }
    @Test
    public void test5()
    {
        question3.Transition('c');
        question3.Transition('a');
        assertEquals("UPDATE,hour",question3.getState());
        assertEquals("2000-1-1",question3.getDate());
        assertEquals("0:0",question3.getTime());

    }
    @Test
    public void test6()
    {
        question3.Transition('c');
        question3.Transition('b');
        assertEquals("UPDATE,min",question3.getState());
        assertEquals("2000-1-1",question3.getDate());
        assertEquals("0:1",question3.getTime());

    }
    @Test
    public void test7()
    {
        question3.Transition('c');
        question3.Transition('a');
        question3.Transition('b');
        assertEquals("UPDATE,hour",question3.getState());
        assertEquals("2000-1-1",question3.getDate());
        assertEquals("1:0",question3.getTime());

    }
    @Test
    public void test8()
    {
        question3.Transition('c');
        question3.Transition('a');
        question3.Transition('a');
        question3.Transition('b');
        assertEquals("UPDATE,day",question3.getState());
        assertEquals("2000-1-2",question3.getDate());
        assertEquals("0:0",question3.getTime());

    }
    @Test
    public void test9()
    {
        question3.Transition('c');
        question3.Transition('a');
        question3.Transition('a');
        question3.Transition('a');
        question3.Transition('b');
        assertEquals("UPDATE,month",question3.getState());
        assertEquals("2000-2-1",question3.getDate());
        assertEquals("0:0",question3.getTime());

    }
    @Test
    public void test10()
    {
        question3.Transition('c');
        question3.Transition('a');
        question3.Transition('a');
        question3.Transition('a');
        question3.Transition('a');
        question3.Transition('b');
        assertEquals("UPDATE,year",question3.getState());
        assertEquals("2001-1-1",question3.getDate());
        assertEquals("0:0",question3.getTime());

    }
    @Test
    public void test11()
    {
        question3.Transition('d');
        assertEquals("NORMAL,TIME",question3.getState());
        assertEquals("2000-1-1",question3.getDate());
        assertEquals("0:0",question3.getTime());

    }


}