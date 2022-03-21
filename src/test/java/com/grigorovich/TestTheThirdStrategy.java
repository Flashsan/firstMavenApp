package com.grigorovich;

import com.grigorovich.strategy.optionStrategy.TheThirdTypeStrategy;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;


public class TestTheThirdStrategy {

    private TheThirdTypeStrategy theThirdTypeStrategy = new TheThirdTypeStrategy();

    @Test
    public void testTheThirdStrategyTalent_0ne() throws Exception {
        double result = theThirdTypeStrategy.studyStrategy(1, 22.0);
        Assert.assertEquals(66.0, result);
    }

    @Test
    public void testTheThirdStrategyTalent_Zero_Point_One() throws Exception {
        double result = theThirdTypeStrategy.studyStrategy(0.1, 22.0);
        Assert.assertEquals(660.0, result);
    }

    @Test
    public void testTheThirdStrategyTalent_Zero_Point_Five() throws Exception {
        double result = theThirdTypeStrategy.studyStrategy(0.5, 22.0);
        Assert.assertEquals(132.0, result);
    }

    @Test
    public void testTheThirdStrategyTalent_Zero_Point_Eight() throws Exception {
        double result = theThirdTypeStrategy.studyStrategy(0.8, 22.0);
        Assert.assertEquals(82.5, result);
    }
}
