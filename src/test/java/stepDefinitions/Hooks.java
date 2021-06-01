package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Config;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        Driver.get().get(Config.getProperty("SofiURL"));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.get().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        Driver.qute();
    }
}
