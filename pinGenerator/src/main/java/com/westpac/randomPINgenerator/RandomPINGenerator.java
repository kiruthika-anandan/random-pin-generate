package com.westpac.randomPINgenerator;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashSet;

public class RandomPINGenerator {

    public static HashSet<String> generateRandomPINs() throws NoSuchAlgorithmException {
        // Use SecureRandom to generate a strong random number
        HashSet<String> randomPINCollection = null;

        SecureRandom randomGenerator = SecureRandom.getInstance("SHA1PRNG");
        randomPINCollection = new HashSet<>();
        while (randomPINCollection.size() < 1000) {
            //Use String format to create a 4 digit PIN
            String str = String.format("%04d", randomGenerator.nextInt(9999));
            randomPINCollection.add(str);
        }

        return randomPINCollection;
    }
}
