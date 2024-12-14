package com.example.repo4;

import com.example.repo1.Utility;
import com.example.repo3.Service3;

public class Aggregator {
    public String aggregate() {
        Service3 service = new Service3();
        return service.process() + " Aggregated with " + Utility.getMessage();
    }
}
