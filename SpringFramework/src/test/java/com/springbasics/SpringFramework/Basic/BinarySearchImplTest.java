package com.springbasics.SpringFramework.Basic;

import com.springbasics.SpringFramework.SpringFrameworkBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes= SpringFrameworkBasicApplication.class)
public class BinarySearchImplTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        int result = binarySearch.binarySearch(new int[]{2,3,4}, 5);
        assertEquals(3, result);
    }

    @Test
    public void postConstruct() {
    }

    @Test
    public void preDestroy() {
    }
}
