/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pageLoader;

import mbaf.galileoprojselenium.WebDriver.Driver;
import mbaf.galileoprojselenium.WebDriver.WebDriverEnum;
import mbaf.galileoprojselenium.ui.PageEnum;
import mbaf.galileoprojselenium.ui.PageFactory;
import org.junit.Test;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class PageLoaderTest {

    public PageLoaderTest() {
    }

//    @Test
    public void startGalileo() {
        Driver.getWebDriver(WebDriverEnum.CHROM);
    }

    @Test
    public void startG(){
       new PageFactory().getPage(PageEnum.Galileo);
    }
    
}
