package com.westpac.randomPINgenerator;

import java.io.InputStream;

public class FileResourceUtils {

        public InputStream getFileFromResourceAsStream(String fileName) {

            // The class loader that loaded the class
            ClassLoader classLoader = getClass().getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream(fileName);

            // the stream holding the file content
            if (inputStream == null) {
                throw new IllegalArgumentException("file not found! " + fileName);
            } else {
                return inputStream;
            }

        }
}

