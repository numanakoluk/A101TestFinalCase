package steps;
import base.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Driver {
    @Before
    public void setUp(){
    initializeDriver();
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            testFailed();
        }
        closeDriver();
    }
}
