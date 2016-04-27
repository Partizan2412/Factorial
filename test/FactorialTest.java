import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class FactorialTest {

    @Test
    public void FactorialTest2(){
        Assert.assertEquals( 2,Factorial.factorialA(2));
    }
    @Test
    public void FactorialTest0(){
        Assert.assertEquals(1, Factorial.factorialA(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void FactorialTestm1(){
        Assert.assertEquals(1, Factorial.factorialA(-1));
    }
    @Test
    public void FactorialTest5(){
        Assert.assertEquals( 120,Factorial.factorialA(5));
    }
}