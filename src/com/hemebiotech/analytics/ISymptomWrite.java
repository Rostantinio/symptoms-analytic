/**
 * @g
        **/
package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWrite {
    void writeToFile(Map<String, Integer> symptomsWithOccurrences) throws IOException;
}