/*
 * Copyright (c) 2022 Anh Tester
 * Automation Framework Selenium
 */

package com.thinktimetechno.helpers;

import com.thinktimetechno.utils.LanguageUtils;
import com.thinktimetechno.utils.LogUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Properties;

public class PropertiesHelpers {

    private static Properties properties;
    private static String linkFile;
    private static FileInputStream file;
    private static FileOutputStream out;
    private static String relPropertiesFilePathDefault = "src/test/resources/config/config.properties";

    public static Properties loadAllFiles() {
        LinkedList<String> files = new LinkedList<>();
        // Add tất cả file Properties vào đây theo mẫu
        files.add("src/test/resources/config/config.properties");
        files.add("src/test/resources/config/data.properties");
        files.add("src/test/resources/config/Zeitblast.properties");
        files.add("src/test/resources/config/Zeitblastlocators.properties");

        try {
            properties = new Properties();

            for (String f : files) {
                Properties tempProp = new Properties();
                linkFile = Helpers.getCurrentDir() + f;
                file = new FileInputStream(linkFile);
                tempProp.load(file);
                properties.putAll(tempProp);
            }
            file.close();
            LogUtils.info("Loaded all properties files.");
            LogUtils.info(properties);
            return properties;
        } catch (IOException e) {
            LogUtils.info("Warning !! Can not Load All File.");
            return new Properties();
        }
    }

    public static Properties getProperties() {
        return properties;
    }

    public static void setFile(String relPropertiesFilePath) {
        properties = new Properties();
        try {
            linkFile = Helpers.getCurrentDir() + relPropertiesFilePath;
            file = new FileInputStream(linkFile);
            properties.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setDefaultFile() {
        properties = new Properties();
        try {
            linkFile = Helpers.getCurrentDir() + relPropertiesFilePathDefault;
            file = new FileInputStream(linkFile);
            properties.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key) {
        String keyValue = null;
        try {
            if (file == null && properties == null) {
                properties = new Properties();
                linkFile = Helpers.getCurrentDir() + relPropertiesFilePathDefault;
                file = new FileInputStream(linkFile);
                properties.load(file);
                file.close();
            }
            // Lấy giá trị từ file đã Set
            keyValue = properties.getProperty(key);
            return LanguageUtils.convertCharset_ISO_8859_1_To_UTF8(keyValue);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return keyValue;
        }
    }

    public static void setValue(String key, String keyValue) {
        try {
            if (file == null) {
                properties = new Properties();
                file = new FileInputStream(Helpers.getCurrentDir() + relPropertiesFilePathDefault);
                properties.load(file);
                file.close();
                out = new FileOutputStream(Helpers.getCurrentDir() + relPropertiesFilePathDefault);
            }
            //Ghi vào cùng file Prop với file lấy ra
            out = new FileOutputStream(linkFile);
            System.out.println(linkFile);
            properties.setProperty(key, keyValue);
            properties.store(out, "Set value to properties file success.");
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
