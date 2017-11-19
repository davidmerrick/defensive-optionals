package com.davidmerrick;

import org.testng.annotations.Test;

import java.util.Optional;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class CatTest {

    @Test
    public void initialLaserVisionIsNotNull(){
        Cat cat = new Cat();
        Optional<LaserVision> laserVisionOptional = cat.getLaserVisionOptional();
        assertNotNull(laserVisionOptional);
        assertFalse(laserVisionOptional.isPresent());
    }

    @Test
    public void setLaserVisionToNull(){
        Cat cat = new Cat();
        cat.setLaserVisionOptional(null);
        Optional<LaserVision> laserVisionOptional = cat.getLaserVisionOptional();
        assertNotNull(laserVisionOptional);
        assertFalse(laserVisionOptional.isPresent());
    }

    @Test
    public void setLaserVisionToValue(){
        Cat cat = new Cat();
        LaserVision laserVision = new LaserVision();
        Optional<LaserVision> myLaserVisionOptional = Optional.of(laserVision);
        cat.setLaserVisionOptional(myLaserVisionOptional);
        Optional<LaserVision> laserVisionOptional = cat.getLaserVisionOptional();
        assertNotNull(laserVisionOptional);
        assertTrue(laserVisionOptional.isPresent());
    }
}
