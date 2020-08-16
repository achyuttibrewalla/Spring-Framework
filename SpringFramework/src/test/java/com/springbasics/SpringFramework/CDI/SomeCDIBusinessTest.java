package com.springbasics.SpringFramework.CDI;

import com.springbasics.SpringFramework.SpringFrameworkCDIApplication;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringFrameworkCDIApplication.class)
public class SomeCDIBusinessTest extends TestCase {

    @Autowired
    SomeCDIBusiness someCDIBusiness;

    @Test
    public void testBasicScenario() {
        assertEquals(someCDIBusiness.findGreatest(), 100);
    }

}