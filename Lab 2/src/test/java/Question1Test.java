import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Question1Test {
    Question1 question1;
    @BeforeEach
    public void init(){
        question1=new Question1();
    }
    @AfterEach
    public void cleanUp(){
        question1=null;
    }



            @Test
            public void test0() {
                assertEquals( " no is Even ",question1.EvenOdd(100));
            }
            @Test
            public void test1() {
                assertEquals(" no is Even ", question1.EvenOdd(-2));
            }

            @Test
            public void test3() {
                assertEquals(" no is Even ", question1.EvenOdd(22));
            }

            @Test
            public void test4() {
                assertEquals(" no is Even ", question1.EvenOdd(-28));
            }

            @Test
            public void test5() {
                assertEquals(" no is Even ", question1.EvenOdd(1002));
            }
            @Test
            public void test6() {
                assertEquals(" no is Odd ", question1.EvenOdd(5));
            }
            @Test
            public void test7() {
                assertEquals(" no is Odd ", question1.EvenOdd(77));
            }
            @Test
            public void test8() {
                assertEquals(" no is Odd ", question1.EvenOdd(-33));
            }
            @Test
            public void test9() {
                assertEquals(" no is Odd ", question1.EvenOdd(-55));
            }
           @Test
           public void test10() {
               assertEquals(" no is Odd ", question1.EvenOdd(99));
           }

    }












