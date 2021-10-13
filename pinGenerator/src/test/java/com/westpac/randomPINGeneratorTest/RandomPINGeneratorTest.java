package com.westpac.randomPINGeneratorTest;

import com.westpac.randomPINgenerator.RandomPINGenerator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.HashSet;

public class RandomPINGeneratorTest {
    @Test
    public void RandomPINHasExpectedLength() throws Exception {
        RandomPINGenerator randomPINGenerator = new RandomPINGenerator();
        HashSet<String> hashSet = randomPINGenerator.generateRandomPINs();
        for (String str: hashSet) {
            assertEquals(4, str.length());
        }
    }

    @Test
    public void RandomPINSetSizeCheck() throws Exception {
        //Check if 1000 Random PINs are generated during multiple runs
        for (int i = 0; i < 9; i++) {
            RandomPINGenerator randomPINGenerator = new RandomPINGenerator();
            HashSet<String> hashSet = randomPINGenerator.generateRandomPINs();
            assertEquals(1000,hashSet.size());
        }

    }

}
