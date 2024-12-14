package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utils.driverManager.BrowserManager;


@CucumberOptions(
        publish = true,
        features = "src/test/resources/features",
        glue = {"steps","hooks"},
        tags = "@cotizacionVida",
        plugin ={ "pretty","json:target/cucumber-reports/CucumberTestReport.json", })
public class RunnerByTag extends AbstractTestNGCucumberTests {
    public static WebDriver driver;
    @BeforeTest
    @Parameters({"SettingsFileName"})
    public void setupScenario(String settingsFileName) throws Exception {
        driver = BrowserManager.getDriverInstance(settingsFileName);
    }
    @AfterTest
    public void cerrarNavegador() throws InterruptedException {
        driver.close();
        Thread.sleep(5000);
 //       driver.quit();
    }
}
//PARA NO LEVANTAR EL NAVEGADOR SACAR EN edgeDriverLocal() el "--headless"