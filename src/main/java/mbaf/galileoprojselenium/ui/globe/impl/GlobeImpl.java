/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.galileoprojselenium.ui.globe.impl;

import mbaf.galileoprojselenium.WebDriver.Driver;
import mbaf.galileoprojselenium.ui.globe.Globe;
import org.openqa.selenium.By;


/**
 *
 * @author andrey_zatvornitskiy
 */
public class GlobeImpl implements Globe {
    
    String GLOBE_ICON_PATH = "";
    String AGREEMENT_TEXTFIELD_PATH = "";
    String CALCULATION_DATE_START_FIELD = "";
    String GOTO_BUTTON = "";
    

    @Override
    public void openGlobe() {
        Driver.getWebDriver().findElement(By.xpath(GLOBE_ICON_PATH)).click();
    }

    @Override
    public void setAgreement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pushButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRecalculationDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
