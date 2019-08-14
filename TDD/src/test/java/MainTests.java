import Deposit.Deposit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



public class MainTests {
//    Calculator cal;
//
//    @Before
//    public void before_test() {
//        System.out.println("Before");
//        cal = new Calculator();
//        assertNotNull(cal);
//    }
//
//    @Test
//    public void exist_class() {
//        System.out.println("exist_class");
//        assertNotNull(cal);
//    }
//
//    @After
//    public void after() {
//        System.out.println("After");
//        cal = null;
//    }

    Deposit a, b;

    @Before
    public void exist_class() {
        System.out.println("Exist");
        a = new Deposit(100);
        b = new Deposit(200);
    }

    @Test
    public void test() {
        assertNotNull(a);
        assertNotNull(b);
    }

    @Test
    public void balance() {
        System.out.println("equal");
        assertEquals(100, a.get_balance());
        assertEquals(200, b.get_balance());
    }

    @Test
    public void deposit() {
        System.out.println("equal");
        a.deposit(100);
        assertEquals(200, a.get_balance());
        b.withdraw(50);
        assertEquals(150, b.get_balance());
        b.withdraw(300);
        assertEquals(150,b.get_balance());
        a.send(b,100); //a가 b에게 송금
        assertEquals(100,a.get_balance());
        assertEquals(250,b.get_balance());
    }



}
