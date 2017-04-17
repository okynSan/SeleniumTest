/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.galileoprojselenium.ui.galileo;

import mbaf.galileoprojselenium.WebDriver.Driver;
import mbaf.galileoprojselenium.ui.Page;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class Galileo extends Page{

    
    public void getPage(String url) {
        Driver.getWebDriver().get(url);
    }
    
}
