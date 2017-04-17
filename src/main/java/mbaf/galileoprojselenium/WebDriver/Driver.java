/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.galileoprojselenium.WebDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class Driver {

    private static WebDriver webDriver;

    private Driver() {
    }

    public static WebDriver getWebDriver(WebDriverEnum driverEnum) {
        if (webDriver == null) {
            Driver.webDriver = new WebDriverFactory().getDriver(driverEnum);
            Driver.webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            return webDriver;
        } else {
            return webDriver;
        }
    }
    
    public static WebDriver getWebDriver() {
        if (webDriver != null){
            return webDriver;
        }
        return null;
    }

}
