import org.junit.Assert;
import org.junit.Test;

public class TestMavenTestMain {
    @Test
    public void TestOutput(){
        Assert.assertEquals("123",MavenTestMain.outputTest("123"));
    }

}
