import org.junit.Assert;
import org.junit.Test;

public class MathTests {
    @Test
    public void test_max_1 (){
        Assert.assertEquals(7, Math.max(7, 4));
    }

    @Test
    public void test_max_2 (){
        Assert.assertEquals(7, Math.max(7, 8));
    }
}
