package com.dataforgeintegration.dao;

import com.dataforgemodels.TestModel;

public class TestIntegration {
    public TestModel getTest() {
        return TestModel.builder().testField("testField").build();
    }
}
