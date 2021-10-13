package com.westpac.randomPINgenerator;

import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Properties;

public class RandomPINGenerator {

    FileResourceUtils fileResourceUtils = new FileResourceUtils();
    String fileName = "random-pin-config.properties";
    InputStream is = fileResourceUtils.getFileFromResourceAsStream(fileName);

    public HashSet<String> generateRandomPINs() throws NoSuchAlgorithmException {
        // Use SecureRandom to generate a strong random number
        HashSet<String> randomPINCollection = new HashSet<>();

        SecureRandom randomGenerator = SecureRandom.getInstance(loadPropertyByName("random-pin.algorithm"));
        while (randomPINCollection.size() < 1000) {
            //Use String format to create a 4 digit PIN
            String str = String.format("%04d", randomGenerator.nextInt(9999));
            randomPINCollection.add(str);
        }

        return randomPINCollection;
    }

    public String loadPropertyByName(String propertyName)
    {
        Properties prop = new Properties();
        String propertyValue = null;
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(fileName)) {

            if (input == null) {
                System.out.println("Sorry, unable to find " + fileName);
                return null;
            }

            prop.load(input);
            propertyValue = prop.getProperty(propertyName);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return propertyValue;
    }
}
