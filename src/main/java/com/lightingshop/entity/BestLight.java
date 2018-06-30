package com.lightingshop.entity;

import org.springframework.stereotype.Component;

@Component("bestlight")
public class BestLight {

    private Integer bestLightID;

    private Integer lightID;

    public Integer getBestLightID() {
        return bestLightID;
    }

    public void setBestLightID(Integer bestLightID) {
        this.bestLightID = bestLightID;
    }

    public Integer getLightID() {
        return lightID;
    }

    public void setLightID(Integer lightID) {
        this.lightID = lightID;
    }

    @Override
    public String toString() {
        return "BestLight [bestLightID=" + bestLightID + ", lightID=" + lightID + "]";
    }
}
