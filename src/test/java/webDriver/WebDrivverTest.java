/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webDriver;

import mbaf.galileoprojselenium.WebDriver.Driver;
import mbaf.galileoprojselenium.WebDriver.WebDriverEnum;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class WebDrivverTest {

    public WebDrivverTest() {
    }

//    @Test
    public void startGC() {
        Driver.getWebDriver(WebDriverEnum.CHROM);
    }

}
