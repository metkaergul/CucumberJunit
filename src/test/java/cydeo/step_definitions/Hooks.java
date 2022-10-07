package cydeo.step_definitions;


import cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In the class we will be able to pass pre&post conditions to each scenario and step
*/
public class Hooks {

    //import from io.cucumber.java not from junit
//    @Before
//    public void setupScenario(){
//        System.out.println("setting up browser using cucumber @Before");
//
//    }
//
//    @Before(value = "@login",order = 1)
//    public void setupScenarioForLogins(){
//
//        System.out.println("===>This will only apply  to scenarios with @login tag");
//
//    }
//    @Before(value = "@db",order = -1)
//    public void setupForDataBaseScenarios(){
//
//        System.out.println("===>This will only apply  to scenarios with @db tag");
//
//    }



    @After
    public void tearDownScenario(Scenario scenario){

        //scenario.isFailed===>if scenario fails this method will return "TRUE" boolean value
        if(scenario.isFailed()){

            byte[] screenshot=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }


        Driver.closeDriver();
//        System.out.println("Closing browser using cucumber @After");
//        System.out.println("scenario ended take screenshot if failed!");

    }




//    @BeforeStep
//    public void setUpStep(){
//
//        System.out.println("------>applying setup using @BeforeStep");
//
//    }
//    @AfterStep
//    public void afterStep(){
//
//        System.out.println("--------->applying teardown using @AfterStep");
//
//    }
}
