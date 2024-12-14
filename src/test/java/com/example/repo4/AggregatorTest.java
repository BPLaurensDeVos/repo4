package com.example.repo4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AggregatorTest {
    @Test
    public void testAggregate() {
        Aggregator aggregator = new Aggregator();
        assertTrue(aggregator.aggregate().contains("Aggregated with Hello from Repo1!"));
    }
}
