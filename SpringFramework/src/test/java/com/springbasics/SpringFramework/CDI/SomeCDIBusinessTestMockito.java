package com.springbasics.SpringFramework.CDI;

import com.springbasics.SpringFramework.SpringFrameworkCDIApplication;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDIBusinessTestMockito extends TestCase {

    @Mock
    SomeCDIDAO daoMock;

    @InjectMocks
    SomeCDIBusiness someCDIBusiness;

    @Test
    public void testBasicScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {5,2,100})
                .thenReturn(new int[]{2,5}).thenReturn(new int[0]);
        assertEquals(someCDIBusiness.findGreatest(), 100);
        assertEquals(someCDIBusiness.findGreatest(), 5);
        assertEquals(someCDIBusiness.findGreatest(), Integer.MIN_VALUE);
    }

}