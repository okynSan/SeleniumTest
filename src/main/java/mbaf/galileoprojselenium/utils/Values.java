/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.galileoprojselenium.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class Values {

    private static Properties prop = new Properties();
    private static final String DEFAULT_CONFIG = "DefaultConfig.properties";
    static InputStream in = null;

    public Values() {
        init();
    }

    public void init() {
        try {
//            File tmp = new File(DEFAULT_CONFIG);
//            if (!tmp.exists()){
//               tmp.createNewFile();
//            }
            in = new FileInputStream(DEFAULT_CONFIG);
            prop.load(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPropertyByKey(PropertyEnum key) {

        return prop.getProperty(Property.getPropertyByKey(key));
    }

}
