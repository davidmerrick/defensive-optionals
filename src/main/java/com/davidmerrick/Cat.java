package com.davidmerrick;

import java.util.Optional;

public class Cat {

    private Optional<LaserVision> laserVisionOptional = Optional.empty();

    public void setLaserVisionOptional(Optional<LaserVision> laserVisionOptional) {
        if(laserVisionOptional == null){
            this.laserVisionOptional = Optional.empty();
        } else {
            this.laserVisionOptional = laserVisionOptional;
        }
    }

    public Optional<LaserVision> getLaserVisionOptional() {
        return laserVisionOptional;
    }
}
