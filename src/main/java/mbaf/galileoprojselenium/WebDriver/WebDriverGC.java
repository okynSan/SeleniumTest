/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.galileoprojselenium.WebDriver;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class WebDriverGC extends WebBrowser {

        
    @Override
    public ChromeDriver getWebDriver() {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver(dc);
    }

}
