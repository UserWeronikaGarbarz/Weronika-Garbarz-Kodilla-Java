package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        Assert.assertEquals("", Logger.getInstance().getLastLog());
        Logger.getInstance().log("run");
        Assert.assertEquals("run", Logger.getInstance().getLastLog());
    }
}