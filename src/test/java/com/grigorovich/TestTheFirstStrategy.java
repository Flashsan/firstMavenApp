package com.grigorovich;

import com.grigorovich.strategy.optionStrategy.TheFirstTypeStrategy;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class TestTheFirstStrategy extends Assert {

    private TheFirstTypeStrategy theFirstLearnStrategy = new TheFirstTypeStrategy();

    @Test
    public void testTheFirstStrategyTalent_0ne() throws Exception {
        double result = theFirstLearnStrategy.studyStrategy(1, 22.0);
        assertEquals(7.3, result);
    }

    @Test
    public void testTheFirstStrategyTalent_Zero_Point_One() throws Exception {
        double result = theFirstLearnStrategy.studyStrategy(0.1, 22.0);
        Assert.assertEquals(77.3, result);
    }

    @Test
    public void testTheFirstStrategyTalent_Zero_Point_Five() throws Exception {
        double result = theFirstLearnStrategy.studyStrategy(0.5, 22.0);
        Assert.assertEquals(14.6, result);
    }

    @Test
    public void testTheFirstStrategyTalent_Zero_Point_Eight() throws Exception {
        double result = theFirstLearnStrategy.studyStrategy(0.8, 22.0);
        Assert.assertEquals(9.16, result);
    }

}
