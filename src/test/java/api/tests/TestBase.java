package api.tests;
import org.testng.annotations.Listeners;

@Listeners({io.qameta.allure.testng.AllureTestNg.class})
public class TestBase {

    public void stepAllure(){
        System.out.println(">>> Allure results directory set <<<");
    }
}
