/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pageLoader;

import mbaf.galileoprojselenium.WebDriver.Driver;
import mbaf.galileoprojselenium.WebDriver.WebDriverEnum;
import mbaf.galileoprojselenium.ui.galileo.Galileo;
import mbaf.galileoprojselenium.ui.login.impl.LoginInsertionImpl;
import mbaf.galileoprojselenium.utils.PropertyEnum;
import mbaf.galileoprojselenium.utils.Values;
import org.junit.Test;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class LoginInsertionTest {
    
    
//    @Test
    public void insertLogin(){
        Driver.getWebDriver(WebDriverEnum.CHROM);
        new Galileo().getPage(new Values().getPropertyByKey(PropertyEnum.BASE_URL));
        new LoginInsertionImpl().setUserNameTextField();
    
    }
    
}
