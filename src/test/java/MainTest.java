import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Main.getPad;
import static org.example.Main.getSum;
public class MainTest { //для классов слово тест пишется после,
    //в названиях методов перед названием


    @Test

    public void testGetSum(){
        System.out.println(getSum(0, 0) == 0);
        System.out.println(getSum(5, 5) == 10);
        System.out.println(getSum(1000, 1000) == 2000);
        System.out.println(getSum(-5, -5) == -10);

        Assert.assertEquals(getSum(0, 0), 0);
        Assert.assertEquals(getSum(5, 5),10);
        Assert.assertEquals(getSum(1000, 1000), 2000);
        Assert.assertEquals(getSum(-5, -5), -10);
    }
      public void testGetPad(){
          System.out.println("".equals(getPad("a", 0)));
          System.out.println("".equals(getPad("", 3)));
          System.out.println("AAA".equals(getPad("A", 3)));
      }
}
