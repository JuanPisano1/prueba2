package utils.driverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.EnvironmentConsumer;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EdgeDriverCreator {
	private String version = null;

	// Description: Creo la conexion chrome driver

	public WebDriver edgeDriverLocal() throws Exception {
		EdgeOptions options = new EdgeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.addArguments("--aggressive-cache-discard", "--allow-insecure-localhost",
			   //EJECUTAR SIN LEVANTAR EL NAVEGADOR
			//	"--headless",
				"--allow-running-insecure-content", "--disable-application-cache",
				"--disable-browser-side-navigation", "--disable-cache", "--disable-client-side-phishing-detection",
				"--disable-default-apps", "--disable-extensions", "--disable-infobars", "--disable-notifications",
				"--disable-offline-load-stale-cache", "--disable-popup-blocking", "--disable-web-security",
				"--ignore-certificate-errors", "--no-sandbox", "--start-maximized", "--test-type=browser");
		try{
			Dotenv settings = EnvironmentConsumer.getInstance("settings");
			String lang  = Objects.requireNonNull(settings.get("Language"));
			options.addArguments("--lang=" + lang);
		}catch(NullPointerException e) {}
		// Description: solve timeout exception issue
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		// Description: Disabled save pass prefs
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		return WebDriverManager.edgedriver().capabilities(options).create();
	}

	public WebDriver edgeDriverGrid(String urlSelenium, String os, String version) throws Exception {
		try {
			this.version = version;
			EdgeOptions options = new EdgeOptions();
			//options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			//options.addArguments("--aggressive-cache-discard", "--allow-insecure-localhost",
			//		"--allow-running-insecure-content", "--disable-application-cache",
			//		"--disable-browser-side-navigation", "--disable-cache", "--disable-client-side-phishing-detection",
			//		"--disable-default-apps", "--disable-extensions", "disable-infobars", "--disable-notifications",
			//		"--disable-offline-load-stale-cache", "--disable-popup-blocking", "--disable-web-security",
			//		"--ignore-certificate-errors", "--no-sandbox", "start-maximized", "test-type=browser");
			// Description: solve timeout exception issue
			//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			// Description: Disabled save pass prefs
			//Map<String, Object> prefs = new HashMap<String, Object>();
			//prefs.put("credentials_enable_service", false);
			//prefs.put("profile.password_manager_enabled", false);
			//options.setExperimentalOption("prefs", prefs);

			//options.setCapability("version", this.version);
			//options.setCapability("version", version);
			//options.setCapability("browserName", "MicrosoftEdge");
			//options.setCapability("platform", os.toUpperCase());
			return new RemoteWebDriver(new URL(urlSelenium), options);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
