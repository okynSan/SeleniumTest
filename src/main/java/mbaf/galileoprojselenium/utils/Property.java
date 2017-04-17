/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.galileoprojselenium.utils;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class Property {

    static Property prop = null;

    private static Map<String, String> propertyMap = new HashMap<>();

    private static final String USER_NAME = "username";
    private static final String PASSWORD = "cthutq";
    private static final String BASE_URL = "appBaseUrl";

    private Property() {

    }

    static {
        propertyMap.put(PropertyEnum.USER_NAME.toString(), Property.USER_NAME);
        propertyMap.put(PropertyEnum.PASSWORD.toString(), Property.PASSWORD);
        propertyMap.put(PropertyEnum.BASE_URL.toString(), Property.BASE_URL);

    }

    public static String getPropertyByKey(PropertyEnum key) {

        return propertyMap.get(key.toString());

    }

    private static Map<String, String> getPropertyMap() {
        return propertyMap;
    }

}
