package com.grigorovich;

import com.grigorovich.strategy.optionStrategy.TheFirstTypeStrategy;
import com.grigorovich.strategy.optionStrategy.TheSecondTypeStrategy;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class TestTheSecondStrategy {

    private TheSecondTypeStrategy theSecondLearnStrategy = new TheSecondTypeStrategy();

    @Test
    public void testTheSecondStrategyTalent_0ne() throws Exception {
        double result = theSecondLearnStrategy.studyStrategy(1, 22.0);
        Assert.assertEquals(44.0, result);
    }

    @Test
    public void testTheSecondStrategyTalent_Zero_Point_One() throws Exception {
        double result = theSecondLearnStrategy.studyStrategy(0.1, 22.0);
        Assert.assertEquals(440.0, result);
    }

    @Test
    public void testTheSecondStrategyTalent_Zero_Point_Five() throws Exception {
        double result = theSecondLearnStrategy.studyStrategy(0.5, 22.0);
        Assert.assertEquals(88.0, result);
    }

    @Test
    public void testTheSecondStrategyTalent_Zero_Point_Eight() throws Exception {
        double result = theSecondLearnStrategy.studyStrategy(0.8, 22.0);
        Assert.assertEquals(55.0, result);
    }
}
