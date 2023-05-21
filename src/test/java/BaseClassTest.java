import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClassTest {
    @AfterMethod
    public void afterMethod(){
        System.out.println("inside after method ");}
    @BeforeClass
    public void afterClass(){

    }
}

