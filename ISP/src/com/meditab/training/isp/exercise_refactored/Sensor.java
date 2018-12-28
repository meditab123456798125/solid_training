package com.meditab.training.isp.exercise;

import java.util.Random;

public class Sensor implements ProximityCallBack
{
    public void register()
    {
        while (true) {
            if (isPersonClose()) {
                proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
