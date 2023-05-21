import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;

public class testClass {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("inside before method ");
    }

    @Test
    public void firstTest(){
        System.out.println("this is first test");
        AddClass addClass=new AddClass();
        addClass.getSum(2,3);
        int res=addClass.getSum(2,3);
        Assert.assertEquals(5,res);
    }
    @Test
    public void secondtest(){
        System.out.println("this is second test ");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("inside after method ");
    }
    @BeforeClass
    public void afterClass(){

    }
}
