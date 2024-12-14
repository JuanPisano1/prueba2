package steps;

import org.openqa.selenium.WebDriver;
import testRunner.RunnerByTag;
import testRunner.TestRunner;

public class Hooks {
//    public static WebDriver driver = null;
//    @AfterStep
//    @Attachment(value = "Page screenshot", type = "image/png")
//    public void as(Scenario scenario){
//        if (scenario.isFailed()) {
//           scenario.attach(saveScreenshotPNG(getRunnerDriver()), "image/png", scenario.getName());
//        }
//    }

/*    private CustomScreenRecorder screenRecorder;
    @Before
    public void startScreenRecord(Scenario scenario) throws IOException, AWTException {
        screenRecorder = new CustomScreenRecorder(new File(System.getProperty("user.dir") + "/target/screen-records"));
        screenRecorder.startRecording(scenario.getName(), true);
    }

    @After
    public void stopScreenRecord() throws IOException {
        screenRecorder.stopRecording(true);
    }
*/
    public static WebDriver getRunnerDriver(){
        WebDriver driver = null;
        if(TestRunner.driver != null){
            driver = TestRunner.driver;
        }else if(RunnerByTag.driver != null){
            driver = RunnerByTag.driver;
        }
        return driver;
    }

}
