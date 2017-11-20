package com.davidmerrick;

import java.util.Optional;

public class Cat {

    private Optional<LaserVision> laserVisionOptional = Optional.empty();

    public void setLaserVisionOptional(Optional<LaserVision> laserVisionOptional) {
        if(laserVisionOptional != null){
            this.laserVisionOptional = laserVisionOptional;
        }
    }

    public void setLaserVisionOptional(LaserVision laserVision) {
        this.laserVisionOptional = Optional.ofNullable(laserVision);
    }

    public Optional<LaserVision> getLaserVisionOptional() {
        return laserVisionOptional;
    }
}
