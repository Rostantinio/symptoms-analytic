package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsCounter implements ISymptomsCount {
    @Override
    public Map<String, Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> symptomsMap = new TreeMap<>();
        for (String symptom : symptoms) {
            if(symptomsMap.containsKey(symptom)) {
                int occurrences = symptomsMap.get(symptom);
                occurrences++;
                symptomsMap.put(symptom, occurrences);
            } else {
                symptomsMap.put(symptom, 1);
            }
        }
        return symptomsMap;
    }
}