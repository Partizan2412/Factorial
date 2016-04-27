import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class FactorialTest {

    @Test
    public void FactorialTest2(){
        Assert.assertEquals( 2,Factorial.FactA(2));
    }
    @Test
    public void FactorialTest0(){
        Assert.assertEquals(1, Factorial.FactA(0));
    }
    @Test
    public void FactorialTest5(){
        Assert.assertEquals( 120,Factorial.FactA(5));
    }
}