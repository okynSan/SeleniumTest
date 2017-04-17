/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.galileoprojselenium.ui;

import mbaf.galileoprojselenium.ui.galileo.Galileo;
import mbaf.galileoprojselenium.ui.globe.impl.GlobeImpl;
import mbaf.galileoprojselenium.utils.Property;
import mbaf.galileoprojselenium.utils.PropertyEnum;
import mbaf.galileoprojselenium.utils.Values;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class PageFactory {

    public static void getPage(PageEnum pageEnum) {

        switch (pageEnum) {
            case Galileo:
                new Galileo().getPage(new Values().getPropertyByKey(PropertyEnum.BASE_URL));
                break;
//            case Login:
//                new Lo
//                break;

            case Globe:
                new GlobeImpl();
                break;

        }
        
    }

}
