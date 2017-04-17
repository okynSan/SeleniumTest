/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.galileoprojselenium.ui.login.impl;

import mbaf.galileoprojselenium.WebDriver.Driver;
import mbaf.galileoprojselenium.ui.Page;
import mbaf.galileoprojselenium.ui.login.LoginInsertion;
import org.openqa.selenium.By;

public class LoginInsertionImpl extends Page implements LoginInsertion {

    @Override
    public void enterBtnClick() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUserNameTextField() {
        Driver.getWebDriver().findElement(By.xpath("//*[@id=\"ext-comp-1003\"]")).sendKeys("Yese");
    }

    @Override
    public void setPasswordTextField() {
         Driver.getWebDriver().findElement(By.xpath("asd"));
    }

}
