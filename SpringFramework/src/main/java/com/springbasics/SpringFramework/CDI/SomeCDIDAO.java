package com.springbasics.SpringFramework.CDI;

import javax.inject.Named;

@Named
public class SomeCDIDAO {

    public int[] getData() {
        return new int[] {5, 89, 100};
    }
}
