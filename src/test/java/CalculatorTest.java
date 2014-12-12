import objects.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class CalculatorTest {
    Calculator calc;

    @BeforeMethod
    public void setup(){
        calc = new Calculator();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("in afterMethod");
    }

    @Parameters({"value1", "value2","result"})
    @Test(description = "Test for sum")
    public void sumTest(int value1, int value2, int result){
        Assert.assertEquals(result, calc.sum(value1, value2));
    }
    @Test(dataProviderClass = DataProviders.class, dataProvider = "calcData")
    public void dataTest(int value1, int value2, int result){
        
            Assert.assertEquals(result, calc.sum(value1, value2));

    }

}
